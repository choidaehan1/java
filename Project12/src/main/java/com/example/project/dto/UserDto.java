// UserDto.java

package com.example.project.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class UserDto {
    @NotBlank(message = "아이디를 입력하세요")
    private String userId;

    @NotBlank(message = "이름을 입력하세요")
    private String userName;

    @NotBlank(message = "비밀번호를 입력하세요")
    private String userPw;

    @NotNull(message = "생년월일을 입력하세요")
    private LocalDate userBirthdate;

    @Email(message = "이메일 형식이어야 합니다")
    @NotBlank(message = "이메일을 입력하세요")
    private String userEmail;
}
