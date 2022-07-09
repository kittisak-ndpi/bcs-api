package com.buu.bcs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.stream.Collectors;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor(access = AccessLevel.NONE)
public class StandardRequest {
    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Page<T> {
        @Min(value = 1, message = "'pageNum' must greater than or equals to 1")
        @JsonProperty("pageNum")
        @Builder.Default
        private int pageNum = 1;

        @Min(value = 1, message = "'pageSize' must greater than or equals to 1")
        @JsonProperty("pageSize")
        @Builder.Default
        private int pageSize = 1;

        @JsonProperty("search")
        private T search;

        @JsonProperty("order")
        private List<Order> order;

        public Pageable createPageable() {
            if (order == null)
                return PageRequest.of(pageNum - 1, pageSize);
            else
                return PageRequest.of(pageNum - 1, pageSize, Sort.by(order.stream().map(o -> {
                    if (o.asc)
                        return Sort.Order.asc(o.getName());
                    else
                        return Sort.Order.desc(o.getName());
                }).collect(Collectors.toList())));
        }

        public Page<T> nextPage() {
            return new Page<T>(this.pageNum + 1, this.pageSize, this.search, this.order);
        }
    }

    @Getter
    @Setter
    public static class Order {
        @NotBlank(message = "'name' is mandatory")
        @JsonProperty("name")
        private String name;

        @JsonProperty("asc")
        private boolean asc = true;

    }
}
