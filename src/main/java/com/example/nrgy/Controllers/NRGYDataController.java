package com.example.nrgy.Controllers;

import com.example.nrgy.Collections.NRGYDataCollection;
import com.example.nrgy.Services.NRGYDataService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("nrgyData")
public class NRGYDataController {
/*
    @Autowired
    private NRGYDataService NRGYDataService;


    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<NRGYDataCollection>> getAllNRGYData() {
        return new ResponseEntity<List<NRGYDataCollection>>(nrgyDataService.getAllNRGYData(), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<NRGYDataCollection> getNRGYDataById (@PathVariable String id){
        NRGYDataCollection nrgyData = nrgyDataService.getNRGYDataById(id);

        if (nrgyData == null)
            return new ResponseEntity<NRGYDataCollection>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<NRGYDataCollection>(nrgyData, HttpStatus.OK);
    }


    @CrossOrigin
    @DeleteMapping()
    public ResponseEntity<String> deleteAllNRGYData(){
        nrgyDataService.deleteAllNRGYData();
        return new ResponseEntity<>(HttpStatus.OK);
    }
*/


}
