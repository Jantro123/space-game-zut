package com.space.rtsprototype.gameplay.service.buildings.civilianBuildings;

import com.space.rtsprototype.gameplay.model.buildings.civilianBuildings.MineralMine;
import com.space.rtsprototype.gameplay.repository.BuildingRepository;

public class MineralMineService {
    private BuildingRepository buildingRepository;

    public MineralMineService(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }

    // Method to upgrade the Mineral Mine
    public void upgradeMineralMine(Long mineId, int orderedNumber) {
        MineralMine mine = (MineralMine) buildingRepository.findById(mineId);
        if (mine != null) {
            mine.constructBuilding(orderedNumber);              // Increase level and cost
            mine.applyBuildingConstructionEffect();   // Increase mineral production rate
            mine.consumeElectricity(orderedNumber);
            System.out.println("Number of mineral mines after construction: " + mine.getLevel());
        } else {
            System.out.println("Mineral Mine not found.");
        }
    }

    // Method to get the production rate of the Mineral Mine
    public int getProductionRate(Long mineId) {
        MineralMine mine = (MineralMine) buildingRepository.findById(mineId);
        if (mine != null) {
            return mine.getMineralProductionRate();
        }
        return 0;
    }
}
