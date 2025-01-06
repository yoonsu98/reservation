package com.study.reservation.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_log", schema = "reservation")
public class TbLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_no", nullable = false)
    private Integer id;

    @Column(name = "request", nullable = false, length = 100)
    private String request;

    @Column(name = "reg_date", nullable = false)
    private Instant regDate;

    @Column(name = "response", nullable = false, length = 1000)
    private String response;

}