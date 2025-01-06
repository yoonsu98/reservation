package com.study.reservation.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_time", schema = "reservation")
public class TbTime {
    @Id
    @Column(name = "time_no", nullable = false)
    private Integer id;

    @Column(name = "time_from", nullable = false)
    private Integer timeFrom;

    @Column(name = "time_to", nullable = false)
    private Integer timeTo;

    @Column(name = "use_yn", nullable = false)
    private Boolean useYn = false;

    @Column(name = "reg_date", nullable = false)
    private Instant regDate;

    @Column(name = "update_date")
    private Instant updateDate;

}