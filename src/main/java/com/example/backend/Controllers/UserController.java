package com.example.backend.Controllers;

import com.example.backend.Models.UserModel;
import com.example.backend.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addUser(@RequestBody UserModel userModel) {

        if (userModel == null)
            return "Null cannot be saved!";
        userRepository.save(userModel);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Optional<UserModel> getUserById(@PathVariable Integer id){
        return userRepository.findById(id);
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody String deleteUserById(@PathVariable Integer id){
        if (id == null)
            return "Id cannot be null!";
        userRepository.deleteById(id);
        return "Deleted";
    }
}
