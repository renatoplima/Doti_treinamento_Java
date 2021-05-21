-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: projetofinal
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `mtb310_ag_financeiro`
--

DROP TABLE IF EXISTS `mtb310_ag_financeiro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mtb310_ag_financeiro` (
  `id_agente` int NOT NULL AUTO_INCREMENT,
  `nome_agente` varchar(255) DEFAULT NULL,
  `volume_transacional` double DEFAULT NULL,
  PRIMARY KEY (`id_agente`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mtb310_ag_financeiro`
--

LOCK TABLES `mtb310_ag_financeiro` WRITE;
/*!40000 ALTER TABLE `mtb310_ag_financeiro` DISABLE KEYS */;
/*!40000 ALTER TABLE `mtb310_ag_financeiro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mtb310_transaction`
--

DROP TABLE IF EXISTS `mtb310_transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mtb310_transaction` (
  `id_transacao` int NOT NULL AUTO_INCREMENT,
  `ag_financeiro` int NOT NULL,
  `data_hora` datetime DEFAULT NULL,
  `dispositivo` int DEFAULT NULL,
  `status` int DEFAULT NULL,
  `valor_aut` float DEFAULT NULL,
  `valor_solic` float DEFAULT NULL,
  `ag_financeiro_id_agente` int DEFAULT NULL,
  PRIMARY KEY (`id_transacao`),
  KEY `FKcoalgnguw3nnivjak3axq5pkm` (`ag_financeiro_id_agente`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mtb310_transaction`
--

LOCK TABLES `mtb310_transaction` WRITE;
/*!40000 ALTER TABLE `mtb310_transaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `mtb310_transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_artista`
--

DROP TABLE IF EXISTS `tb_artista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_artista` (
  `id` int NOT NULL AUTO_INCREMENT,
  `estilo` varchar(255) DEFAULT NULL,
  `nacionalidade` varchar(255) DEFAULT NULL,
  `nome_artistico` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_artista`
--

LOCK TABLES `tb_artista` WRITE;
/*!40000 ALTER TABLE `tb_artista` DISABLE KEYS */;
INSERT INTO `tb_artista` VALUES (1,'Pop','BRASILEIRA','Legião Urbana'),(2,'Rock','AMERICANA','Metallica'),(3,'Rock','AMERICANA','Nirvana'),(4,'Sertanejo','BRASILEIRA','Zé Neto e Cristiano');
/*!40000 ALTER TABLE `tb_artista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_musica`
--

DROP TABLE IF EXISTS `tb_musica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_musica` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cadastro` date DEFAULT NULL,
  `lancamento` int DEFAULT NULL,
  `titulo` varchar(30) DEFAULT NULL,
  `artista_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2b4xe7dtt83bo4pdm49gdhu6r` (`artista_id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_musica`
--

LOCK TABLES `tb_musica` WRITE;
/*!40000 ALTER TABLE `tb_musica` DISABLE KEYS */;
INSERT INTO `tb_musica` VALUES (1,'2021-05-18',0,'Pais e Filhos',1),(2,'2021-05-18',0,'Será',1),(3,'2021-05-18',0,'One',2),(4,'2021-05-18',0,'Enter Sandman',2),(5,'2021-05-18',0,'Lithium',3),(6,'2021-05-18',0,'Smells Like Teen Spirit',3),(7,'2021-05-18',0,'Alô Ambev',4),(8,'2021-05-18',1,'Esses Vícios',4),(9,'2021-05-18',0,'Tempo Perdido',1);
/*!40000 ALTER TABLE `tb_musica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_usuario`
--

DROP TABLE IF EXISTS `tb_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `racf` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_usuario`
--

LOCK TABLES `tb_usuario` WRITE;
/*!40000 ALTER TABLE `tb_usuario` DISABLE KEYS */;
INSERT INTO `tb_usuario` VALUES (1,'bill@gates.com','bill.png','Bill Gates','ms',NULL),(2,'renatoplima@renatoplima.com.br','Goku.png','Renato P. Lima','123456',NULL),(3,'linus@trovals.com','linus.png','Linus Trovals','linux',NULL),(4,'steve@jobs.com','steve.png','Steve Jobs','apple',NULL),(5,'1@1','Goku.png','Admin','123',NULL);
/*!40000 ALTER TABLE `tb_usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-21 11:25:32
