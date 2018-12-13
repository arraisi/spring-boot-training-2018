package com.training.webservice.respository;

import com.training.webservice.entity.Kategori;
import com.training.webservice.entity.Konsumen;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface KonsumenRepository extends PagingAndSortingRepository<Konsumen, Integer> {
    List<Konsumen> findAll();

}
