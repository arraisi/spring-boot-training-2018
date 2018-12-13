package com.training.webservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "toko")
public class Toko {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nama")
    private String nama;

    @Column(name = "alamat")
    private String alamat;

    @OneToMany(mappedBy = "tokoId", fetch = FetchType.LAZY)
    public List<Produk> produks = new ArrayList<>();
}
