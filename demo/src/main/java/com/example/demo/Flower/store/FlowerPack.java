package com.example.demo.Flower.store;

import lombok.ToString;

@ToString
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public Flower getFlower() {
        return flower;
    }

    public double getPrice() {
        return this.amount * this.flower.getPrice();
    }
}
