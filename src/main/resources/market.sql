CREATE DATABASE `market`;
use `market`;

DROP TABLE IF EXISTS `pms_brand`;
CREATE TABLE `pms_brand` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `name` varchar(60) DEFAULT NULL,
    `first_letter` varchar(8) DEFAULT NULL COMMENT '首字母',
    `brand_story` text COMMENT '品牌故事',
    `big_pic` varchar(255) DEFAULT NULL COMMENT '专区大图',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COMMENT='品牌表';

INSERT INTO `pms_brand` VALUES ('1', '万和', 'W', 'Victoria', 'http://macro-oss.oss-cn-shenzhen.aliyuncs.com/mall/images/20180607/timg(5).jpg');