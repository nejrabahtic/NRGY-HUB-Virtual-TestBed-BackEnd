package com.example.backend.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "meter")
public class MeterModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull(message = "Name must be provided.")
    @Column(name = "name")
    private String NameMeter;

    @NotNull(message = "Field must be provided.")
    @Column(name = "field")
    private String field;

    @NotNull(message = "Connection must be provided.")
    @Column(name = "connection")
    private Integer connection;

    @NotNull(message = "Delivery point must be provided.")
    @Column(name = "deliveryPoint")
    private Integer deliveryPoint;

    @NotNull(message = "Effect energy must be provided.")
    @Column(name = "effectEnergy")
    private Integer effectEnergy;

    @NotNull(message = "Latitude must be provided.")
    @Column(name = "lat")
    private Float lat;

    @NotNull(message = "Longitude must be provided.")
    @Column(name = "lon")
    private Float lon;

    @OneToOne(mappedBy = "meter")
    private UserModel user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameMeter() {
        return NameMeter;
    }

    public void setNameMeter(String nameMeter) {
        NameMeter = nameMeter;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Integer getConnection() {
        return connection;
    }

    public void setConnection(Integer connection) {
        this.connection = connection;
    }

    public Integer getDeliveryPoint() {
        return deliveryPoint;
    }

    public void setDeliveryPoint(Integer deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public Integer getEffectEnergy() {
        return effectEnergy;
    }

    public void setEffectEnergy(Integer effectEnergy) {
        this.effectEnergy = effectEnergy;
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

    public MeterModel() {
    }

    public MeterModel(@NotNull(message = "Name must be provided.") String nameMeter, @NotNull(message = "Field must be provided.") String field, @NotNull(message = "Connection must be provided.") Integer connection, @NotNull(message = "Delivery point must be provided.") Integer deliveryPoint, @NotNull(message = "Effect energy must be provided.") Integer effectEnergy, @NotNull(message = "Latitude must be provided.") Float lat, @NotNull(message = "Longitude must be provided.") Float lon) {
        NameMeter = nameMeter;
        this.field = field;
        this.connection = connection;
        this.deliveryPoint = deliveryPoint;
        this.effectEnergy = effectEnergy;
        this.lat = lat;
        this.lon = lon;
    }
}
