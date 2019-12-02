package com.example.nrgy.Controllers;

import com.example.nrgy.Collections.UserCollection;
import com.example.nrgy.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<UserCollection>> getAllUsers() {
        return new ResponseEntity<List<UserCollection>>(userService.getAllUsers(), HttpStatus.OK);
    }

}
