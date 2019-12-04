package com.example.nrgy.Services;

import com.example.nrgy.Collections.UserCollection;
import com.example.nrgy.Repositories.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserCollection> getAllUsers() {
        return userRepository.findAll();
    }

    public UserCollection createUser(String username, String password,
                                     String email, String companyName){
        return userRepository.save(new UserCollection(username, password, email, companyName));
    }

    public UserCollection getUserById(String id){
        Optional<UserCollection> user = userRepository.findById(id);

        if(user.isPresent() == false)
            return null;

        return user.get();
    }

    public void deleteUserbyId(String id){
        userRepository.deleteById(id);
    }

    public void deleteAllUsers(){
        userRepository.deleteAll();
    }

}
