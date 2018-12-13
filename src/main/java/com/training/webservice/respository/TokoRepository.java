package com.training.webservice.respository;

import com.training.webservice.entity.Toko;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TokoRepository extends PagingAndSortingRepository<Toko, Integer> {
    List<Toko> findAll();
}
