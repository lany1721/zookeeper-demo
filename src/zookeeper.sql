/*
 Navicat Premium Data Transfer

 Source Server         : Localhost MySQL5.7
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : zookeeper

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 03/03/2021 15:58:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `product_id` int(11) NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 351 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (331, 1, 1);
INSERT INTO `order` VALUES (332, 1, 1);
INSERT INTO `order` VALUES (333, 1, 1);
INSERT INTO `order` VALUES (334, 1, 1);
INSERT INTO `order` VALUES (335, 1, 1);
INSERT INTO `order` VALUES (336, 1, 1);
INSERT INTO `order` VALUES (337, 1, 1);
INSERT INTO `order` VALUES (338, 1, 1);
INSERT INTO `order` VALUES (339, 1, 1);
INSERT INTO `order` VALUES (340, 1, 1);
INSERT INTO `order` VALUES (341, 1, 1);
INSERT INTO `order` VALUES (342, 1, 1);
INSERT INTO `order` VALUES (343, 1, 1);
INSERT INTO `order` VALUES (344, 1, 1);
INSERT INTO `order` VALUES (345, 1, 1);
INSERT INTO `order` VALUES (346, 1, 1);
INSERT INTO `order` VALUES (347, 1, 1);
INSERT INTO `order` VALUES (348, 1, 1);
INSERT INTO `order` VALUES (349, 1, 1);
INSERT INTO `order` VALUES (350, 1, 1);

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `stock` int(11) NULL DEFAULT NULL,
  `version` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, '锦鲤', 10, 1);

SET FOREIGN_KEY_CHECKS = 1;
