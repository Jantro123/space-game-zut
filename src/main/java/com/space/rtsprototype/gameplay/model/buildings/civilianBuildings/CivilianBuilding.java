package com.space.rtsprototype.gameplay.model.buildings.civilianBuildings;

import com.space.rtsprototype.gameplay.model.buildings.Building;

public abstract class CivilianBuilding extends Building {

    public CivilianBuilding(Long id, String name, int quantity, int mineralCost, int fuelCost, int electricityUsage, int buildTime) {
        super(id, name, quantity, mineralCost, fuelCost, electricityUsage, buildTime);
    }

    public abstract void applyBuildingConstructionEffect();
}
