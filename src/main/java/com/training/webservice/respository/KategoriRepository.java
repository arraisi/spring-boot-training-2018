package com.training.webservice.respository;

import com.training.webservice.entity.Kategori;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface KategoriRepository extends PagingAndSortingRepository<Kategori, Integer> {
    List<Kategori> findAll();
}
