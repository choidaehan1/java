package com.maximum.koreaartschool.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="ADMIN")
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_no", nullable = false)
    private Long admin_no;

    @Column(name = "admin_id", nullable = false, unique = true)
    private String adminID; // Modified property name to match method parameter

    @Column(name = "pswd", nullable = true)
    private String pswd;

    public AdminEntity() {}

    public AdminEntity(String adminID, String pswd) {
        this.adminID = adminID;
        this.pswd = pswd;
    }
}

