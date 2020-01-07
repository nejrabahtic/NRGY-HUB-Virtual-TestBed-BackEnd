package com.example.backend.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class UserTypeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "User type must be provided.")
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserTypeModel() {
    }

    public UserTypeModel(String type) {
        this.type = type;
    }
}
