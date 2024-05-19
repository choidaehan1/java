package com.maximum.koreaartschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.maximum.KoreaArtSchool.entity") // 엔티티 클래스가 위치한 패키지 경로로 수정

public class KoreaArtSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(KoreaArtSchoolApplication.class, args);
	}

}
