package com.example.oracle_grabber6.repository;

import com.example.oracle_grabber6.model.TrDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DeviceOracleRepository extends JpaRepository<TrDevice, Long> {
}
