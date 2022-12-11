-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2022 at 06:32 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fruities`
--

-- --------------------------------------------------------

--
-- Table structure for table `buah`
--

CREATE TABLE `buah` (
  `ID_buah` int(2) NOT NULL,
  `Nama_buah` varchar(50) NOT NULL,
  `Jenis` varchar(20) NOT NULL,
  `Harga` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buah`
--

INSERT INTO `buah` (`ID_buah`, `Nama_buah`, `Jenis`, `Harga`) VALUES
(1, 'Jeruk', 'Lokal', 'Rp.10.000/KG'),
(2, 'Mangga', 'Impor', 'Rp.70.000/KG'),
(3, 'Anggur', 'Impor', 'Rp.90.000/KG'),
(4, 'Stroberi', 'Lokal', 'Rp.60.000/KG'),
(5, 'Nanas', 'Impor', 'Rp.20.000/KG'),
(6, 'Pir', 'Lokal', 'Rp.27.000/KG'),
(7, 'Pisang', 'Lokal', 'Rp.25.000/KG'),
(8, 'Manggis', 'Impor', 'Rp.83.000/KG'),
(9, 'Buah Naga', 'Lokal', 'Rp.25.000/KG');

-- --------------------------------------------------------

--
-- Table structure for table `jenis`
--

CREATE TABLE `jenis` (
  `Jenis` varchar(20) NOT NULL,
  `Keunggulan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jenis`
--

INSERT INTO `jenis` (`Jenis`, `Keunggulan`) VALUES
('Lokal', 'Harga yang lebih terjangkau dan aman untuk dikonsumsi'),
('Impor', 'Penampilan yang menarik dan rasanya yang konsisten');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(30) NOT NULL,
  `password` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('yaya', 203),
('luthfi', 120);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buah`
--
ALTER TABLE `buah`
  ADD PRIMARY KEY (`ID_buah`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `buah`
--
ALTER TABLE `buah`
  MODIFY `ID_buah` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
