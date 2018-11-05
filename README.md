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

 Date: 05/11/2018 13:53:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cooperationlink
-- ----------------------------
DROP TABLE IF EXISTS `cooperationlink`;
CREATE TABLE `cooperationlink`  (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `Name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `provinceCode` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市',
  `Level` int(3) NULL DEFAULT NULL COMMENT '等级',
  `Seq` int(3) NULL DEFAULT NULL COMMENT '序号',
  `Parent` int(11) NULL DEFAULT NULL COMMENT '上级',
  `Link` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '链接',
  `QRcode` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '二维码',
  `STATUS` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `crtOptr` int(11) NULL DEFAULT NULL COMMENT '新增用户',
  `crtTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新增日期',
  `modOptr` int(11) NULL DEFAULT NULL COMMENT '修改用户',
  `modTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 36 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '合作推广链接列表' ROW_FORMAT = Dynamic;

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
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '异业合作商家数据列表' ROW_FORMAT = Dynamic;

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
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log`  (
  `logId` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `method` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Type` int(2) NULL DEFAULT NULL,
  `RequestIp` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ExceptionCode` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ExceptionDetail` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Params` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` int(2) NULL DEFAULT NULL,
  `crtOptr` int(11) NULL DEFAULT NULL COMMENT '新增用户',
  `crtTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新增日期',
  PRIMARY KEY (`logId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统日志表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`  (
  `menuId` int(11) NOT NULL AUTO_INCREMENT,
  `pmenuId` int(11) NULL DEFAULT NULL,
  `menuName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `menuDesc` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `menuIcon` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `menuAction` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` int(2) NULL DEFAULT NULL,
  `crtOptr` int(11) NULL DEFAULT NULL COMMENT '新增用户',
  `crtTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新增日期',
  `modOptr` int(11) NULL DEFAULT NULL COMMENT '修改用户',
  `modTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`menuId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '菜单信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_org
-- ----------------------------
DROP TABLE IF EXISTS `sys_org`;
CREATE TABLE `sys_org`  (
  `orgId` int(11) NOT NULL AUTO_INCREMENT,
  `porgId` int(11) NULL DEFAULT NULL,
  `orgCode` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orgName` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orgDesc` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` int(2) NULL DEFAULT NULL,
  `crtOptr` int(11) NULL DEFAULT NULL COMMENT '新增用户',
  `crtTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新增日期',
  `modOptr` int(11) NULL DEFAULT NULL COMMENT '修改用户',
  `modTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`orgId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '组织机构表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `roleId` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `roleName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `roleDesc` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色描述',
  `status` int(2) NULL DEFAULT NULL COMMENT '状态',
  `crtOptr` int(11) NULL DEFAULT NULL COMMENT '新增用户',
  `crtTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新增日期',
  `modOptr` int(11) NULL DEFAULT NULL COMMENT '修改用户',
  `modTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`roleId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu`  (
  `roleMenuId` int(11) NOT NULL AUTO_INCREMENT,
  `roleId` int(11) NULL DEFAULT NULL,
  `menuId` int(11) NULL DEFAULT NULL,
  `status` int(2) NULL DEFAULT NULL,
  `crtOptr` int(11) NULL DEFAULT NULL COMMENT '新增用户',
  `crtTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新增日期',
  `modOptr` int(11) NULL DEFAULT NULL COMMENT '修改用户',
  `modTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`roleMenuId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色权限表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `userId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户Id',
  `loginName` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '登录名',
  `passwd` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `userCode` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '工号',
  `userName` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `mobileNo` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `eMail` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `picPath` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `roleId` int(11) NULL DEFAULT NULL COMMENT '角色ID',
  `status` int(2) NULL DEFAULT NULL COMMENT '状态',
  `crtOptr` int(11) NULL DEFAULT NULL COMMENT '新增用户',
  `crtTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新增日期',
  `modOptr` int(11) NULL DEFAULT NULL COMMENT '修改用户',
  `modTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_user_org
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_org`;
CREATE TABLE `sys_user_org`  (
  `userOrgId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NULL DEFAULT NULL,
  `orgId` int(11) NULL DEFAULT NULL,
  `status` int(2) NULL DEFAULT NULL,
  `crtOptr` int(11) NULL DEFAULT NULL COMMENT '新增用户',
  `crtTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新增日期',
  `modOptr` int(11) NULL DEFAULT NULL COMMENT '修改用户',
  `modTime` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`userOrgId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户机构表' ROW_FORMAT = Dynamic;

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

SET FOREIGN_KEY_CHECKS = 1;

项目发布：
修改数据库连接
dataSource.properties
修改用户上传路径配置（FOR LINUX）
users.properties
USER-IMG-PATH=/etc/apache-tomcat-8.0.53/webapps/sfinanceUpload/

增加TOMCAT映射路径配置
<Context docBase="sfinanceUpload" path="/sfinanceUpload" reloadable="true" crossContext = "ture"/>
