package com.example.backend.Models;

import javax.validation.constraints.NotNull;

import javax.persistence.*;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Name must be provided.")
    private String name;
    @NotNull(message = "Email must be provided.")
    private String email;
    @NotNull(message = "Password must be provided.")
    private String password;
    @NotNull(message = "Address must be provided.")
    private String address;
    @NotNull(message = "User type must be provided.")
    private String type;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserModel() {
    }

    public UserModel(String name, String email, String password, String address, String type) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.type = type;
    }
}
