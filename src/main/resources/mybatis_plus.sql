/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : mybatis_plus

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2019-01-26 13:15:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` char(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'asdsa', 'bmnbnmbn@163.com', '0', '20');
INSERT INTO `t_user` VALUES ('2', 'asdsa', 'ssdf@qq.com', '1', '20');
INSERT INTO `t_user` VALUES ('3', 'asdsa', 'ssdf@qq.com', '1', '20');
INSERT INTO `t_user` VALUES ('4', 'asdsa', 'ssdf@qq.com', '1', '20');
INSERT INTO `t_user` VALUES ('5', 'asdsa', 'ssdf@qq.com', '1', '20');
INSERT INTO `t_user` VALUES ('6', 'asdsa', 'ssdf@qq.com', '1', '20');
INSERT INTO `t_user` VALUES ('7', 'asdsa', 'ssdf@qq.com', '1', '20');

-- ----------------------------
-- Table structure for t_user_recharge
-- ----------------------------
DROP TABLE IF EXISTS `t_user_recharge`;
CREATE TABLE `t_user_recharge` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `token` varchar(255) DEFAULT NULL,
  `money` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_user_recharge
-- ----------------------------
INSERT INTO `t_user_recharge` VALUES ('1', '112', '6000');
