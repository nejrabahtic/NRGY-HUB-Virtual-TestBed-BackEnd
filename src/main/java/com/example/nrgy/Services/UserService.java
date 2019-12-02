package com.example.nrgy.Services;

import com.example.nrgy.Collections.UserCollection;
import com.example.nrgy.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserCollection> getAllUsers() {
        return userRepository.findAll();
    }
}
