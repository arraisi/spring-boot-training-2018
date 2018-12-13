package com.training.webservice.respository;

import com.training.webservice.entity.Kategori;
import com.training.webservice.entity.Pemesanan;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PemesananRepository extends PagingAndSortingRepository<Pemesanan, Integer> {
    List<Pemesanan> findAll();

}
