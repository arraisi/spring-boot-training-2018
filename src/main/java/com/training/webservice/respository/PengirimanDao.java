package com.training.webservice.respository;

import com.training.webservice.entity.Pengiriman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PengirimanDao {
    @Autowired
    PengirimanRepository repository;

    public List<Pengiriman> list() {
        return repository.findAll();
    }

    public Pengiriman save(Pengiriman param) {
        return repository.save(param);
    }

    public Optional<Pengiriman> findById(Integer id){
        return repository.findById(id);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
