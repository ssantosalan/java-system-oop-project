-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.31 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for projetointegrador
CREATE DATABASE IF NOT EXISTS `projetointegrador` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `projetointegrador`;

-- Dumping structure for table projetointegrador.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `id_cliente` int(6) NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) NOT NULL,
  `CPF` varchar(11) NOT NULL,
  `telefone` varchar(13) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`),
  UNIQUE KEY `CPF` (`CPF`)
) ENGINE=MyISAM AUTO_INCREMENT=114 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table projetointegrador.estoque
CREATE TABLE IF NOT EXISTS `estoque` (
  `id_produto` int(6) NOT NULL AUTO_INCREMENT,
  `nome_produto` varchar(50) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `valor_unit` decimal(9,2) DEFAULT '0.00',
  PRIMARY KEY (`id_produto`),
  UNIQUE KEY `nome_produto` (`nome_produto`)
) ENGINE=MyISAM AUTO_INCREMENT=52 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table projetointegrador.pedido_de_venda
CREATE TABLE IF NOT EXISTS `pedido_de_venda` (
  `numero_pedido` int(15) DEFAULT NULL,
  `quantidade_comprada` int(11) DEFAULT NULL,
  `descricao_prod` varchar(20) DEFAULT NULL,
  `fk_id_produto` int(11) DEFAULT NULL,
  `nome_cliente` varchar(50) DEFAULT NULL,
  `nome_vendedor` varchar(50) DEFAULT NULL,
  `data_venda` date DEFAULT NULL,
  `preco_unit` decimal(9,2) DEFAULT NULL,
  KEY `fk_id_produto` (`fk_id_produto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table projetointegrador.pessoa
CREATE TABLE IF NOT EXISTS `pessoa` (
  `id` int(11) NOT NULL,
  `nome` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table projetointegrador.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int(3) NOT NULL AUTO_INCREMENT,
  `nome_usuario` varchar(60) NOT NULL,
  `email` varchar(60) NOT NULL,
  `senha` varchar(25) NOT NULL,
  `acesso` enum('Gerente','Colaborador') NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=MyISAM AUTO_INCREMENT=44 DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
