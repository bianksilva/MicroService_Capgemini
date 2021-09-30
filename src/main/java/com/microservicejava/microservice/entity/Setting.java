package com.microservicejava.microservice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SETTING")
public class Setting {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "STATUS", nullable = false)
    private Boolean status;

    @Column(name = "CRIATED_IN")
    private Date created_in;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreated_in() {
        return created_in;
    }

    public void setCreated_in(Date created_in) {
        this.created_in = created_in;
    }

    
}
