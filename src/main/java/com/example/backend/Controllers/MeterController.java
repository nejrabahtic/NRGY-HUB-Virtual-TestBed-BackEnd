package com.example.backend.Controllers;

import com.example.backend.Models.MeterModel;
import com.example.backend.Repositories.MeterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8000")
@Controller
@RequestMapping(path="/meter")
public class MeterController {
    @Autowired
    private MeterRepository meterRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addMeter(@RequestBody MeterModel meterModel) {

        if (meterModel == null)
            return "Null cannot be saved!";
        meterRepository.save(meterModel);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<MeterModel> getAllMeters() {
        return meterRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody
    Optional<MeterModel> getMeterById(@PathVariable Integer id){
        return meterRepository.findById(id);
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody String deleteMeterById(@PathVariable Integer id){
        if (id == null)
            return "Id cannot be null!";
        meterRepository.deleteById(id);
        return "Deleted";
    }
}
