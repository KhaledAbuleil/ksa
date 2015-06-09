
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
  `f_owner` varchar(45)  NOT NULL,
  `f_Vertadd` varchar(45) NOT NULL,
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

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
 
  `u_username` varchar(45) NOT NULL,
   `u_password` INT(20)  NOT NULL,
  `u_firstname` varchar(45) NOT NULL,
  `u_lastname` varchar(45) NOT NULL,
	`u_Role` varchar(45) NOT NULL,
	`u_Status` varchar(45) NOT NULL DEFAULT '0',
	PRIMARY KEY (`u_username`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
/*==========================================*/

DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `g_id` INT(20)  NOT NULL AUTO_INCREMENT,
  `g_groupname` INT(20)  NOT NULL,
	PRIMARY KEY (`g_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
/*==========================================*/

DROP TABLE IF EXISTS `fileInGroup`;
CREATE TABLE `fileInGroup` (
  `g_id` INT(20)  NOT NULL ,
  `f_id` INT(20)  NOT NULL,
  `gf_readWrite` INT NOT NULL DEFAULT '0',
	PRIMARY KEY (`g_id`,`f_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `userInGroup`;
CREATE TABLE `userInGroup` (
  `g_id` INT(20)  NOT NULL ,
  `u_username` varchar(45) NOT NULL,
	PRIMARY KEY (`g_id`,`u_username`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `request`;
CREATE TABLE `request` (
  `r_id`  INT NOT NULL AUTO_INCREMENT,
  `r_Date` DATETIME  NOT NULL,
  `r_username` varchar(45) NOT NULL,
  `r_join_retire` varchar(45) NOT NULL,
	PRIMARY KEY ( `r_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `folder`;
CREATE TABLE `folder` (
  `fo_id`  INT NOT NULL AUTO_INCREMENT,
   `fo_name` varchar(45) NOT NULL,
  `fo_path` varchar(45) NOT NULL,
	PRIMARY KEY ( `fo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `fmsdb`.`users` 
(`u_username`,`u_password`,`u_firstname`, `u_lastname`, `u_Role`, `u_Status`) VALUES 
('saeednamih',123,'saeed','namih','admin','ofline'),
('Khaled1',321,'Khaled','dmam','user','ofline'),
('anita1',444,'anita','foad','admin','ofline'),
('wsam1',555,'wsam','amr','user','ofline'),
('wsam',111,'wsam','assadi','user','ofline'),
('jojo',123,'jmal','dabbah','user','ofline'),
('nader',321,'nader','kmal','user','ofline'),
('client',123,'client','client','user','ofline');

INSERT INTO `file` (`f_name`,`f_type`,`f_size`,`f_describe`,`f_privilege`,`f_address`) VALUES 
 ('\"hmw1"','\"doc\"',510,'\"java homework\"',3,'\"D:\\G17\\MLAM\\\"'),
 ('\"Brazil\"','\"JPG\"',400,'\"My Trip\"',1,'\"D:\\G17\\TRIP\\\"'),
 ('\"lab7\"','\"c\"',2,'\"lab work num 7,mtam\"',2,'\"D:\\G17\\mtam\\\"'),
  ('\"doc1\"','\"doc\"',6542,'\"Exams Table\"',3,'\"D:\\G17\\Exams\\\"'),
 ('\"doc2\"','\"doc\"',1334,'\"java code,GUI EXAMPLE\"',2,'\"D:\\G17\\Exams\\\"'),
 ('\"CREATE\"','\"c\"',200,'\"Create.c from XINU\"',2,'\"D:\\G17\\OS\\\"'),
  ('\"hedva\"','\"doc\"',4000,'\"hedva 1 limit \"',3,'\"D:\\G17\\hedva\\\"'),
    ('\"algebra\"','\"doc\"',4000,'\"algbra  1 matrix \"',2,'\"D:\\G17\\algebra\\\"');