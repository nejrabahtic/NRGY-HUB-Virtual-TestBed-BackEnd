package com.example.backend.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class MeterModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "ID meter must be provided.")
    private String IDMeter;
    @NotNull(message = "Field must be provided.")
    private String field;
    @NotNull(message = "Connection must be provided.")
    private Integer connection;
    @NotNull(message = "Delivery point must be provided.")
    private Integer deliveryPoint;
    @NotNull(message = "Effect energy must be provided.")
    private Integer effectEnergy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIDMeter() {
        return IDMeter;
    }

    public void setIDMeter(String IDMeter) {
        this.IDMeter = IDMeter;
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

    public MeterModel() {
    }

    public MeterModel(String IDMeter, String field, Integer connection, Integer deliveryPoint, Integer effectEnergy) {
        this.IDMeter = IDMeter;
        this.field = field;
        this.connection = connection;
        this.deliveryPoint = deliveryPoint;
        this.effectEnergy = effectEnergy;
    }
}
