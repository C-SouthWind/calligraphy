/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : calligraphy

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 11/04/2020 19:50:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for teaching
-- ----------------------------
DROP TABLE IF EXISTS `teaching`;
CREATE TABLE `teaching`  (
  `teaching_id` int(255) NOT NULL AUTO_INCREMENT COMMENT '授课时间ID',
  `teaching_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '授课时间',
  `teaching_time_redundant` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '冗余字段',
  `teaching_time_creation_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `teaching_time_amend_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  `teaching_time_state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '授课状态',
  PRIMARY KEY (`teaching_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teaching
-- ----------------------------
INSERT INTO `teaching` VALUES (1, '周六上午', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `teaching` VALUES (2, '周六下午', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `teaching` VALUES (3, '周六晚上', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `teaching` VALUES (4, '周日上午', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `teaching` VALUES (5, '周日下午', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `teaching` VALUES (6, '一三五上午', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `teaching` VALUES (7, '一三五下午', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `teaching` VALUES (8, '一三五晚上', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `teaching` VALUES (9, '二四六上午', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `teaching` VALUES (10, '二四六下午', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `teaching` VALUES (11, '二四六晚上', NULL, '2020-04-10', '2020-04-10', '1');

SET FOREIGN_KEY_CHECKS = 1;
