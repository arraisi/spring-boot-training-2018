package com.training.webservice.respository;

import com.training.webservice.entity.Toko;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TokoDao {
    @Autowired
    TokoRepository repository;

    public Toko save(Toko toko) {
        return repository.save(toko);
    }

    public Optional<Toko> findById(Integer id) {
        return repository.findById(id);
    }

    public List<Toko> findAll() {
        return repository.findAll();
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
