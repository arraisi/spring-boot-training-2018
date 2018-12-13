package com.training.webservice.controller;

import com.training.webservice.entity.Kategori;
import com.training.webservice.entity.Pengiriman;
import com.training.webservice.service.PengirimanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pengiriman")
public class PengirimanApi {
    private static final Logger console = LoggerFactory.getLogger(PengirimanApi.class);

    @Autowired
    PengirimanService service;

    @PostMapping("/")
    public ResponseEntity<Pengiriman> save(@RequestBody Pengiriman pengiriman){
        pengiriman = service.save(pengiriman);
        return new ResponseEntity<>(pengiriman, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pengiriman>> findById(@PathVariable Integer id){
        Optional<Pengiriman> pengiriman = service.findById(id);
        return new ResponseEntity<>(pengiriman, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Pengiriman>> findAll(){
        List<Pengiriman> pengiriman = service.findAll();
        return new ResponseEntity<>(pengiriman, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Pengiriman> deleteById(@PathVariable Integer id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
