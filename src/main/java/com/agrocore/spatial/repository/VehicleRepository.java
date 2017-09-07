package com.agrocore.spatial.repository;

import com.agrocore.spatial.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    Vehicle findByName(String name);
}
