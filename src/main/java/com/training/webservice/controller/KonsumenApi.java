package com.training.webservice.controller;

import com.training.webservice.entity.Kategori;
import com.training.webservice.entity.Konsumen;
import com.training.webservice.service.KonsumenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/konsumen")
public class KonsumenApi {
    private static final Logger console = LoggerFactory.getLogger(KonsumenApi.class);

    @Autowired
    private KonsumenService service;

    @PostMapping("/")
    public ResponseEntity<Konsumen> findById(@RequestBody Konsumen konsumen) {
        konsumen = service.save(konsumen);
        return new ResponseEntity<>(konsumen, HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Konsumen>> list() {
        List<Konsumen> list = service.list();
        if (list.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        else return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Konsumen>> findById(@PathVariable Integer id) {
        Optional<Konsumen> konsumen = service.findById(id);
        return new ResponseEntity<>(konsumen, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Konsumen> deleteById(@PathVariable Integer id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
