CREATE DATABASE  IF NOT EXISTS `bigdata` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bigdata`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: bigdata
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `board`
--

LOCK TABLES `board` WRITE;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
INSERT INTO `board` VALUES (13,'admin','email','home','글1','글1','1234',4,'2020-05-08 15:30:13',13,0,0,'null'),(17,'admin','email','home','글2','글2','1234',4,'2020-05-08 15:34:13',17,0,0,'null'),(25,'답변맨','email','home','Re:글2','1234','1234',1,'2020-05-08 16:22:36',17,4,1,'null'),(26,'1234','123456t','123yrfe','Re:Re:글2','123451','1234',3,'2020-05-08 16:23:40',17,5,2,'null'),(27,'확인','email','home','Re:글2','컨텐츠 추가 확인-------\n글2','1234',2,'2020-05-08 16:35:05',17,1,1,'null'),(31,'repl3','email','home','Re:제목3','내용3 답변\n\n---이전글---\n\n내용3','1234',16,'2020-05-08 16:37:27',30,1,1,'null'),(32,'admin','email','home','글4','글4','1234',1,'2020-05-12 17:20:19',32,0,0,'null'),(33,'admin','email','home','글5','글5','1234',1,'2020-05-12 17:20:37',33,0,0,'null'),(34,'admin','email','home','글6','글6','1234',2,'2020-05-12 17:20:58',34,0,0,'null'),(35,'admin','email','home','글7','글7','1234',2,'2020-05-12 17:21:13',35,0,0,'null'),(40,'admin','email','home','글11(수정)','글11 수정 또 수정 또 수정','1234',12,'2020-05-13 11:37:20',40,0,0,'null'),(41,'admin','email','home','Re:글11(수정)','글11 답변\n\n---이전글---\n\n글11 수정 또 수정 또 수정','1234',3,'2020-05-13 12:25:48',40,1,1,'null'),(42,'admin','email','home','Re:Re:글11(수정)','글11 답변 답변\n\n---이전글---\n\n글11 답변\n\n---이전글---\n\n글11 수정 또 수정 또 수정','1234',0,'2020-05-13 12:27:25',40,2,2,'null'),(43,'admin','email','home','글15','글15','1234',4,'2020-05-13 14:03:56',43,0,0,'null'),(44,'admin','email','home','글20','글20','1234',3,'2020-05-13 16:18:56',44,0,0,'null'),(45,'글0515','email','home','admin','글내용 05월 15일 수정이야','1234',16,'2020-05-15 14:57:54',45,0,0,'null'),(48,'잘되네','email','home','Re:.board 테스트','잘되네요2\r\n\r\n---이전글---\r\n\r\n.board 테스트 수정','1234',3,'2020-05-15 15:49:35',47,1,1,'null');
/*!40000 ALTER TABLE `board` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-15 17:10:41
