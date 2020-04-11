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

 Date: 11/04/2020 19:56:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students`  (
  `students_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生编号',
  `students_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学生姓名',
  `students_money` int(255) NULL DEFAULT NULL COMMENT '缴费数目',
  `course_id` int(255) NULL DEFAULT NULL COMMENT '课程时间',
  `teaching_id` int(255) NULL DEFAULT NULL COMMENT '授课时间',
  `parents_tel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家长电话',
  `start_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '入班时间',
  `students_redundant` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `students_amend_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改时间',
  `students_state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学生状态',
  PRIMARY KEY (`students_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of students
-- ----------------------------
INSERT INTO `students` VALUES (2, '张三', 600, 1, 2, '11111111111', '2020-04-11', '2020-04-11', '2020-04-11', '1');
INSERT INTO `students` VALUES (3, '李四', 600, 1, 1, '11221212121', '2020-04-11', '2020-04-11', '2020-04-11', '1');
INSERT INTO `students` VALUES (4, '王五', 600, 2, 2, '12312312312', '2020-04-12', '2020-04-11', '2020-04-11', '2');
INSERT INTO `students` VALUES (6, '赵六', 600, 6, 6, '12345678911', '2020-04-20', '2020-04-20', '2020-04-11', '2');
INSERT INTO `students` VALUES (7, '孙九', 600, 2, 2, '12345678911', '2020-04-27', '2020-04-27', '2020-04-11', '2');
INSERT INTO `students` VALUES (8, '赵十1', 600, 1, 1, '12345678917', '2020-04-27', '2020-04-27', '2020-04-11', '2');
INSERT INTO `students` VALUES (9, 'abc', 600, 1, 1, '12345678998', '2020-04-11', '2020-04-11', '2020-04-11', '2');

SET FOREIGN_KEY_CHECKS = 1;
