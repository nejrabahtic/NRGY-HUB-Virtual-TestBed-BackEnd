package com.example.backend.Models;

import javax.validation.constraints.NotNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull(message = "Name must be provided.")
    @Column(name = "name")
    private String name;

    @NotNull(message = "Email must be provided.")
    @Column(name = "email")
    private String email;

    @NotNull(message = "Password must be provided.")
    @Column(name = "password")
    private String password;

    @NotNull(message = "Address must be provided.")
    @Column(name = "address")
    private String address;

    @NotNull(message = "User type must be provided.")
    @Column(name = "type")
    private String type;

    @NotNull(message = "Latitude must be provided.")
    @Column(name = "lat")
    private Float lat;

    @NotNull(message = "Longitude must be provided.")
    @Column(name = "lon")
    private Float lon;

    @Column(name = "heatCompany")
    private Boolean heatCompany;

    @Column(name = "elecCompany")
    private Boolean elecCompany;

    @Column(name = "admin")
    private Boolean admin;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private CompanyModel company;

    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "meter_id", referencedColumnName = "id")
    private MeterModel meter;*/

    /*@ManyToMany(mappedBy = "users", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<MeterModel> meters = new HashSet<>();*/

    @OneToMany(mappedBy="user")
    private Set<MeterModel> meters;

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

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Boolean getHeatCompany() {
        return heatCompany;
    }

    public void setHeatCompany(Boolean heatCompany) {
        this.heatCompany = heatCompany;
    }

    public Boolean getElecCompany() {
        return elecCompany;
    }

    public void setElecCompany(Boolean elecCompany) {
        this.elecCompany = elecCompany;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public UserModel(){

    }

    public UserModel(@NotNull(message = "Name must be provided.") String name, @NotNull(message = "Email must be provided.") String email, @NotNull(message = "Password must be provided.") String password, @NotNull(message = "Address must be provided.") String address, @NotNull(message = "User type must be provided.") String type, @NotNull(message = "Latitude must be provided.") Float lat, @NotNull(message = "Longitude must be provided.") Float lon, Boolean heatCompany, Boolean elecCompany, Boolean admin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.type = type;
        this.lat = lat;
        this.lon = lon;
        this.heatCompany = heatCompany;
        this.elecCompany = elecCompany;
        this.admin = admin;
    }
}
