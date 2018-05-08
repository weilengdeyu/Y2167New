/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : newsxsh

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2018-05-08 17:50:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for news_comment
-- ----------------------------
DROP TABLE IF EXISTS `news_comment`;
CREATE TABLE `news_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `newid` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fk_details_comment` (`newid`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_comment
-- ----------------------------
INSERT INTO `news_comment` VALUES ('1', null, '111', '11', '2018-05-06 15:45:08');
INSERT INTO `news_comment` VALUES ('2', null, '111', '111', '2018-05-06 15:48:50');
INSERT INTO `news_comment` VALUES ('3', null, '新闻评论', '张靓颖', '2018-05-06 15:49:38');

-- ----------------------------
-- Table structure for news_detail
-- ----------------------------
DROP TABLE IF EXISTS `news_detail`;
CREATE TABLE `news_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_detail
-- ----------------------------
INSERT INTO `news_detail` VALUES ('4', 'JSP2', 'JSP实战', '微冷的雨', '2018-05-08 13:51:12');
