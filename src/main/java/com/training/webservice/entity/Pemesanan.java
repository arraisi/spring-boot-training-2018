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
@Table(name = "pemesanan")
public class Pemesanan {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private  String nama;

    @OneToOne
    @JoinColumn(name = "konsumen_id")
    private Konsumen konsumenId;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    public List<Produk> produks = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "toko_id")
    private Toko tokoId;

    @OneToOne
    @JoinColumn(name = "pengiriman_id")
    private Pengiriman pengirimanId;

    @Column
    private Integer jumlah;

    @Column
    private Long harga;

    @Column
    private Integer total;
}
