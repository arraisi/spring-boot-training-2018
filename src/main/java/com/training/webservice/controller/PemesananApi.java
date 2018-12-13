package com.training.webservice.controller;

import com.training.webservice.entity.Pemesanan;
import com.training.webservice.entity.Pengiriman;
import com.training.webservice.service.PemesananService;
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
@RequestMapping("/api/pemesanan")
public class PemesananApi {
    private static final Logger console = LoggerFactory.getLogger(PemesananApi.class);

    @Autowired
    PemesananService service;

    @PostMapping("/")
    public ResponseEntity<Pemesanan> save(@RequestBody Pemesanan pemesanan){
        pemesanan = service.save(pemesanan);
        return new ResponseEntity<>(pemesanan, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pemesanan>> findById(@PathVariable Integer id){
        Optional<Pemesanan> pemesanan = service.findById(id);
        return new ResponseEntity<>(pemesanan, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Pemesanan>> findAll(){
        List<Pemesanan> pemesanans = service.findAll();
        return new ResponseEntity<>(pemesanans, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Pemesanan> deleteById(@PathVariable Integer id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
