package com.training.webservice.respository;

import com.training.webservice.entity.Produk;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProdukRepository extends PagingAndSortingRepository<Produk, Integer> {
    List<Produk> findAll();

}
