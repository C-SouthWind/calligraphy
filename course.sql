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

 Date: 11/04/2020 19:49:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `course_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程编号',
  `course_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名称',
  `course_redundant` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '冗余字段',
  `course_creation_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `course_amend_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  `course_state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程状态',
  PRIMARY KEY (`course_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, '春季一期', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `course` VALUES (2, '秋季一期', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `course` VALUES (3, '暑假一期', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `course` VALUES (4, '全年三期', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `course` VALUES (5, '春季暑假两期', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `course` VALUES (6, '秋季春季两期', NULL, '2020-04-10', '2020-04-10', '1');
INSERT INTO `course` VALUES (7, '暑假秋季两期', NULL, '2020-04-10', '2020-04-10', '1');

SET FOREIGN_KEY_CHECKS = 1;
