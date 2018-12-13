package com.training.webservice.respository;

import com.training.webservice.entity.Pengiriman;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PengirimanRepository extends PagingAndSortingRepository<Pengiriman, Integer> {
    List<Pengiriman> findAll();

}
