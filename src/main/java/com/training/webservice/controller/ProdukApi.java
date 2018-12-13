package com.training.webservice.controller;

import com.training.webservice.entity.Produk;
import com.training.webservice.service.ProdukService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produk")
public class ProdukApi {
    private static final Logger console = LoggerFactory.getLogger(ProdukApi.class);

    @Autowired
    ProdukService service;

    @PostMapping("/")
    public ResponseEntity<Produk> save(@RequestBody Produk produk){
        produk = service.save(produk);
        return new ResponseEntity<>(produk, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produk>> findById(@PathVariable Integer id){
        Optional<Produk> produk = service.findById(id);
        return new ResponseEntity<>(produk, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Produk>> findAll(){
        List<Produk> produks = service.findAll();
        return new ResponseEntity<>(produks, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Produk> deleteById(@PathVariable Integer id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
