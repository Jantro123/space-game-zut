package com.space.rtsprototype.gameplay.model.buildings;

public abstract class Building {

    protected Long id;
    protected String name;
    protected int quantity;
    protected int mineralCost;
    protected int fuelCost;
    protected int electricityUsage;
    protected int buildTime;

    public Building(Long id, String name, int quantity, int mineralCost, int fuelCost, int electricityUsage, int buildTime) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.mineralCost = mineralCost;
        this.fuelCost = fuelCost;
        this.electricityUsage = electricityUsage;
        this.buildTime = buildTime;
    }

    public void constructBuilding(int orderedNumber) {
        this.quantity += orderedNumber;
        this.buildTime *= orderedNumber;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMineralCost() {
        return mineralCost;
    }

    public int getFuelCost() {
        return fuelCost;
    }

    public int getElectricityUsage() {
        return electricityUsage;
    }

    public int getBuildTime() {
        return buildTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMineralCost(int mineralCost) {
        this.mineralCost = mineralCost;
    }

    public void setFuelCost(int fuelCost) {
        this.fuelCost = fuelCost;
    }

    public void setElectricityUsage(int electricityUsage) {
        this.electricityUsage = electricityUsage;
    }

    public void setBuildTime(int buildTime) {
        this.buildTime = buildTime;
    }
}
