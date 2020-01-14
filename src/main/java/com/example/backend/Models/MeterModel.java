package com.example.backend.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "meter")
public class MeterModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /*@NotNull(message = "Name must be provided.")
    @Column(name = "name")
    private String NameMeter;*/

    @NotNull(message = "Field must be provided.")
    @Column(name = "field")
    private String field;

    /*@NotNull(message = "Connection must be provided.")
    @Column(name = "connection")
    private Integer connection;

    @NotNull(message = "Delivery point must be provided.")
    @Column(name = "deliveryPoint")
    private Integer deliveryPoint;

    @NotNull(message = "Effect energy must be provided.")
    @Column(name = "effectEnergy")
    private Integer effectEnergy;*/

    @NotNull(message = "Latitude must be provided.")
    @Column(name = "lat")
    private Float lat;

    @NotNull(message = "Longitude must be provided.")
    @Column(name = "lon")
    private Float lon;

    @NotNull(message = "Address must be provided.")
    @Column(name = "address")
    private String address;

    @NotNull(message = "Heat must be provided.")
    @Column(name = "heat")
    private Float heat;

    @NotNull(message = "Elec must be provided.")
    @Column(name = "elect")
    private Float elect;

    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserModel user;*/

    /*@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "Meter_Users",
            joinColumns = {@JoinColumn(name = "meter_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")}
    )
    private Set<UserModel> users = new HashSet<>();*/

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserModel user;

    @ManyToOne
    @JoinColumn(name="company_id")
    private CompanyModel company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getHeat() {
        return heat;
    }

    public void setHeat(Float heat) {
        this.heat = heat;
    }

    public Float getElect() {
        return elect;
    }

    public void setElect(Float elect) {
        this.elect = elect;
    }

    public UserModel getUser() {
        return user;
    }

    public CompanyModel getCompanyModel() {
        return company;
    }

    public MeterModel() {
    }

    public MeterModel(@NotNull(message = "Field must be provided.") String field, @NotNull(message = "Latitude must be provided.") Float lat, @NotNull(message = "Longitude must be provided.") Float lon, @NotNull(message = "Address must be provided.") String address, @NotNull(message = "Heat must be provided.") Float heat, @NotNull(message = "Elec must be provided.") Float elect) {
        this.field = field;
        this.lat = lat;
        this.lon = lon;
        this.address = address;
        this.heat = heat;
        this.elect = elect;
    }
}
