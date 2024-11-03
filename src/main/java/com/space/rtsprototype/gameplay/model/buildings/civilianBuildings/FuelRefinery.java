package com.space.rtsprototype.gameplay.model.buildings.civilianBuildings;

import com.space.rtsprototype.gameplay.model.buildings.Building;

public class FuelRefinery extends CivilianBuilding {

    private int fuelRefiningRate;

    public FuelRefinery(Long id, String name, int quantity, int mineralCost, int fuelCost, int electricityUsage, int buildTime) {
        super(id, name, quantity, mineralCost, fuelCost, electricityUsage, buildTime);
        this.fuelRefiningRate = fuelRefiningRate;
    }

    @Override
    public void applyBuildingConstructionEffect() {
        this.fuelRefiningRate += quantity * 1500;
    }

    public int getLevel() {
        return quantity;
    }

    public int getFuelProductionRate() {
        return fuelRefiningRate;
    }

}
