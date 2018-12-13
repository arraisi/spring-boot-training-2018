alter table pemesanan
  add constraint fk_pengiriman_id_pemesanan foreign key (pengiriman_id)
references pengiriman (id);

alter table pemesanan
  add constraint fk_toko_id_pemesanan foreign key (toko_id)
references toko (id);

alter table pemesanan
  add constraint fk_produk_id_pemesanan foreign key (produk_id)
references produk (id);

alter table pemesanan
  add constraint fk_konsumen_id_pemesanan foreign key (konsumen_id)
references konsumen (id);

alter table produk
  add constraint fk_kategori_id_produk foreign key (kategori_id)
references kategori (id);

alter table produk
  add constraint fk_toko_id_produk foreign key (toko_id)
references toko (id);