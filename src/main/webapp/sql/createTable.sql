########################################################
#SQL 相关语句
########################################################
#重新设置自增初始值
#ALTER TABLE 表名 AUTO_INCREMENT=1;
#查看表结构
#desc 表名;
#删除数据表
#DROP TABLE 表名;
#往表里插入数据
#INSERT INTO room_config_info (字段名) VALUES (内容)
#修改表结构,增加表字段,在哪个字段之后
#ALTER TABLE table_name
#ADD column_name datatype [AFTER column_name]

########################################################
#name:机器表
#author:kuang
#date:2018-01-22
#version:1.0
#继续用原表结构,该建表语句废止.
########################################################
CREATE TABLE `machine` (
  `machine_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '机器id',
  `prize_id` bigint(20) NOT NULL COMMENT '奖品id',
  `machine_status` tinyint(4) NOT NULL COMMENT '机器状态，0-游戏中，1-空闲中',
  `red_packet_status` tinyint(4) NOT NULL COMMENT '红包状态，0-非红包机器，1-红包机器',
  `mac_add` varchar(32) NOT NULL COMMENT 'mac地址',
  `push1` varchar(128) NOT NULL COMMENT '推流1',
  `push2` varchar(128) NOT NULL COMMENT '推流2',
  `is_use` tinyint(1) NOT NULL DEFAULT '1' COMMENT '可用标志，1-可用，0-不可用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(32) NOT NULL DEFAULT 'sys' COMMENT '创建者',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(32) NOT NULL DEFAULT 'sys' COMMENT '更新者',
  PRIMARY KEY (`machine_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT='机器表';

########################################################
#name:奖品表
#author:kuang
#date:2018-01-22
#version:1.0
#继续用原表结构,该建表语句废止.
########################################################
CREATE TABLE `prize` (
  `prize_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '奖品id',
  `prize_name` varchar(20) NOT NULL COMMENT '奖品名称',
  `prize_context` varchar(128) NOT NULL COMMENT '奖品介绍',
  `prize_value` int(4) NOT NULL COMMENT '奖品价值',
  `play_value` int(4) NOT NULL COMMENT '抽奖消耗',
  `probability` int(4) NOT NULL COMMENT '概率',
  `is_use` tinyint(1) NOT NULL DEFAULT '1' COMMENT '可用标志，1-可用，0-不可用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(32) NOT NULL DEFAULT 'sys' COMMENT '创建者',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(32) NOT NULL DEFAULT 'sys' COMMENT '更新者',
  PRIMARY KEY (`prize_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT='奖品表';

########################################################
#name:机器获奖记录表
#author:kuang
#date:2018-01-22
#version:1.0
#继续用原表结构,该建表语句废止.
########################################################
CREATE TABLE `machine_award_info_1` (
  `machine_award_id` varchar(32) NOT NULL COMMENT '主键id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `machine_id` bigint(20) NOT NULL COMMENT '机器id',
  `prize_id` bigint(20) NOT NULL COMMENT '奖品id',
  `is_use` tinyint(1) NOT NULL DEFAULT '1' COMMENT '可用标志，1-可用，0-不可用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(32) NOT NULL DEFAULT 'sys' COMMENT '创建者',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(32) NOT NULL DEFAULT 'sys' COMMENT '更新者',
  PRIMARY KEY (`machine_award_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT='机器获奖记录表';

########################################################
#name:用户抓取记录表
#author:kuang
#date:2018-01-22
#version:1.0
#继续用原表结构,该建表语句废止.
########################################################
CREATE TABLE `user_oper_info_1` (
  `user_oper_id` varchar(32) NOT NULL COMMENT '主键id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `machine_id` bigint(20) NOT NULL COMMENT '房间id',
  `prize_id` bigint(20) NOT NULL COMMENT '奖品id',
  `final_result` tinyint(1) NOT NULL COMMENT '抓取结果',
  `set_result` tinyint(1) NOT NULL COMMENT '设定结果',
  `is_use` tinyint(1) NOT NULL DEFAULT '1' COMMENT '可用标志，1-可用，0-不可用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(32) NOT NULL DEFAULT 'sys' COMMENT '创建者',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(32) NOT NULL DEFAULT 'sys' COMMENT '更新者',
  PRIMARY KEY (`user_oper_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT='用户抓取记录表';

########################################################
#name:个人资料表
#author:kuang
#date:2018-01-22
#update:2018-01-23
#version:1.0
#继续用原表结构,该建表语句废止.
########################################################
CREATE TABLE `user_info` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_login_id` bigint(20) NOT NULL COMMENT '用户登录id',
  `user_login_channel` varchar(10) NOT NULL DEFAULT '0000' COMMENT '用户登录渠道',
  `user_name` varchar(16) NOT NULL COMMENT '个人姓名',
  `user_image_num` int(24) NOT NULL COMMENT '头像序号',
  `experience` int(8) NOT NULL COMMENT '经验值',
  `gold` int(10) NOT NULL COMMENT '金币值',
  `red_packet_value` int(2) NOT NULL COMMENT '红包值',
  `invite_code` char(6) NOT NULL COMMENT '个人推荐码',
  `exchange_code` char(6) NOT NULL COMMENT '邀请码',
  `user_passwd` varchar(32) COMMENT '独立密码',
  `user_pay_flag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '用户付费标记，1-付费，0-非付费',
  `is_use` tinyint(1) NOT NULL DEFAULT '1' COMMENT '可用标志，1-可用，0-不可用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(32) NOT NULL DEFAULT 'sys' COMMENT '创建者',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(32) NOT NULL DEFAULT 'sys' COMMENT '更新者',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT='个人资料表';

########################################################
#name:获奖发货记录表
#author:kuang
#date:2018-01-23
#version:1.0
#继续用原表结构,该建表语句废止.
########################################################
CREATE TABLE `user_award_delivery_info_1` (
  `info_id` varchar(32) NOT NULL COMMENT '主键id',
  `machine_award_id` varchar(32) NOT NULL COMMENT '机器获奖记录表的主键id',
  `prize_name` varchar(20) NOT NULL COMMENT '奖品名称',
  `prize_number` varchar(10) NOT NULL COMMENT '奖品编号',
  `status` tinyint(1) NOT NULL COMMENT '状态，1-寄存中，2-待发货，3-已发货，4-已签收',
  `value` int(4) NOT NULL COMMENT '兑换数值',
  `courier_company` varchar(30) COMMENT '快递公司',
  `courier_number` varchar(30) COMMENT '快递单号',
  `consignee` varchar(20) COMMENT '收货人',
  `telephone` varchar(11) COMMENT '联系电话',
  `message` varchar(150) COMMENT '寄语',
  `address` varchar(100) COMMENT '收货地址',
  `is_use` tinyint(1) NOT NULL DEFAULT '1' COMMENT '可用标志，1-可用，0-不可用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(32) NOT NULL DEFAULT 'sys' COMMENT '创建者',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(32) NOT NULL DEFAULT 'sys' COMMENT '更新者',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT='获奖发货记录表';

########################################################
#name:房间配置信息表
#author:kuang
#date:2018-01-29
#version:1.0
########################################################
CREATE TABLE `room_config_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `machine_id` bigint(20) NOT NULL COMMENT '机器表的主键id',
  `game_time` int(3) NOT NULL DEFAULT '30' COMMENT '游戏总时长',
  `claw_power_grab` int(3) NOT NULL DEFAULT '67' COMMENT '表示抓起爪力(1—100)',
  `claw_power_up` int(3) NOT NULL DEFAULT '33' COMMENT '表示到顶爪力(1—100)',
  `claw_power_move` int(3) NOT NULL DEFAULT '21' COMMENT '表示移动爪力(1—100)',
  `up_height` int(2) NOT NULL DEFAULT '7' COMMENT '抓起高度（0–10）底部到顶部分成10份',
  `effective` tinyint(1) NOT NULL DEFAULT '1' COMMENT '可用标志，1-可用，0-不可用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT='房间配置信息表';

#往[房间配置信息表]里插数据,测试用
INSERT INTO room_config_info (
  machine_id,
  game_time,
  claw_power_grab,
  claw_power_up,
  claw_power_move,
  up_height) VALUES (
  31,
  40,
  80,
  45,
  37,
  8);

#修改用户登录表,user_login,增加字段:用户电话[user_tel],第三方用户登录ID[login_id]
ALTER TABLE user_login
ADD login_id varchar(60) COMMENT '第三方用户登录ID' AFTER token_id,
ADD user_tel varchar(60) COMMENT '用户电话' AFTER login_id;

#修改个人资料表,user_base,增加字段:用户渠道[user_login_channel],用户付费标记[user_pay_flag]
#用户积分值[user_point]
ALTER TABLE user_base
ADD `user_login_channel` varchar(10) DEFAULT 'APP' COMMENT '用户登录渠道:APP,H5' AFTER exchange_code,
ADD `user_pay_flag` tinyint(1) DEFAULT '0' COMMENT '用户付费标记，1-付费，0-非付费' AFTER user_login_channel,
ADD `user_point` int(10) DEFAULT '0' COMMENT '用户积分值' AFTER red_packet_value;

#往表[金币套餐表]里增加记录
INSERT INTO `gold_package` (`package_no`,`actual_gold`,`pay_amt`,`effective`) VALUES ('10','60','6.00','1');
INSERT INTO `gold_package` (`package_no`,`actual_gold`,`pay_amt`,`effective`) VALUES ('11','300','30.00','1');
INSERT INTO `gold_package` (`package_no`,`actual_gold`,`pay_amt`,`effective`) VALUES ('12','1180','98.00','1');
INSERT INTO `gold_package` (`package_no`,`actual_gold`,`pay_amt`,`effective`) VALUES ('13','3980','298.00','1');
INSERT INTO `gold_package` (`package_no`,`actual_gold`,`pay_amt`,`effective`) VALUES ('14','9980','698.00','1');
INSERT INTO `gold_package` (`package_no`,`actual_gold`,`pay_amt`,`effective`) VALUES ('15','99999','4999.00','1');

#修改机器表，加入即构配置的房间相关信息，增加字段：房间ID【room_id】,房间名【room_name】
ALTER TABLE machine
ADD room_id varchar(32) COMMENT '房间ID,对接即构用',
ADD room_name varchar(32) COMMENT '房间名,对接即构用';

#机器表的测试数据追加，加入即构分配的房间信息。
INSERT INTO `machine` (
  `id`,
  `prize_id`,
  `machine_status`,
  `red_packet_status`,
  `effective`,
  `mac_add`,
  `push1`,
  `push2`,
  `room_id`,
  `room_name`
)
VALUES
  (
    '32',
    '32',
    '1',
    '0',
    '1',
    '3A 54 7B 54 FB 03',
    'WWJ_ZEGO_STREAM_325eb141d299_2',
    'WWJ_ZEGO_STREAM_325eb141d299',
    'WWJ_ZEGO_325eb141d299_No.1',
    'WWJ_ZEGO_325eb141d299_No.1'
  );

########################################################
#name:即构回调流创建记录表
#author:kuang
#date:2018-02-06
#version:1.0
########################################################
CREATE TABLE `stream_create_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `zego_id` bigint(20) COMMENT 'Server端参数 流ID 自增数字 流唯一标识',
  `live_id` bigint(20) COMMENT 'Server端参数 直播ID 自增数字 直播唯一标识',
  `channel_id` varchar(255) COMMENT '频道ID 对应客户端RoomID 不超过255字节',
  `title` varchar(255) COMMENT '标题 不超过255字节',
  `stream_alias` varchar(255) COMMENT '流名 对应客户端StreamID 不超过255字节',
  `publish_id` varchar(255) COMMENT '发布者ID 对应客户端UserID 不超过255字节',
  `publish_name` varchar(255) COMMENT '发布者名字 对应客户端UserName 不超过255字节',
  `rtmp_url_0` varchar(1024) COMMENT 'RTMP拉流地址 不超过1024字节',
  `rtmp_url_1` varchar(1024) COMMENT 'RTMP拉流地址 不超过1024字节',
  `hls_url_0` varchar(1024) COMMENT 'HLS拉流地址 不超过1024字节',
  `hls_url_1` varchar(1024) COMMENT 'HLS拉流地址 不超过1024字节',
  `hdl_url_0` varchar(1024) COMMENT 'HDL拉流地址 不超过1024字节',
  `hdl_url_1` varchar(1024) COMMENT 'HDL拉流地址 不超过1024字节',
  `pic_url_0` varchar(255) COMMENT '截图地址 不超过255字节',
  `create_time_zego` bigint(20) COMMENT '创建时间 Uinx时间戳',
  `timestamp_zego` bigint(20) COMMENT '服务器当前时间 Uinx时间戳',
  `nonce` varchar(255) COMMENT '随机数',
  `signature` varchar(255) COMMENT '检验串 见检验说明',
  `effective` tinyint(1) NOT NULL DEFAULT '1' COMMENT '可用标志，1-可用，0-不可用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT='即构回调流创建记录表';

########################################################
#name:即构回调流关闭记录表
#author:kuang
#date:2018-02-06
#version:1.0
########################################################
CREATE TABLE `stream_close_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `zego_id` bigint(20) COMMENT 'Server端参数 流ID 自增数字 流唯一标识',
  `type` tinyint(1) COMMENT '关闭类型 0为正常关闭，非0为异常关闭（1为后台超时关闭，2为同一主播直播关闭之前没有关闭的流）',
  `channel_id` varchar(255) COMMENT '频道ID 对应客户端RoomID 不超过255字节',
  `stream_alias` varchar(255) COMMENT '流名 对应客户端StreamID 不超过255字节',
  `third_define_data` varchar(255) COMMENT '第三方自定义数据 默认为空字符串 不超过255字节',
  `timestamp_zego` bigint(20) COMMENT '服务器当前时间 Uinx时间戳',
  `nonce` varchar(255) COMMENT '随机数',
  `signature` varchar(255) COMMENT '检验串 见检验说明',
  `effective` tinyint(1) NOT NULL DEFAULT '1' COMMENT '可用标志，1-可用，0-不可用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT='即构回调流关闭记录表';