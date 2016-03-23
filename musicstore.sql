-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 23 Mar 2016, 20:56:56
-- Sunucu sürümü: 10.1.8-MariaDB
-- PHP Sürümü: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `musicstore`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `album`
--

CREATE TABLE `album` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `artist_name` varchar(255) NOT NULL,
  `variation` varchar(255) NOT NULL,
  `genre` varchar(255) NOT NULL,
  `song_numbers` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `album`
--

INSERT INTO `album` (`id`, `name`, `artist_name`, `variation`, `genre`, `song_numbers`) VALUES
(1, 'Dark Side of The Moon', 'Pink Floyd', 'Plak', 'Progresif Rock', 10),
(3, 'Unutulan', 'Cengiz Kurto?lu', 'Plak', 'Arabesk', 20),
(4, 'Unutulmayanlar 1', 'Cengiz Kurto?lu', 'Plak', 'Arabesk', 20),
(14, 'The Wall', 'Pink Floyd', 'Plak', 'Progresif Rock', 10),
(15, 'Bayramın Olsun', 'Ümit Besen', 'Kaset', 'Arabesk - Fantezi', 14),
(16, 'Değmesin Yağlı Boya', 'Barış Manço', 'Plak', 'Anadolu Rock', 25),
(23, 'Unutulan2', 'Cengiz Kurtoğlu', 'Plak', 'Arabesk Fantezi', 12),
(24, 'name', 'artistName', 'variation', 'genre', 1),
(25, 'name2', 'artistName2', 'variation2', 'genre2', 1),
(26, 'name3', 'artistName3', 'variation3', 'genre3', 1),
(27, 'name4', 'artistName4', 'variation4', 'genre4', 1),
(28, 'name5', 'artistName5', 'variation5', 'genre5', 1),
(29, 'name7', 'artistName7', 'variation7', 'genre7', 1),
(30, 'name8', 'a', 's', 'ws', 1);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `customer`
--

CREATE TABLE `customer` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `surname` varchar(255) DEFAULT NULL,
  `album_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `customer`
--

INSERT INTO `customer` (`id`, `name`, `surname`, `album_id`) VALUES
(10, 'Ali Can', 'Kuştemur', 29);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `album`
--
ALTER TABLE `album`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `album_id` (`id`),
  ADD KEY `album_id_2` (`album_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `album`
--
ALTER TABLE `album`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
--
-- Tablo için AUTO_INCREMENT değeri `customer`
--
ALTER TABLE `customer`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`album_id`) REFERENCES `album` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
