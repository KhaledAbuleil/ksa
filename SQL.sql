
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
  `r_group` DATETIME  NOT NULL,
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
