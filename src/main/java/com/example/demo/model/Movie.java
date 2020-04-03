package com.example.demo.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    @Generated("id")
    private Integer id;

    private String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
