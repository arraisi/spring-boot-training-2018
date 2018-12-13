

CREATE TABLE produk (
  id          int auto_increment primary key,
  kode        varchar(255) not null,
  nama        varchar(255) not null,
  harga       bigint not null,
  persediaan  int(11),
  kategori_id int ,
  toko_id     int
)
  engine = InnoDB;

CREATE TABLE konsumen (
  id          int auto_increment primary key,
  alamat      varchar(255) not null,
  nama        varchar(255) not null,
  kode_pos    varchar(255) not null,
  kota        varchar(255) not null,
  no_hp       varchar(255) not null,
  email       varchar(255) not null
)
  engine = InnoDB;

CREATE TABLE kategori (
  id          int auto_increment primary key,
  nama        varchar(255) not null,
  descripsi   varchar(255) not null
)
  engine = InnoDB;

CREATE TABLE pengiriman (
  id                int auto_increment primary key,
  nama              varchar(255) not null,
  ongkir            bigint,
  waktu_pengiriman  varchar(255)
)
  engine = InnoDB;

CREATE TABLE toko (
  id                int auto_increment primary key,
  nama              varchar(255) not null,
  alamat            varchar(255) not null
)
  engine = InnoDB;

CREATE TABLE pemesanan (
  id            int auto_increment primary key,
  nama          varchar(255) not null,
  konsumen_id   int(11) not null,
  produk_id     int(11) not null,
  toko_id       int(11) not null,
  pengiriman_id       int(11) not null,
  jumlah        int(11) not null,
  harga         bigint not null,
  total         int(11) not null
)
  engine = InnoDB;