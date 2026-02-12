package org.lab1.parcel;

import org.lab1.shared.CRUDObject;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Parcel extends CRUDObject
{
    private Long courierId;

    protected Long getCourierId() {
        return courierId;
    }
    protected void setCourierId(Long courierId) {
        this.courierId = courierId;
    }

    private double deliveryDistanceKm;

    public double getDeliveryDistanceKm() {
        return deliveryDistanceKm;
    }
    public void setDeliveryDistanceKm(double deliveryDistanceKm) {
        this.deliveryDistanceKm = deliveryDistanceKm;
    }

    private final int weightKg;

    public int getWeightKg() {
        return weightKg;
    }

    private Status status;

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
        // TODO: switch

        switch (status) {
            case DELIVERED -> {
                tsOfDelivery = Timestamp.valueOf(LocalDateTime.now());
            }
        }

        this.setStatus(status);
    }

    private Timestamp tsOfDelivery;

    public Timestamp getTsOfDelivery() {return this.tsOfDelivery;}

    public Parcel(int weightKg, double deliveryDistanceKm)
    {
        this.weightKg = weightKg;
        this.deliveryDistanceKm = deliveryDistanceKm;
    }
}
