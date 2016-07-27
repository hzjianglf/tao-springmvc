/*
SQLyog v10.2 
MySQL - 5.1.73-community-log : Database - tao
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tao` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `tao`;

/*Table structure for table `tao_member` */

DROP TABLE IF EXISTS `tao_member`;

CREATE TABLE `tao_member` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_date` datetime DEFAULT NULL,
  `modify_date` datetime DEFAULT NULL,
  `address` varchar(765) DEFAULT NULL,
  `amount` decimal(29,0) DEFAULT NULL,
  `attribute_value0` varchar(765) DEFAULT NULL,
  `attribute_value1` varchar(765) DEFAULT NULL,
  `attribute_value2` varchar(765) DEFAULT NULL,
  `attribute_value3` varchar(765) DEFAULT NULL,
  `attribute_value4` varchar(765) DEFAULT NULL,
  `attribute_value5` varchar(765) DEFAULT NULL,
  `attribute_value6` varchar(765) DEFAULT NULL,
  `balance` decimal(29,0) DEFAULT NULL,
  `birth` datetime DEFAULT NULL,
  `email` varchar(765) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `is_enabled` bit(1) DEFAULT NULL,
  `is_locked` bit(1) DEFAULT NULL,
  `locked_date` datetime DEFAULT NULL,
  `login_date` datetime DEFAULT NULL,
  `login_failure_count` int(11) DEFAULT NULL,
  `login_ip` varchar(765) DEFAULT NULL,
  `mobile` varchar(765) DEFAULT NULL,
  `name` varchar(765) DEFAULT NULL,
  `password` varchar(765) DEFAULT NULL,
  `phone` varchar(765) DEFAULT NULL,
  `point` bigint(20) DEFAULT NULL,
  `register_ip` varchar(765) DEFAULT NULL,
  `safe_key_expire` datetime DEFAULT NULL,
  `safe_key_value` varchar(765) DEFAULT NULL,
  `username` varchar(300) DEFAULT NULL,
  `zip_code` varchar(765) DEFAULT NULL,
  `area` bigint(20) DEFAULT NULL,
  `member_rank` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `tao_member` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
