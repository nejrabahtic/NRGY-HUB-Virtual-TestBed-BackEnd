package com.example.nrgy.Collections;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class NRGYDataCollection {
    private String field;
    private Integer id;
    private Integer connection;
    private String deliveryPoint;
    private Integer type;
    private Date connectionDate;
    private Integer numberOfTheCounter;
    private Integer ean;
    private Integer networkType;
    private String fare;
    private double yearlySpentEnergy;
    private double effectEnergy;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConnection() {
        return connection;
    }

    public void setConnection(Integer connection) {
        this.connection = connection;
    }

    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    public void setDeliveryPoint(String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getConnectionDate() {
        return connectionDate;
    }

    public void setConnectionDate(Date connectionDate) {
        this.connectionDate = connectionDate;
    }

    public Integer getNumberOfTheCounter() {
        return numberOfTheCounter;
    }

    public void setNumberOfTheCounter(Integer numberOfTheCounter) {
        this.numberOfTheCounter = numberOfTheCounter;
    }

    public Integer getEan() {
        return ean;
    }

    public void setEan(Integer ean) {
        this.ean = ean;
    }

    public Integer getNetworkType() {
        return networkType;
    }

    public void setNetworkType(Integer networkType) {
        this.networkType = networkType;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public double getYearlySpentEnergy() {
        return yearlySpentEnergy;
    }

    public void setYearlySpentEnergy(double yearlySpentEnergy) {
        this.yearlySpentEnergy = yearlySpentEnergy;
    }

    public double getEffectEnergy() {
        return effectEnergy;
    }

    public void setEffectEnergy(double effectEnergy) {
        this.effectEnergy = effectEnergy;
    }

    public NRGYDataCollection(String field, Integer id, Integer connection, String deliveryPoint,
                              Integer type, Date connectionDate, Integer numberOfTheCounter, Integer ean,
                              Integer networkType, String fare, double yearlySpentEnergy, double effectEnergy) {
        this.field = field;
        this.id = id;
        this.connection = connection;
        this.deliveryPoint = deliveryPoint;
        this.type = type;
        this.connectionDate = connectionDate;
        this.numberOfTheCounter = numberOfTheCounter;
        this.ean = ean;
        this.networkType = networkType;
        this.fare = fare;
        this.yearlySpentEnergy = yearlySpentEnergy;
        this.effectEnergy = effectEnergy;
    }

    public NRGYDataCollection(){}
}
