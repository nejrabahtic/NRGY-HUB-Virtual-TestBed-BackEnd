package com.example.backend.Repositories;

import com.example.backend.Models.BuildingModel;
import org.springframework.data.repository.CrudRepository;

public interface BuildingRepository extends CrudRepository<BuildingModel, Integer> {
}
