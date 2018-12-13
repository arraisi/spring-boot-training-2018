package com.training.webservice.service;

import com.training.webservice.entity.Pengiriman;
import com.training.webservice.respository.PengirimanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PengirimanService {
    @Autowired
    PengirimanDao dao;

    public Pengiriman save(Pengiriman pengiriman) {
        return dao.save(pengiriman);
    }

    public Optional<Pengiriman> findById(Integer id) {
        return dao.findById(id);
    }

    public List<Pengiriman> findAll() {
        return dao.list();
    }

    public void deleteById(Integer id) {
        dao.deleteById(id);
    }
}
