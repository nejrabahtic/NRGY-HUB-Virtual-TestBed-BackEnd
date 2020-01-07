package com.example.backend.Models;

import javax.validation.constraints.NotNull;

import javax.persistence.*;

@Entity
public class CompanyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Name must be provided.")
    private String name;
    @NotNull(message = "Address must be provided.")
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CompanyModel() {
    }

    public CompanyModel(@NotNull(message = "Name must be provided.") String name, @NotNull(message = "Address must be provided.") String address) {
        this.name = name;
        this.address = address;
    }
}
