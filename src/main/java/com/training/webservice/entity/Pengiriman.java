package com.training.webservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pengiriman")
public class Pengiriman {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String nama;

    @Column
    private Long ongkir;

    @Column(name = "waktu_pengiriman")
    private String waktuPengiriman;
}
