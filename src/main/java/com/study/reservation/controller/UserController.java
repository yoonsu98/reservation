package com.study.reservation.controller;

import com.study.reservation.dto.KakaoTokenResponse;
import com.study.reservation.dto.request.KakaoTokenRequest;
import com.study.reservation.service.KakaoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : com.study.reservation.controller
 * fileName       : UserController
 * author         : yoons
 * date           : 2025-01-07
 * description    : 사용자 관련 컨트롤러
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/user")
public class UserController {
    private final KakaoService kakaoService;

    @PostMapping(value = "token-info")
    public Map<String, Object> getTokenInfo(@RequestBody KakaoTokenRequest request){
        Map<String, Object> dataMap = new HashMap<>();
        KakaoTokenResponse response = kakaoService.getUserToken(request);
        dataMap.put("data", response);
        return dataMap;
    }
}
