package com.space.rtsprototype.gameplay.controller;

import com.space.rtsprototype.gameplay.service.buildings.civilianBuildings.MineralMineService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/space/rts/")
public class CivilianBuildingsController {

    private final MineralMineService mineralMineService;

    public CivilianBuildingsController(MineralMineService mineralMineService) {
        this.mineralMineService = mineralMineService;
    }

    // Endpoint to upgrade the Mineral Mine
    @PostMapping("/{mineId}/upgrade")
    public String upgradeMineralMine(@PathVariable Long mineId, int orderedNumber) {
        mineralMineService.upgradeMineralMine(mineId, orderedNumber);
        return "Mineral Mine upgraded.";
    }

    // Endpoint to get current production rate of the Mineral Mine
    @GetMapping("/{mineId}/production-rate")
    public String getProductionRate(@PathVariable Long mineId) {
        int productionRate = mineralMineService.getProductionRate(mineId);
        return "Current Mineral Production Rate: " + productionRate + " per hour.";
    }

}
