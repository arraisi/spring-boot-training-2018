package com.training.webservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produk")
public class Produk {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "kode")
    private String kode;

    @Column(name = "nama")
    private String nama;

    @Column(name = "harga")
    private Long harga;

    @Column(name = "persediaan")
    private Integer persediaan;

    @ManyToOne
    @JoinColumn(name = "kategori_id")
    private Kategori kategoriId;

    @ManyToOne
    @JoinColumn(name = "toko_id")
    private Toko tokoId;

}
