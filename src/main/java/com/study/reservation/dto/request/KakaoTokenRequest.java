package com.study.reservation.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * packageName    : com.study.reservation.dto.request
 * fileName       : KakaoTokenRequest
 * author         : yoons
 * date           : 2025-01-07
 * description    :
 */
@Getter
@Setter
@NoArgsConstructor
public class KakaoTokenRequest {
    private String code;
}
