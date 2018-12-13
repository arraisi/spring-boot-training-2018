package com.training.webservice.service;

import com.training.webservice.entity.Kategori;
import com.training.webservice.respository.KategoriDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class KategoriService {

    @Autowired
    KategoriDao dao;

    public List<Kategori> list() {
        return dao.list();
    }

    public Optional<Kategori> findById(Integer id) {
        return dao.findById(id);
    }

    public Kategori save(Kategori kategori) {
        return dao.save(kategori);
    }

    public void deleteById(Integer id) {
        dao.removeById(id);
    }
}
