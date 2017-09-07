package com.agrocore.spatial.repository;

import com.agrocore.spatial.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface DriverRepository extends JpaRepository<Driver, Long>{
    Driver findByName(String name);
}
