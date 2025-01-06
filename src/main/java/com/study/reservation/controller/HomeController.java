package com.study.reservation.controller;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * packageName    : com.study.reservation.controller
 * fileName       : HomeController
 * author         : yoons
 * date           : 2025-01-06
 * description    :
 */
@Slf4j
@Controller
public class HomeController {
    @GetMapping("/main")
    public String home() {
        log.debug("index 호출");
        return "index"; // index.jsp 반환
    }

    //회원가입화면
    @RequestMapping(value = "/kakao")
    public String kakao(HttpServletRequest request, HttpSession session, Model model) {
        log.debug("kakao");
        return "kakao";
    }
}
