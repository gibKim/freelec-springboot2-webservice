package com.jojoldu.book.springboot.web.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
