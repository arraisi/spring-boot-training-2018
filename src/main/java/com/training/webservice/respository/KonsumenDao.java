package com.training.webservice.respository;

import com.training.webservice.entity.Konsumen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class KonsumenDao {
    @Autowired
    KonsumenRepository repository;

    public List<Konsumen> findAll() {
        return repository.findAll();
    }

    public Konsumen save(Konsumen param) {
        return repository.save(param);
    }

    public Optional<Konsumen> findById(Integer id) {
        return repository.findById(id);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
