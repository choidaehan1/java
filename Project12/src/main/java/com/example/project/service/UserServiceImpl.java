package com.example.project.service;

import com.example.project.dto.UserDto;
import com.example.project.entity.User;
import com.example.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User saveEntity(UserDto userDto) {
        String hashedPassword = hashPassword(userDto.getUserPw());

        User user = User.builder()
                .userId(userDto.getUserId())
                .userName(userDto.getUserName())
                .userPw(hashedPassword)
                .userBirthdate(userDto.getUserBirthdate())
                .userEmail(userDto.getUserEmail())
                .build();
        return userRepository.save(user);
    }

    @Override
    public boolean login(String userId, String userPw) {
        Optional<User> userOptional = userRepository.findByUserId(userId);
        if (!userOptional.isPresent()) {
            return false;
        }
        User user = userOptional.get();
        return verifyPassword(userPw, user.getUserPw());
    }

    private String hashPassword(String password) {
        // 실제 해싱 로직을 구현해야 합니다.
        return password;
    }

    private boolean verifyPassword(String rawPassword, String hashedPassword) {
        // 실제 비밀번호 확인 로직을 구현해야 합니다.
        return rawPassword.equals(hashedPassword);
    }
}
