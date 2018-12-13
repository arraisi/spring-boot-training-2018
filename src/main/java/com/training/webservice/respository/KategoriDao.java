package com.training.webservice.respository;

import com.training.webservice.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class KategoriDao {
    @Autowired
    KategoriRepository repository;

    public List<Kategori> list() {
        return repository.findAll();
    }

    public Kategori save(Kategori param) {
        return repository.save(param);
    }

    public Optional<Kategori> findById(Integer id){
        return repository.findById(id);
    }

    public void removeById(Integer id) {
        repository.deleteById(id);
    }
}
