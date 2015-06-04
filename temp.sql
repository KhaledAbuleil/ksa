
CREATE DATABASE IF NOT EXISTS fmsdb;
USE fmsdb;
/*====================================*/
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `f_id` INT NOT NULL AUTO_INCREMENT,
  `f_name` varchar(45) NOT NULL,
  `f_type` varchar(45) NOT NULL,
  `f_size`int(10) NOT NULL,
  `f_describe` varchar(200) NOT NULL,
  `f_privilege` int(11) NOT NULL DEFAULT '3',
  `f_address` varchar(45) NOT NULL,
  `f_IsUpdating` INT(1) NOT NULL DEFAULT 0,
  `f_removed` INT(1) NULL DEFAULT 0,
	PRIMARY KEY (`f_id`),
  UNIQUE KEY `f_name_UNIQUE` (`f_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

/*===========================================*/
DROP TABLE IF EXISTS `UpdateFile`;
CREATE TABLE `UpdateFile` (
  `f_id` INT NOT NULL,
  `f_UpdateDate` DATETIME  NOT NULL,
  `f_UserName` varchar(45) NOT NULL,
	PRIMARY KEY (`f_id`,`f_UpdateDate`,`f_UserName`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
/*==========================================*/

INSERT INTO `file` (`f_name`,`f_type`,`f_size`,`f_describe`,`f_privilege`,`f_address`) VALUES 
 ('\"hmw1"','\"doc\"',510,'\"java homework\"',3,'\"D:\\G17\\MLAM\\\"'),
 ('\"Brazil\"','\"JPG\"',400,'\"My Trip\"',1,'\"D:\\G17\\TRIP\\\"'),
 ('\"lab7\"','\"c\"',2,'\"lab work num 7,mtam\"',2,'\"D:\\G17\\mtam\\\"'),
  ('\"doc1\"','\"doc\"',6542,'\"Exams Table\"',3,'\"D:\\G17\\Exams\\\"'),
 ('\"doc2\"','\"doc\"',1334,'\"java code,GUI EXAMPLE\"',2,'\"D:\\G17\\Exams\\\"'),
 ('\"CREATE\"','\"c\"',200,'\"Create.c from XINU\"',2,'\"D:\\G17\\OS\\\"'),
  ('\"hedva\"','\"doc\"',4000,'\"hedva 1 limit \"',3,'\"D:\\G17\\hedva\\\"'),
    ('\"algebra\"','\"doc\"',4000,'\"algbra  1 matrix \"',2,'\"D:\\G17\\algebra\\\"')
/*====================================*/



