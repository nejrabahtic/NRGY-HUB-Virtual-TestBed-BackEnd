package com.example.nrgy.Repositories;

import com.example.nrgy.Collections.UserCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserCollection, String> {
}
