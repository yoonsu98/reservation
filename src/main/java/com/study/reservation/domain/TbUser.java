package com.study.reservation.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_user", schema = "reservation")
public class TbUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no", nullable = false)
    private Integer id;

    @Column(name = "user_nm", nullable = false, length = 20)
    private String userNm;

    @Column(name = "kakao_id", nullable = false, length = 20)
    private String kakaoId;

    @Column(name = "is_user")
    private Boolean isUser;

    @Column(name = "refresh_token", nullable = false, length = 100)
    private String refreshToken;

    @Column(name = "reg_date", nullable = false)
    private Instant regDate;

    @Column(name = "update_date")
    private Instant updateDate;

}