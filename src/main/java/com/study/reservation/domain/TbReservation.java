package com.study.reservation.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tb_reservation", schema = "reservation")
public class TbReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_no", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "place_no", nullable = false)
    private TbPlace placeNo;

    @Column(name = "base_ymd", nullable = false)
    private LocalDate baseYmd;

    @Column(name = "use_yn", nullable = false)
    private Boolean useYn = false;

    @Column(name = "reg_date", nullable = false)
    private Instant regDate;

    @Column(name = "update_date")
    private Instant updateDate;

}