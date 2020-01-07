package com.example.backend.Controllers;

import com.example.backend.Models.UserTypeModel;
import com.example.backend.Repositories.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/usertype")
public class UserTypeController {
    @Autowired
    private UserTypeRepository userTypeRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addUserType(@RequestBody UserTypeModel userTypeModel) {

        if (userTypeModel == null)
            return "Null cannot be saved!";
        userTypeRepository.save(userTypeModel);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<UserTypeModel> getAllUserTypes() {
        return userTypeRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Optional<UserTypeModel> getUserTypeById(@PathVariable Integer id){
        return userTypeRepository.findById(id);
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody String deleteUserTypeById(@PathVariable Integer id){
        if (id == null)
            return "Id cannot be null!";
        userTypeRepository.deleteById(id);
        return "Deleted";
    }
}
