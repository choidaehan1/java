// UserService.java

package com.example.project.service;

import com.example.project.dto.UserDto;
import com.example.project.entity.User;

public interface UserService {
    User saveEntity(UserDto userDto);
    boolean login(String userId, String userPw); // userId의 타입을 String으로 수정
}
