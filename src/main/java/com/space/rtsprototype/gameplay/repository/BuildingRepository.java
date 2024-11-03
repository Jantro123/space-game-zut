package com.space.rtsprototype.gameplay.repository;

import com.space.rtsprototype.gameplay.model.buildings.Building;

import java.util.HashMap;
import java.util.Map;

public class BuildingRepository {
    private Map<Long, Building> buildings = new HashMap<>();
    private Long nextId = 1L;

    public Building findById(Long id) {
        return buildings.get(id);
    }

    public void save(Building building) {
        Long buildingId = building.getId();
        if (building.getId() == null) {
            buildingId = nextId++;
        }
        buildings.put(building.getId(), building);
    }

    public void remove(Long id) {
        buildings.remove(id);
    }

    // Example: Fetch all buildings (regardless of type)
    public Map<Long, Building> findAll() {
        return buildings;
    }
}
