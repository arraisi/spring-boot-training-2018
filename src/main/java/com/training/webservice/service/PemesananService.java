package com.training.webservice.service;

import com.training.webservice.entity.Pemesanan;
import com.training.webservice.respository.PemesananDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PemesananService {
    @Autowired
    PemesananDao dao;

    public Pemesanan save(Pemesanan pemesanan) {
        return dao.save(pemesanan);
    }

    public Optional<Pemesanan> findById(Integer id) {
        return dao.findById(id);
    }

    public List<Pemesanan> findAll() {
        return dao.list();
    }

    public void deleteById(Integer id) {
        dao.removeById(id);
    }
}
