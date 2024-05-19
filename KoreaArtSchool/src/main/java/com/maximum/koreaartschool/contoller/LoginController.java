package com.maximum.koreaartschool.contoller;

import com.maximum.koreaartschool.dto.AdminDTO;
import com.maximum.koreaartschool.dto.EvaluatorLoginDTO;
import com.maximum.koreaartschool.service.LoginService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class LoginController {
    // 생성자 주입
    private final LoginService loginService;

    // 로그인 페이지 출력
    @GetMapping("/member/login")
    //@RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginForm() {
        return "login"; // 로그인페이지로 이동
    }

    //@PostMapping("/member/adminLogin")
    /*@RequestMapping(value="/member/login", method=RequestMethod.POST)
    public String login(@ModelAttribute AdminDTO adminDTO, HttpSession session, Model model) {

        System.out.println("LoginDTO = " + adminDTO);
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
            model.addAttribute("msg", "로그인을 실패하였습니다.");
            return "login";
        }

    }*/
    @RequestMapping(value="/member/login", method=RequestMethod.POST)
    public String login(@ModelAttribute EvaluatorLoginDTO evaluatorLoginDTO, AdminDTO adminDTO, HttpSession session, Model model, HttpServletRequest request) {
        String id = request.getParameter("id"); // 화면에서 입력한 id값
        String password = request.getParameter("password"); // 화면에서 입력한 password 값
        System.out.println("id : " +id);
        System.out.println("password : " +password);

        System.out.println("LoginDTO = " + evaluatorLoginDTO);
        System.out.println("AdminDTO = " + adminDTO);

        if( id.indexOf("admin") > -1 ) {    // admin라는 단어가 id에 입력되어 있으면 admin 로그인
            System.out.println("관리자로그인");
            adminDTO.setAdmin_id(id);
            adminDTO.setPswd(password);
            loginService.adminLogin(adminDTO);
            AdminDTO loginResult = loginService.adminLogin(adminDTO);
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
                model.addAttribute("msg", "로그인을 실패하였습니다.");
                return "login";
            }
        } else {    // 평가위원 로그인
            System.out.println("평가위원 로그인");
            evaluatorLoginDTO.setEvlEml(id);
            evaluatorLoginDTO.setPwd(password);
            loginService.evaluatorLogin(evaluatorLoginDTO);
            EvaluatorLoginDTO loginResult = loginService.evaluatorLogin(evaluatorLoginDTO);

            if (loginResult != null) {
                // login 성공
                System.out.println("로그인성공!!!!!");
                session.setAttribute("평가위원id", loginResult.getEvlEml());
                model.addAttribute("msg", "로그인성공");
                return "main";
            } else {
                // login 실패
                System.out.println("로그인실패!!!!!");
                model.addAttribute("msg", "로그인을 실패하였습니다.");
                return "login";
            }
        }


    }
}
