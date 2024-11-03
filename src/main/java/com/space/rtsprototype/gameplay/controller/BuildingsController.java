package com.space.rtsprototype.gameplay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/space/buildings/")
public class BuildingsController {

    @GetMapping("civilianbuildings")
    public String test() {
        return "To jest test";
    }

    @GetMapping("defensivebuildings")
    public String test2() {
        return "To jest test";
    }

    @GetMapping("militarybuildings")
    public String tes3() {
        return "To jest test";
    }
}
