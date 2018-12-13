package com.training.webservice.controller;

import com.training.webservice.entity.Kategori;
import com.training.webservice.service.KategoriService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/kategori")
public class KategoriApi {
    private static final Logger console = LoggerFactory.getLogger(KategoriApi.class);

    @Autowired
    private KategoriService service;

    @PostMapping("/")
    public ResponseEntity<Kategori> findById(@RequestBody Kategori kategori) {
        kategori = service.save(kategori);
        return new ResponseEntity<>(kategori, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Kategori>> list() {
        List<Kategori> list = service.list();
        if (list.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        else return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Kategori>> findById(@PathVariable Integer id) {
        Optional<Kategori> kategori = service.findById(id);
        return new ResponseEntity<>(kategori, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Kategori> deleteById(@PathVariable Integer id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
