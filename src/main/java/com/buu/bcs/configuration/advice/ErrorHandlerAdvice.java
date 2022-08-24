package com.buu.bcs.configuration.advice;

import com.buu.bcs.dto.StandardResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
@ControllerAdvice
@ConditionalOnProperty(value = "app.error-handler.default", matchIfMissing = true)
public class ErrorHandlerAdvice {
    private static Logger logger = LogManager.getLogger(ErrorHandlerAdvice.class);

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public StandardResponse<String> handleBindException(BindException ex) {
        return this.createBindingResultResponse(ex.getBindingResult());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public StandardResponse<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        return this.createBindingResultResponse(ex.getBindingResult());
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseBody
    public StandardResponse<String> handleMissingServletRequestParameterException(
            MissingServletRequestParameterException e) {
        return StandardResponse.fail(HttpStatus.BAD_REQUEST, String.format("'%s' is mandatory", e.getParameterName()));
    }

    @ExceptionHandler(MissingServletRequestPartException.class)
    @ResponseBody
    public StandardResponse<String> handleMissingServletRequestPartException(MissingServletRequestPartException e) {
        return StandardResponse.fail(HttpStatus.BAD_REQUEST,
                String.format("'%s' part is mandatory", e.getRequestPartName()));
    }

    @ExceptionHandler(MissingRequestHeaderException.class)
    @ResponseBody
    public StandardResponse<String> handleMMissingRequestHeaderException(MissingRequestHeaderException e) {
        return StandardResponse.fail(HttpStatus.BAD_REQUEST,
                String.format("'%s' header is mandatory", e.getHeaderName()));
    }

    @ExceptionHandler(AccessDeniedException.class)
    public void accessDeniedException(AccessDeniedException e) throws AccessDeniedException {
        //This exception occurs when use-auth-filter is enabled, which also has handling mechanism.
        //So, we rethrow exception and let it handle instead
        throw e;
    }

    private StandardResponse<String> createBindingResultResponse(BindingResult result) {
        String errorMessage = result.getFieldErrors().stream()
                .map(err -> err.getField() + " : " + err.getDefaultMessage())
                .reduce("", (msg, currentMsg) -> msg + "\n\n" + currentMsg).trim();
        errorMessage = result.getGlobalErrors().stream()
                .map(err -> err.getObjectName() + " : " + err.getDefaultMessage())
                .reduce(errorMessage, (msg, currentMsg) -> msg + "\n\n" + currentMsg).trim();
        return StandardResponse.fail(HttpStatus.BAD_REQUEST, errorMessage);
    }

}
