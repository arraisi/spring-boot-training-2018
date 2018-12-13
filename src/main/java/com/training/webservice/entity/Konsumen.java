package com.training.webservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "konsumen")
public class Konsumen {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String alamat;

    @Column
    private String nama;

    @Column(name = "kode_pos")
    private String kodePos;

    @Column
    private String kota;

    @Column(name = "no_hp")
    private String noHp;

    @Column
    private String email;
}
