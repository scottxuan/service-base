-- 客户账户表
CREATE TABLE `cus_user` (
	`id` INT ( 11 ) NOT NULL AUTO_INCREMENT COMMENT 'id',
	`storeId` VARCHAR ( 32 ) NOT NULL COMMENT '小程序标识',
	`mobile` VARCHAR ( 11 ) DEFAULT NULL COMMENT '手机号码',
	`nickName` VARCHAR ( 32 ) DEFAULT NULL COMMENT '名称',
	`realName` VARCHAR ( 32 ) DEFAULT NULL COMMENT '真实姓名',
	`gender` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '性别  0-未知、1-男性、2-女性',
	`avatarUrl` VARCHAR ( 256 ) DEFAULT NULL COMMENT '头像url',
	`openId` VARCHAR ( 100 ) NOT NULL COMMENT '小程序openId',
	`unionId` VARCHAR ( 100 ) DEFAULT NULL COMMENT '小程序unionId',
	`isVIP` bit ( 1 ) NOT NULL DEFAULT b '0' COMMENT '是否是会员',
	`isLock` bit ( 1 ) NOT NULL DEFAULT b '0' COMMENT '是否锁定',
	`isDeleted` bit ( 1 ) NOT NULL DEFAULT b '0' COMMENT '是否删除',
	`createTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`lastUpdateTime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近一次修改时间',
	PRIMARY KEY ( `id` ),
	KEY `idx_openId` ( `openId` ),
	KEY `idx_storeId` ( `storeId` ),
	KEY `idx_unionId` ( `unionId` ),
KEY `idx_mobile` ( `mobile` )
) ENGINE = INNODB AUTO_INCREMENT = 2 DEFAULT CHARSET = utf8 COMMENT = '客户账户表';