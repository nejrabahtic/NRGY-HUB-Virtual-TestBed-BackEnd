package com.example.backend.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="building")
public class BuildingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Name must be provided.")
    @Column(name = "name")
    private String name;

    @NotNull(message = "Address must be provided.")
    @Column(name = "address")
    private  String address;

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

    public BuildingModel() {
    }

    public BuildingModel(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
