package com.microservicejava.microservice.repository;

import com.microservicejava.microservice.entity.Setting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingRepository extends JpaRepository<Setting, Long>{
    
}
