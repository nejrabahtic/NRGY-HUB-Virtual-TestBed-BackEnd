package com.example.nrgy.Controllers;

import com.example.nrgy.Collections.UserCollection;
import com.example.nrgy.Services.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @CrossOrigin
    @PostMapping(value = "/user", consumes = "application/json")
    public ResponseEntity<UserCollection> createUser(@RequestBody UserCollection user){
        return new ResponseEntity<UserCollection>(userService.createUser(user.getUsername(),
                user.getPassword(), user.getEmail(), user.getCompanyName()), HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<UserCollection>> getAllUsers() {
        return new ResponseEntity<List<UserCollection>>(userService.getAllUsers(), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<UserCollection> getUserById (@PathVariable String id){
        UserCollection user = userService.getUserById(id);

        if (user == null)
            return new ResponseEntity<UserCollection>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<UserCollection>(user, HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserbyId(@PathVariable String id){
        UserCollection user = userService.getUserById(id);

        if (user == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        userService.deleteUserbyId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping()
    public ResponseEntity<String> deleteAllUsers(){
        userService.deleteAllUsers();
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
