package com.example.project.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PostDto {
    @NotBlank(message = "제목을 입력하세요")
    private String title;

    @NotBlank(message = "내용을 입력하세요")
    private String content;

    // 필요에 따라 다른 필드 추가 가능
}
