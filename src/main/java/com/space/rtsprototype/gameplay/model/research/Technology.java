package com.space.rtsprototype.gameplay.model.research;

public abstract class Technology {
    private Long id;
    private String name;
    private String description;
    private Long mineralCost;
    private Long fuelCost;
    private Long techLevel;

    public Technology(Long id, String name, String description, Long mineralCost, Long fuelCost, Long techLevel) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.mineralCost = mineralCost;
        this.fuelCost = fuelCost;
        this.techLevel = techLevel;
    }
}
