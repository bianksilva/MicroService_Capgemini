package com.microservicejava.microservice.job;

import java.util.Date;

import com.microservicejava.microservice.entity.Setting;
import com.microservicejava.microservice.repository.SettingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobMicroservice {

    @Autowired
    private SettingRepository repository;

    @Scheduled(cron = "*/10 * * * * *")
    public void execute(){
        Setting setting = new Setting();
        setting.setCreated_in(new Date());
        setting.setStatus(Boolean.FALSE);

        repository.save(setting);
    }
}
