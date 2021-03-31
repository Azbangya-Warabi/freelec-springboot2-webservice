package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor // final로 선언된 인자들을 패러매터로 받는 생성자를 생성
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
