package com.dasboot.repository;

import com.dasboot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipwreckRepository extends JpaRepository<Shipwreck,Long> {
}