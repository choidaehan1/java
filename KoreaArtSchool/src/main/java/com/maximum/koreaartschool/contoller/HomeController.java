package com.maximum.koreaartschool.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 기본페이지 요청 메서드
    @GetMapping("/")
    public String index() {
        // index 페이지 -> 로그인 버튼 클릭 -> 로그인 화면으로 이동갈 때
        return "index";     //  templates 폴더의 index.html을 찾아감
        // 로그인 화면으로 바로 이동
        //return "login";
    }
}
