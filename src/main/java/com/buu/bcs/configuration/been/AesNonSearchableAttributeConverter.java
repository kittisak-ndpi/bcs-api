package com.buu.bcs.configuration.been;

import java.nio.charset.StandardCharsets;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.jasypt.util.binary.AES256BinaryEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Converter
@Component
@ConditionalOnExpression(value = "'${app.secret.encryption.password}' matches '[0-9A-z]+(.*)'")
public class AesNonSearchableAttributeConverter implements AttributeConverter<String, String> {

    private static AES256BinaryEncryptor aes256BinaryEncryptor = new AES256BinaryEncryptor();

    @Autowired
    public void setPassword(@Value("${app.secret.encryption.password}") String password) {
        AesNonSearchableAttributeConverter.aes256BinaryEncryptor.setPassword(password);
    }

    @Override
    public String convertToDatabaseColumn(String attribute) {
        if (attribute == null) {
            return null;
        }
        byte[] encrypted = AesNonSearchableAttributeConverter.aes256BinaryEncryptor
                .encrypt(attribute.getBytes(StandardCharsets.UTF_8));
        return new String(encrypted, StandardCharsets.ISO_8859_1);
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }
        byte[] decrypted = AesNonSearchableAttributeConverter.aes256BinaryEncryptor
                .decrypt(dbData.getBytes(StandardCharsets.ISO_8859_1));
        return new String(decrypted, StandardCharsets.UTF_8);
    }

}
