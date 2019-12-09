package com.example.nrgy.Services;

import com.example.nrgy.Collections.NRGYDataCollection;
import com.example.nrgy.Repositories.NRGYDataRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class NRGYDataService {
@Autowired
private NRGYDataRepository nrgyDataRepository;

public List<NRGYDataCollection> getAllNRGYData() {
    return nrgyDataRepository.findAll();
}


public NRGYDataCollection getNRGYById(String id){
    Optional<NRGYDataCollection> nrgyData = nrgyDataRepository.findById(id);

    if(nrgyData.isPresent() == false)
        return null;

    return nrgyData.get();
}


public void deleteAllNRGYData(){
                              nrgyDataRepository.deleteAll();
                                                             }

}


