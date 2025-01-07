package com.study.reservation.service;

import com.study.reservation.dto.KakaoTokenResponse;
import com.study.reservation.dto.request.KakaoTokenRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * packageName    : com.study.reservation.service
 * fileName       : KakaoService
 * author         : yoons
 * date           : 2025-01-07
 * description    :
 */
@Slf4j
@Service
public class KakaoService {

    @Value("${kakao.client.id}")
    private String clientId;
    @Value("${kakao.client.secret}")
    private String clientSecret;
    @Value("${kakao.grant.type}")
    private String grantType;
    @Value("${kakao.redirect.uri}")
    private String redirectUri;

    public KakaoTokenResponse getUserToken(KakaoTokenRequest request) {
        MultiValueMap<String, String> dataMap = new LinkedMultiValueMap<>();
        dataMap.add("code", request.getCode());
        dataMap.add("client_id", clientId);
        dataMap.add("redirect_url", redirectUri);
        dataMap.add("grant_type", grantType);
        dataMap.add("client_secret", clientSecret);

        // WebClient를 사용한 POST 요청
        KakaoTokenResponse response = WebClient.builder()
                .baseUrl("https://kauth.kakao.com")
                .build()
                .post()
                .uri("/oauth/token")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .bodyValue(dataMap)
                .retrieve()
                .bodyToMono(KakaoTokenResponse.class)
                .block(); // 동기식으로 처리

        return response;
    }
}
