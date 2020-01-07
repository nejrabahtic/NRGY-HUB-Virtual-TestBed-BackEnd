package com.example.backend.Repositories;

import com.example.backend.Models.MeterModel;
import org.springframework.data.repository.CrudRepository;

public interface MeterRepository extends CrudRepository<MeterModel, Integer> {
}
