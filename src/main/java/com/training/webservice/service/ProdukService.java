package com.training.webservice.service;

import com.training.webservice.entity.Produk;
import com.training.webservice.respository.ProdukRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ProdukService {
    @Autowired
    ProdukRepository repository;

    public Produk save(Produk produk) {
        return repository.save(produk);
    }

    public Optional<Produk> findById(Integer id) {
        return repository.findById(id);
    }

    public List<Produk> findAll() {
        return repository.findAll();
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
