# sfinance
忻铭科技官网-异业合作后台

创建数据库：
CREATE DATABASE sfinance;
SQL脚本：
/*
 Navicat Premium Data Transfer

 Source Server         : localhost-root
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : sfinance

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 06/08/2018 14:06:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cooperationlist
-- ----------------------------
DROP TABLE IF EXISTS `cooperationlist`;
CREATE TABLE `cooperationlist`  (
  `cooperationId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商户Id',
  `cooperationName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商户名称',
  `tradeCode` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所属行业代码',
  `provinceCode` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所属省份代码',
  `SROBOT` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'SR数量',
  `WECHAT` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '微信客户数量',
  `BEIJING` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '北京微信客户数量',
  `TIANJIN` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '天津微信客户数量',
  `SHANGHAI` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上海微信客户数量',
  `CHONGQING` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '重庆微信客户数量',
  `HEBEI` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '河北微信客户数量',
  `HENAN` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '河南微信客户数量',
  `YUNNAN` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '云南微信客户数量',
  `LIAONING` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '辽宁微信客户数量',
  `HEILONGJIANG` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '黑龙江微信客户数量',
  `HUNAN` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '湖南微信客户数量',
  `ANHUI` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '安徽微信客户数量',
  `SHANDONG` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '山东微信客户数量',
  `XINJIANG` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新疆微信客户数量',
  `JIANGSU` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '江苏微信客户数量',
  `ZHEJIANG` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '浙江微信客户数量',
  `JIANGXI` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '江西微信客户数量',
  `HUBEI` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '湖北微信客户数量',
  `GUANGXI` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '广西微信客户数量',
  `GANSU` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '甘肃微信客户数量',
  `SHANXI1` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '山西微信客户数量',
  `NEIMENGGU` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '内蒙古微信客户数量',
  `SHANXI2` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '陕西微信客户数量',
  `JILIN` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '吉林微信客户数量',
  `FUJIAN` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '福建微信客户数量',
  `GUIZHOU` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '贵州微信客户数量',
  `GUANGDONG` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '广东微信客户数量',
  `QINGHAI` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '青海微信客户数量',
  `XIZANG` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '西藏微信客户数量',
  `SICHUANG` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '四川微信客户数量',
  `NINGXIA` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '宁夏微信客户数量',
  `HAINAN` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '海南微信客户数量',
  `TAIWAN` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '台湾微信客户数量',
  `XIANGGANG` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '香港微信客户数量',
  `AOMEN` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '澳门微信客户数量',
  `picpath` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `STATUS` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `crtOptr` int(11) NULL DEFAULT NULL COMMENT '新增用户',
  `crtTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新增日期',
  `modOptr` int(11) NULL DEFAULT NULL COMMENT '修改用户',
  `modTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`cooperationId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '异业合作商家数据列表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cooperationlist
-- ----------------------------
INSERT INTO `cooperationlist` VALUES (1, '好乐迪', 'R', 'SHANGHAI', '30', '11150', '1000', '2000', '5000', '0', '150', '0', '3000', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 'Upload/2018-08-06-10-23-05/480_wonder_world.jpg', 'Y', NULL, NULL, NULL, '2018-08-02 19:58:21');
INSERT INTO `cooperationlist` VALUES (2, '满记甜品', 'H', 'SHANGHAI', '20', '1000', '1000', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 'Upload/2018-08-05-18-59-35/480_My_Own_Secret.jpg', 'Y', NULL, NULL, NULL, NULL);
INSERT INTO `cooperationlist` VALUES (10, '测试', 'A', 'BEIJING', '11', '11', '11', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 'Upload/2018-08-05-18-51-56/480_0105.jpg', 'Y', NULL, NULL, NULL, NULL);
INSERT INTO `cooperationlist` VALUES (11, '1111', 'C', 'SHANGHAI', '11', '1111', '1111', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 'Upload/2018-08-05-21-36-18/480_taste.jpg', 'Y', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for detailreport
-- ----------------------------
DROP TABLE IF EXISTS `detailreport`;
CREATE TABLE `detailreport`  (
  `detailId` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `cooperationId` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商户ID',
  `cooperationName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商户名称',
  `RPType` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '统计项类型',
  `RPSeq` int(10) NOT NULL COMMENT '统计项顺序',
  `RPName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '统计项名称',
  `RPDATA` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '统计项值',
  `crtOptr` int(11) NULL DEFAULT NULL COMMENT '新增用户',
  `crtTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新增日期',
  `modOptr` int(11) NULL DEFAULT NULL COMMENT '修改用户',
  `modTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`detailId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商户报表明细' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of detailreport
-- ----------------------------
INSERT INTO `detailreport` VALUES (1, '1', '好乐迪', 'AGE', 1, '0~18', '200', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (2, '1', '好乐迪', 'AGE', 2, '19~30', '310', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (3, '1', '好乐迪', 'AGE', 3, '31~40', '234', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (4, '1', '好乐迪', 'AGE', 4, '41~50', '11', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (5, '1', '好乐迪', 'AGE', 5, '51~60', '123', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (6, '1', '好乐迪', 'AGE', 6, '61~∞', '32', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (7, '1', '好乐迪', 'ADD', 1, '1月', '10', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (8, '1', '好乐迪', 'ADD', 2, '2月', '20', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (9, '1', '好乐迪', 'ADD', 3, '3月', '30', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (10, '1', '好乐迪', 'ADD', 4, '4月', '40', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (11, '1', '好乐迪', 'ADD', 5, '5月', '50', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (12, '1', '好乐迪', 'ADD', 6, '6月', '60', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (13, '1', '好乐迪', 'ADD', 7, '7月', '70', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (14, '1', '好乐迪', 'ADD', 8, '8月', '80', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (15, '1', '好乐迪', 'ADD', 9, '9月', '90', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (16, '1', '好乐迪', 'ADD', 10, '10月', '50', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (17, '1', '好乐迪', 'ADD', 11, '11月', '60', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (18, '1', '好乐迪', 'ADD', 12, '12月', '40', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (19, '1', '好乐迪', 'AGE', 7, '70-100', '100', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (20, '1', '好乐迪', 'AGE', 8, '80-100', '10', NULL, NULL, NULL, NULL);
INSERT INTO `detailreport` VALUES (21, '1', '好乐迪', 'AGE', 9, '90-100', '11', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for provincelist
-- ----------------------------
DROP TABLE IF EXISTS `provincelist`;
CREATE TABLE `provincelist`  (
  `provinceId` int(11) NOT NULL AUTO_INCREMENT COMMENT '省份Id',
  `provinceCode` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '省份代码',
  `provinceName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '省份名称',
  `crtOptr` int(11) NULL DEFAULT NULL COMMENT '新增用户',
  `crtTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新增日期',
  `modOptr` int(11) NULL DEFAULT NULL COMMENT '修改用户',
  `modTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`provinceId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 35 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '省份列表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of provincelist
-- ----------------------------
INSERT INTO `provincelist` VALUES (1, 'BEIJING', '北京', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (2, 'TIANJIN', '天津', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (3, 'SHANGHAI', '上海', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (4, 'CHONGQING', '重庆', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (5, 'HEBEI', '河北', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (6, 'HENAN', '河南', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (7, 'YUNNAN', '云南', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (8, 'LIAONING', '辽宁', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (9, 'HEILONGJIANG', '黑龙江', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (10, 'HUNAN', '湖南', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (11, 'ANHUI', '安徽', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (12, 'SHANDONG', '山东', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (13, 'XINJIANG', '新疆', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (14, 'JIANGSU', '江苏', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (15, 'ZHEJIANG', '浙江', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (16, 'JIANGXI', '江西', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (17, 'HUBEI', '湖北', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (18, 'GUANGXI', '广西', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (19, 'GANSU', '甘肃', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (20, 'SHANXI1', '山西', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (21, 'NEIMENGGU', '内蒙古', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (22, 'SHANXI2', '陕西', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (23, 'JILIN', '吉林', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (24, 'FUJIAN', '福建', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (25, 'GUIZHOU', '贵州', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (26, 'GUANGDONG', '广东', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (27, 'QINGHAI', '青海', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (28, 'XIZANG', '西藏', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (29, 'SICHUANG', '四川', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (30, 'NINGXIA', '宁夏', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (31, 'HAINAN', '海南', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (32, 'TAIWAN', '台湾', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (33, 'XIANGGANG', '香港', NULL, NULL, NULL, NULL);
INSERT INTO `provincelist` VALUES (34, 'AOMEN', '澳门', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for tradelist
-- ----------------------------
DROP TABLE IF EXISTS `tradelist`;
CREATE TABLE `tradelist`  (
  `tradeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '行业Id',
  `tradeCode` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '行业代码',
  `tradeName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '行业名称',
  `crtOptr` int(11) NULL DEFAULT NULL COMMENT '新增用户',
  `crtTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新增日期',
  `modOptr` int(11) NULL DEFAULT NULL COMMENT '修改用户',
  `modTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`tradeId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '行业分类列表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tradelist
-- ----------------------------
INSERT INTO `tradelist` VALUES (1, 'A', '农、林、牧、渔业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (2, 'B', '采矿业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (3, 'C', '制造业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (4, 'D', '电力、热力、燃气及水生产和供应业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (5, 'E', '建筑业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (6, 'F', '批发和零售业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (7, 'G', '交通运输、仓储和邮政业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (8, 'H', '住宿和餐饮业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (9, 'I', '信息传输、软件和信息技术服务业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (10, 'J', '金融业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (11, 'K', '房地产业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (12, 'L', '租赁和商务服务业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (13, 'M', '科学研究和技术服务业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (14, 'N', '水利、环境和公共设施管理业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (15, 'O', '居民服务、修理和其他服务业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (16, 'P', '教育', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (17, 'Q', '卫生和社会工作', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (18, 'R', '文化、体育和娱乐业', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (19, 'S', '公共管理、社会保障和社会组织', NULL, NULL, NULL, NULL);
INSERT INTO `tradelist` VALUES (20, 'T', '国际组织', NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;

项目发布：
修改数据库连接
dataSource.properties
修改用户上传路径配置（FOR LINUX）
users.properties
USER-IMG-PATH=/etc/apache-tomcat-8.0.53/webapps/sfinanceUpload/

增加TOMCAT映射路径配置
<Context docBase="sfinanceUpload" path="/sfinanceUpload" reloadable="true" crossContext = "ture"/>
