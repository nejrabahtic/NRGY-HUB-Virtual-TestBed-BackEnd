package com.example.backend.Repositories;

import com.example.backend.Models.CompanyModel;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<CompanyModel, Integer> {
}
