package com.example.backend.Repositories;

import com.example.backend.Models.UserTypeModel;
import org.springframework.data.repository.CrudRepository;

public interface UserTypeRepository extends CrudRepository<UserTypeModel, Integer> {
}
