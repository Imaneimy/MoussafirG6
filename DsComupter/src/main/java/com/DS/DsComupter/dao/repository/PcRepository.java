package com.DS.DsComupter.dao.repository;

import com.DS.DsComupter.dao.entities.Pc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PcRepository extends JpaRepository<Pc, Long> {
    List<Pc> findByProce(String proce);
    boolean existsByMacAddress(String macAddress);
}
