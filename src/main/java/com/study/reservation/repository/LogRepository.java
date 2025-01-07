package com.study.reservation.repository;

import com.study.reservation.domain.TbLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName    : com.study.reservation.repository
 * fileName       : LogRepository
 * author         : yoons
 * date           : 2025-01-07
 * description    :
 */
@Repository
public interface LogRepository extends JpaRepository<TbLog, Integer> {
}
