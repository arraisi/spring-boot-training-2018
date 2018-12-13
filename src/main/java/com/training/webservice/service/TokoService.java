package com.training.webservice.service;

import com.training.webservice.entity.Toko;
import com.training.webservice.respository.TokoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class TokoService {

    @Autowired
    TokoDao dao;

    public Toko save(Toko toko) {
        return dao.save(toko);
    }

    public Optional<Toko> findById(Integer id) {
        return dao.findById(id);
    }

    public List<Toko> findAll() {
        return dao.findAll();
    }

    public void deleteById(Integer id) {
        dao.deleteById(id);
    }
}
