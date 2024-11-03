package com.space.rtsprototype.gameplay.model.buildings.civilianBuildings;

import com.space.rtsprototype.gameplay.config.BuildingsConfiguration;

public class MineralMine extends CivilianBuilding {

    private int mineralMiningRate;

    public MineralMine(Long id, String name, int quantity, int mineralCost, int fuelCost, int electricityUsage, int buildTime) {
        super(id, name, quantity, mineralCost, fuelCost, electricityUsage, buildTime);
        this.mineralMiningRate = mineralMiningRate;
    }

    @Override
    public void constructBuilding(int orderedNumber) {
        this.quantity += orderedNumber;

    }

    @Override
    public void applyBuildingConstructionEffect() {
        this.mineralMiningRate += quantity * BuildingsConfiguration.SINGLE_MINERAL_MINE_RATE;
    }

    public int getLevel() {
        return quantity;
    }

    public int getMineralProductionRate() {
        return mineralMiningRate;
    }

    public void consumeElectricity(int orderedNumber) {
        this.electricityUsage += orderedNumber * BuildingsConfiguration.SINGLE_MINERAL_MINE_ELECTRICITY_USAGE;
    }
}
