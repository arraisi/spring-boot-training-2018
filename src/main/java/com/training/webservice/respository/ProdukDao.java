package com.training.webservice.respository;

import com.training.webservice.entity.Produk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProdukDao {
    @Autowired
    ProdukRepository repository;

    public List<Produk> list() {
        return repository.findAll();
    }

    public Produk save(Produk param) {
        return repository.save(param);
    }

    public Optional<Produk> findById(Integer id) {
        return repository.findById(id);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
