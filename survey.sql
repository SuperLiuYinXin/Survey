/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : survey

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 10008

Date: 2013-05-15 19:25:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admins`
-- ----------------------------
DROP TABLE IF EXISTS `admins`;
CREATE TABLE `admins` (
  `a_id` int(11) NOT NULL,
  `a_user` varchar(255) default NULL,
  `a_pass` varchar(255) default NULL,
  `a_name` varchar(255) default NULL,
  `a_isLock` bit(1) default NULL,
  `a_lastLogTime` datetime default NULL,
  `a_logTimes` int(11) default NULL,
  `a_loginIp` varchar(255) default NULL,
  `a_addtime` datetime default NULL,
  `a_email` varchar(255) default NULL,
  `a_info` varchar(255) default NULL,
  PRIMARY KEY  (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admins
-- ----------------------------
INSERT INTO `admins` VALUES ('1', 'admin', '111111', null, null, null, null, null, null, null, null);
INSERT INTO `admins` VALUES ('3', 'zhangsan', 'zhangsan', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `answersheet`
-- ----------------------------
DROP TABLE IF EXISTS `answersheet`;
CREATE TABLE `answersheet` (
  `as_id` int(11) NOT NULL auto_increment,
  `s_id` int(11) default NULL,
  `as_result` varchar(255) default NULL,
  `as_postdate` datetime default NULL,
  `as_userIP` varchar(255) default NULL,
  PRIMARY KEY  (`as_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of answersheet
-- ----------------------------
INSERT INTO `answersheet` VALUES ('5', '3', '9:as=0;&@@&10:as=0;', '2013-05-15 00:00:00', '127.0.0.1');
INSERT INTO `answersheet` VALUES ('6', '3', '9:as=3;&@@&10:as=3;', '2013-05-15 00:00:00', '127.0.0.1');
INSERT INTO `answersheet` VALUES ('7', '7', '11:as=0;&@@&12:as=0,1,2;&@@&13:as=0,1,3;text=&@@&14:text=????', '2013-05-15 00:00:00', '127.0.0.1');

-- ----------------------------
-- Table structure for `config`
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config` (
  `id` int(11) NOT NULL,
  `c_siteName` varchar(255) default NULL,
  `c_siteURL` varchar(255) default NULL,
  `c_isOpen` bit(1) default NULL,
  `c_closeWord` varchar(255) default NULL,
  `copyright` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES ('1', '??????', 'http://www.ec-swufe.net', '', '?????? ', 'Copyright?005-2006 ???? ?ICP?05007127 ?05007127 ');

-- ----------------------------
-- Table structure for `guestbook`
-- ----------------------------
DROP TABLE IF EXISTS `guestbook`;
CREATE TABLE `guestbook` (
  `gb_id` int(11) NOT NULL,
  `gb_user` varchar(255) default NULL,
  `gb_content` varchar(255) default NULL,
  `gb_phone` varchar(255) default NULL,
  `gb_qq` varchar(255) default NULL,
  `gb_email` varchar(255) default NULL,
  `gb_postdate` datetime default NULL,
  PRIMARY KEY  (`gb_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of guestbook
-- ----------------------------
INSERT INTO `guestbook` VALUES ('1', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `link`
-- ----------------------------
DROP TABLE IF EXISTS `link`;
CREATE TABLE `link` (
  `l_id` int(11) NOT NULL,
  `l_url` varchar(255) NOT NULL,
  `l_name` varchar(255) default NULL,
  `l_img` varchar(255) default NULL,
  `l_info` varchar(255) default NULL,
  `l_isLock` char(1) default NULL,
  `l_addtime` datetime default NULL,
  PRIMARY KEY  (`l_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of link
-- ----------------------------
INSERT INTO `link` VALUES ('1', 'http://ec.swufe.edu.cn', 'aaaaa', 'images/logo_xueyuan.gif', 'aaaaaa', '1', '2013-03-15 12:00:00');
INSERT INTO `link` VALUES ('2', 'http://www.baidu.com', 'bbbb', 'images/logo_xueyuan.gif', 'bbbbbbb', '1', '2013-05-14 00:51:59');
INSERT INTO `link` VALUES ('3', 'cccc', 'cccc', 'images/logo_xueyuan.gif', 'cccc', '1', '2013-05-08 00:52:36');
INSERT INTO `link` VALUES ('4', 'dddd', 'dddd', 'images/logo_xueyuan.gif', 'dddd', '1', '2013-04-17 00:52:54');
INSERT INTO `link` VALUES ('5', 'ffff', 'fffff', 'images/logo_xueyuan.gif', 'ffffff', '1', '2013-05-06 00:53:12');

-- ----------------------------
-- Table structure for `question`
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `q_id` int(11) NOT NULL auto_increment,
  `s_id` int(11) default NULL,
  `q_type` int(11) default NULL,
  `q_head` varchar(255) default NULL,
  `q_body` varchar(255) default NULL,
  `q_result` varchar(255) default NULL,
  `q_img` varchar(255) default NULL,
  `q_jdtz` varchar(255) default NULL,
  `q_order` int(11) default NULL,
  PRIMARY KEY  (`q_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES ('9', '3', '1', 'aaa', 'aaa&$$&aaa&$$&aaa&$$&aaa', '1,0,0,1', null, 'null&null&null&null', '0');
INSERT INTO `question` VALUES ('10', '3', '1', 'bbb', 'bbb&$$&bbb&$$&bbb&$$&bbb', '1,0,0,1', null, 'null&null&null&null', '0');
INSERT INTO `question` VALUES ('11', '7', '1', '??', 'a&$$&a&$$&a&$$&a', '1,0,0,0', null, 'null&null&null&null', '0');
INSERT INTO `question` VALUES ('12', '7', '2', 'wwww', 'wwwwww&$$&www&$$&wwww&$$&wwwww', '1,1,1,0', null, 'null&null&null&null', '0');
INSERT INTO `question` VALUES ('13', '7', '4', 'www', 'www&$$&www&$$&www&$$&wwww', '1,1,0,1', null, 'null&null&null&null', '0');
INSERT INTO `question` VALUES ('14', '7', '5', '???', '', '0', null, '', '0');

-- ----------------------------
-- Table structure for `survey`
-- ----------------------------
DROP TABLE IF EXISTS `survey`;
CREATE TABLE `survey` (
  `s_id` int(11) NOT NULL auto_increment,
  `templet_id` int(11) default NULL,
  `s_name` varchar(255) NOT NULL,
  `s_desc` varchar(255) default NULL,
  `s_author` varchar(255) default NULL,
  `s_img` varchar(255) default NULL,
  `s_ipRepeat` char(5) default NULL,
  `s_createDate` datetime default NULL,
  `s_ipLimitType` varchar(255) default NULL,
  `s_ipRange` varchar(255) default NULL,
  `s_password` varchar(255) default NULL,
  `s_isOpen` char(5) default NULL,
  `s_expireDate` datetime default NULL,
  `s_isAudited` char(5) default NULL,
  `s_hits` int(11) default NULL,
  `s_usehits` int(11) default NULL,
  PRIMARY KEY  (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of survey
-- ----------------------------
INSERT INTO `survey` VALUES ('3', '0', 'aaa', 'aaa', 'aaa', null, '4', '2013-05-15 00:00:00', null, null, null, '4', '2013-06-14 00:00:00', '1', '0', '2');
INSERT INTO `survey` VALUES ('4', '0', '??', '??', '??', '1368582552566.jpg', '0', '2013-05-15 00:00:00', null, null, '1111', '0', '2013-06-14 00:00:00', '1', '0', '0');
INSERT INTO `survey` VALUES ('5', '0', '???', '???', '???', '1368582806574.jpg', '4', '2013-05-15 00:00:00', null, null, null, '4', '2013-06-14 00:00:00', '1', '0', '0');
INSERT INTO `survey` VALUES ('6', '0', '???', '???????', '????', '', '4', '2013-05-15 00:00:00', null, null, null, '4', '2013-06-14 00:00:00', '1', '0', '0');
INSERT INTO `survey` VALUES ('7', '0', '???', '????', '???', null, '0', '2013-05-15 00:00:00', null, null, '1111', '0', '2013-06-14 00:00:00', '1', '0', '1');

-- ----------------------------
-- Table structure for `templet`
-- ----------------------------
DROP TABLE IF EXISTS `templet`;
CREATE TABLE `templet` (
  `templet_id` int(11) NOT NULL,
  `templet_name` varchar(255) default NULL,
  `templet_top` varchar(255) default NULL,
  `templet_body` varchar(255) default NULL,
  `templet_bottom` varchar(255) default NULL,
  `templet_default` bit(1) default NULL,
  PRIMARY KEY  (`templet_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of templet
-- ----------------------------
INSERT INTO `templet` VALUES ('1', 'default', null, null, null, '');

-- ----------------------------
-- Table structure for `text`
-- ----------------------------
DROP TABLE IF EXISTS `text`;
CREATE TABLE `text` (
  `t_id` int(11) NOT NULL,
  `q_id` int(11) default NULL,
  `t_content` varchar(255) default NULL,
  PRIMARY KEY  (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of text
-- ----------------------------
INSERT INTO `text` VALUES ('1', '18', 'wendati');
