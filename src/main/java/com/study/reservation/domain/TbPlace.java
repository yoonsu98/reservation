package com.study.reservation.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_place", schema = "reservation")
public class TbPlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_no", nullable = false)
    private Integer id;

    @Column(name = "place_nm", nullable = false, length = 100)
    private String placeNm;

    @Column(name = "use_yn", nullable = false)
    private Boolean useYn = false;

    @Column(name = "reg_date", nullable = false)
    private Instant regDate;

    @Column(name = "update_date")
    private Instant updateDate;

}