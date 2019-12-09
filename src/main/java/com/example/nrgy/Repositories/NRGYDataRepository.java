package com.example.nrgy.Repositories;

import com.example.nrgy.Collections.NRGYDataCollection;
import com.example.nrgy.Collections.NRGYDataCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NRGYDataRepository extends MongoRepository<NRGYDataCollection, String> {
}