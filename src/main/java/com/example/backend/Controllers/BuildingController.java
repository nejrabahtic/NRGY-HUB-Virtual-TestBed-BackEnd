package com.example.backend.Controllers;

import com.example.backend.Models.BuildingModel;
import com.example.backend.Repositories.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/building")
public class BuildingController {
    @Autowired
    private BuildingRepository buildingRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addBuilding(@RequestBody BuildingModel buildingModel) {

        if (buildingModel == null)
            return "Null cannot be saved!";
        buildingRepository.save(buildingModel);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<BuildingModel> getAllBuildings() {
        return buildingRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody
    Optional<BuildingModel> getBuildingById(@PathVariable Integer id){
        return buildingRepository.findById(id);
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody String deleteBuildingById(@PathVariable Integer id){
        if (id == null)
            return "Id cannot be null!";
        buildingRepository.deleteById(id);
        return "Deleted";
    }
}
