package com.example.nrgy.Repositories;

import com.example.nrgy.Collections.UserCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserCollection, Integer> {
}
