package com.training.webservice.service;

import com.training.webservice.entity.Konsumen;
import com.training.webservice.respository.KonsumenDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class KonsumenService {

    @Autowired
    KonsumenDao dao;

    public Konsumen save(Konsumen konsumen) {
        return dao.save(konsumen);
    }

    public List<Konsumen> list() {
        return dao.findAll();
    }

    public Optional<Konsumen> findById(Integer id) {
        return dao.findById(id);
    }

    public void deleteById(Integer id) {
        dao.deleteById(id);
    }
}
