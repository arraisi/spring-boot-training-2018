package com.training.webservice.respository;

import com.training.webservice.entity.Pemesanan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PemesananDao {
    @Autowired
    PemesananRepository repository;

    public List<Pemesanan> list() {
        return repository.findAll();
    }

    public Pemesanan save(Pemesanan param) {
        return repository.save(param);
    }

    public void removeById(Integer id) {
        repository.deleteById(id);
    }

    public Optional<Pemesanan> findById(Integer id){
        return repository.findById(id);
    }
}
