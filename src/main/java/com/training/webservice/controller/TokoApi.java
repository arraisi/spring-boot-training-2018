package com.training.webservice.controller;

import com.training.webservice.entity.Pemesanan;
import com.training.webservice.entity.Toko;
import com.training.webservice.service.PemesananService;
import com.training.webservice.service.TokoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/toko")
public class TokoApi {
    private static final Logger console = LoggerFactory.getLogger(TokoApi.class);

    @Autowired
    TokoService service;

    @PostMapping("/")
    public ResponseEntity<Toko> save(@RequestBody Toko toko){
        toko = service.save(toko);
        return new ResponseEntity<>(toko, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Toko>> findById(@PathVariable Integer id){
        Optional<Toko> toko = service.findById(id);
        return new ResponseEntity<>(toko, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Toko>> findAll(){
        List<Toko> tokos = service.findAll();
        return new ResponseEntity<>(tokos, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Toko> deleteById(@PathVariable Integer id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
