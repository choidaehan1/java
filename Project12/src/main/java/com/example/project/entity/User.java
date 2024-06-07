package com.example.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_num")
    private Long userNum;

    @Column(name = "user_id", nullable = false, length = 20)
    private String userId;

    @Column(name = "user_name", nullable = false, length = 20)
    private String userName;

    @Column(name = "user_pw", nullable = false, length = 256)
    private String userPw;

    @Column(name = "user_birthdate")
    private LocalDate userBirthdate;

    @Column(name = "user_email", nullable = false, length = 100)
    private String userEmail;

    public String getUserPw() {
        return this.userPw;
    }

    // Getter 및 Setter 메서드 생략
}
