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
@Table(name = "kategori")
public class Kategori {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String nama;

    @Column
    private String descripsi;

    @OneToMany(mappedBy = "kategoriId", fetch = FetchType.LAZY)
    public List<Produk> produks = new ArrayList<>();

}
