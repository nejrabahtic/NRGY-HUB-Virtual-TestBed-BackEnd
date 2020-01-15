package com.example.backend.Controllers;

import com.example.backend.Models.BuildingModel;
import com.example.backend.Models.CompanyModel;
import com.example.backend.Repositories.BuildingRepository;
import com.example.backend.Repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8000")
@Controller
@RequestMapping(path="/company")
public class CompanyController {
    @Autowired
    private CompanyRepository companyRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addCompany(@RequestBody CompanyModel companyModel) {

        if (companyModel == null)
            return "Null cannot be saved!";
        companyRepository.save(companyModel);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<CompanyModel> getAllCompanies() {
        return companyRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody
    Optional<CompanyModel> getCompanyById(@PathVariable Integer id){
        return companyRepository.findById(id);
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody String deleteCompanyById(@PathVariable Integer id){
        if (id == null)
            return "Id cannot be null!";
        companyRepository.deleteById(id);
        return "Deleted";
    }
}
