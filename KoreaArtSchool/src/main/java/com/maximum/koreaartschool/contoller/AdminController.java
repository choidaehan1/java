package com.maximum.koreaartschool.contoller;

import com.maximum.koreaartschool.dto.AdminDTO;
import com.maximum.koreaartschool.service.AdminService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.swing.plaf.synth.SynthScrollBarUI;

@Controller
@RequiredArgsConstructor
public class AdminController {
    // 생성자 주입
    private final AdminService adminService;

    // 로그인 페이지 출력
    @GetMapping("/member/login")
    public String loginForm() {
        return "login"; // 로그인페이지로 이동
    }

    @PostMapping("/member/login")
    public String login(@ModelAttribute AdminDTO adminDTO, HttpSession session, Model model) {
    System.out.println("MemberController.login");
    System.out.println("AdminDTO = " + adminDTO);
    adminService.login(adminDTO);
    AdminDTO loginResult = adminService.login(adminDTO);
    if (loginResult != null) {
        // login 성공
        System.out.println("로그인성공!!!!!");
        session.setAttribute("admin_id", loginResult.getAdmin_id());
        session.setAttribute("admin_name", "최대한_관리자");
        model.addAttribute("msg", "로그인성공");
        return "main";
    } else {
        // login 실패
        System.out.println("로그인실패!!!!!");
        return "login";
    }

    }
}
