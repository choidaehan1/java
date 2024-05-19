package com.maximum.koreaartschool.contoller;

import com.maximum.koreaartschool.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class FindPasswordController {
    // 생성자 주입
    private final LoginService loginService;

    // 아이디 찾기 화면 출력
    @GetMapping("/member/findPassword")
    public String findPasswordForm() {
        return "findPassword"; // 로그인페이지로 이동
    }

    /*@PostMapping("/member/login")
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

    }*/
}
