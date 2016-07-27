/*
SQLyog v10.2 
MySQL - 5.6.24 : Database - tao
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tao` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `tao`;

/*Table structure for table `t_sys_permission` */

DROP TABLE IF EXISTS `t_sys_permission`;

CREATE TABLE `t_sys_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(100) NOT NULL DEFAULT '' COMMENT '编码',
  `resource_id` int(11) DEFAULT NULL COMMENT '资源ID',
  `description` varchar(255) NOT NULL DEFAULT '' COMMENT '描述',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=134 DEFAULT CHARSET=utf8;

/*Data for the table `t_sys_permission` */

insert  into `t_sys_permission`(`id`,`code`,`resource_id`,`description`,`create_time`) values (5,'user:add',2,'新增用户','2015-01-27 00:28:19'),(6,'user:modify',2,'修改用户','2015-01-27 00:28:44'),(7,'user:delete',2,'删除用户','2015-01-27 00:29:00'),(8,'user:enable',2,'启用用户','2015-01-27 00:30:18'),(9,'resource:add',3,'新增菜单','2015-01-27 00:30:43'),(10,'resource:modify',3,'修改菜单','2015-01-27 00:31:02'),(11,'resource:delete',3,'删除菜单','2015-01-27 00:31:20'),(12,'role:add',4,'新增角色','2015-01-27 00:32:01'),(13,'role:modify',4,'编辑角色信息','2015-01-27 00:32:19'),(14,'role:delete',4,'删除角色','2015-01-27 00:32:37'),(15,'role:permission_setup',4,'设置权限','2015-01-27 00:34:48'),(16,'permission:add',5,'新增权限','2015-01-27 00:35:34'),(17,'permission:delete',5,'删除权限','2015-01-27 00:35:53'),(18,'user:view',2,'查看用户信息','2015-01-27 00:36:21'),(19,'resource:view',3,'查看菜单','2015-01-27 00:36:43'),(20,'role:view',4,'查看角色信息','2015-01-27 00:37:00'),(21,'permission:view',5,'查看权限','2015-01-27 00:37:19'),(22,'advertiser:view',24,'查看广告主','2015-01-27 17:45:55'),(23,'advertiser:add',24,'添加广告主','2015-01-27 18:30:28'),(24,'developer:view',11,'开发者查看账户信息','2015-01-29 19:59:52'),(25,'developer:add',11,'添加账户','2015-01-29 20:00:36'),(26,'adpackage:view',25,'查看广告包','2015-01-30 17:01:57'),(27,'advertiser:modify',24,'修改广告主','2015-02-02 23:25:18'),(28,'developer:modify',11,'修改开发者信息账户','2015-02-03 00:41:04'),(29,'developer:freeze',11,'冻结开发者账户','2015-02-03 00:42:09'),(30,'developer:normal',11,'解冻开发者账户','2015-02-03 00:42:58'),(31,'developer:disable',11,'封存开发者账户','2015-02-03 03:36:24'),(32,'adpackage:add',25,'添加广告包','2015-02-03 18:19:32'),(33,'developer:savePayment',11,'保存付款方式','2015-02-03 22:41:28'),(34,'application:view',26,'查看媒体应用','2015-02-04 01:53:38'),(35,'application:add',26,'添加应用','2015-02-04 19:13:47'),(36,'application:modify',26,'修改应用','2015-02-04 19:14:46'),(37,'adpackage:modify',25,'修改广告包','2015-02-04 23:15:47'),(38,'adpackage:delete',25,'删除广告包','2015-02-05 01:08:13'),(39,'adplacement:view',29,'查看投放','2015-02-05 10:38:32'),(40,'adplacement:modify',29,'修改投放','2015-02-06 10:03:10'),(41,'application:freeze',26,'冻结开发者应用','2015-02-07 00:19:00'),(42,'application:normal',26,'解冻开发者应用','2015-02-07 00:19:20'),(43,'application:disable',26,'封闭开发者应用','2015-02-07 00:20:09'),(44,'application:pause',26,'暂停开发者应用','2015-02-07 00:20:56'),(45,'channel:view',30,'查看媒体渠道信息','2015-02-09 10:07:54'),(46,'channel:add',30,'添加媒体渠道','2015-02-09 10:08:21'),(47,'channel:modify',30,'修改媒体渠道','2015-02-09 10:09:22'),(48,'appPackage:add',31,'上传应用包','2015-02-11 22:21:47'),(49,'appPackage:view',31,'查看应用包','2015-02-11 22:22:10'),(50,'appPackage:modify',31,'修改应用包','2015-02-11 22:22:40'),(51,'appPackage:download',31,'下载应用包','2015-02-11 22:23:19'),(52,'application:check',31,'应用审核','2015-02-12 00:42:06'),(53,'application:grade',31,'管理应用等级','2015-02-12 23:12:54'),(54,'application:rate',31,'管理媒体应用配比','2015-02-12 23:13:36'),(55,'ad:view',32,'查看广告','2015-02-12 15:21:36'),(56,'fee:view',36,'查看费用记录','2015-02-13 14:03:39'),(58,'financeDev:view',51,'查看媒体账户信息','2015-03-02 11:30:16'),(59,'financeDev:add',51,'新增开发者账户','2015-03-02 14:04:02'),(60,'financeDetail:view',53,'查看媒体收入明细','2015-03-02 20:05:43'),(61,'notice:view',52,'查看新闻公告','2015-03-03 04:31:40'),(62,'notice:add',52,'增加新闻公告','2015-03-03 04:32:07'),(63,'notice:modify',52,'修改新闻公告','2015-03-03 04:32:32'),(64,'mail:view',54,'查看邮件列表','2015-03-03 04:33:08'),(65,'mail:add',54,'增加邮件','2015-03-03 04:33:33'),(66,'mail:modify',54,'修改邮件','2015-03-03 04:33:56'),(67,'financeDev:modify',51,'编辑开发者账户信息','2015-03-04 11:41:36'),(68,'notice:delete',52,'删除公告','2015-03-14 03:33:22'),(69,'financeApply:view',55,'查看媒体提现申请','2015-03-04 15:48:32'),(70,'applyMoney:modifyPayType',55,'修改媒体支付类型','2015-03-04 17:46:43'),(71,'applyMoney:modifyStatus',55,'修改媒体支付状态','2015-03-04 18:29:54'),(72,'applyMoney:modifyStatusPay',55,'媒体提现确定支付','2015-03-05 10:25:30'),(73,'applyMoney:modifyStatusNotPay',55,'媒体提现拒绝支付','2015-03-05 12:22:17'),(74,'financeDev:modifyStatusPass',51,'媒体账户审核通过','2015-03-05 14:50:01'),(75,'financeDev:modifyStatusNotPass',51,'媒体账户管理审核未通过','2015-03-05 14:50:42'),(76,'applyMoney:modifyinvoiceStatus',56,'修改发票状态','2015-03-05 17:07:57'),(77,'financeAd:view',57,'查看广告主消耗明细','2015-03-09 11:56:42'),(78,'financeAdBalance:view',58,'查看广告主财务记录','2015-03-09 14:25:26'),(79,'financeAdBalance:sureCharge',58,'广告主财务记录确认收款','2015-03-09 15:59:36'),(80,'adbyhour:view',43,'查看广告按小时统计','2015-03-10 20:14:38'),(81,'adbyday:view',41,'查看广告按天统计','2015-03-10 20:19:57'),(82,'appbyhour:view',42,'查看媒体按小时统计','2015-03-10 20:20:44'),(83,'appbyday:view',40,'查看媒体按天统计','2015-03-10 20:21:19'),(84,'totalbyday:view',46,'查看综合按天统计','2015-03-10 20:22:02'),(85,'totalbyhour:view',45,'查看综合按小时统计','2015-03-10 20:22:32'),(86,'devAndroidIncome:modify',61,'运营管理安卓开发者确认或者不确认','2015-03-10 19:34:33'),(87,'devIosIncome:modify',62,'运营管理IOS开发者确认或者不确认','2015-03-10 19:53:17'),(88,'adAndroidConfirm:modify',65,'广告主消耗确认','2015-03-11 14:27:35'),(89,'applyMoney:modifyCheck',68,'媒体提现申请审核是否通过按钮','2015-03-11 16:48:58'),(90,'dockingAdver:view',70,'查看广告对接参数设置','2015-03-24 23:04:23'),(91,'dockingAdver:add',70,'增加广告主对接参数','2015-03-24 23:04:54'),(92,'dockingAdver:modify',70,'修改广告主对接参数','2015-03-24 23:06:08'),(93,'deverActivate:view',71,'查看IOS激活列表','2015-03-25 10:42:29'),(94,'deverActivate:send',71,'再次发送激活','2015-03-25 10:43:46'),(95,'advertiser:loadExcel',24,'广告主导出Excel','2015-03-27 11:52:29'),(96,'package:loadExcel',25,'广告包导出Excel','2015-03-27 11:55:53'),(97,'placement:loadExcel',29,'投放管理导出Excel','2015-03-27 11:56:40'),(98,'ad:loadExcel',23,'广告管理导出Excel','2015-03-27 11:57:46'),(99,'adoffline:loadExcel',23,'广告下线导出Excel','2015-03-27 11:58:38'),(100,'adFee:loadExcel',23,'广告费用记录导出Excel','2015-03-27 11:59:30'),(101,'adAndroidConfirm:loadExcel',65,'安卓广告主消耗确认导出Excel','2015-03-27 12:09:41'),(102,'adIosConfirm:loadExcel',66,'IOS广告主消耗确认导出Excel','2015-03-27 12:10:30'),(103,'adBalance:loadExcel',67,'广告主结算导出Excel','2015-03-27 12:11:26'),(104,'devAndroidIncome:loadExcel',61,'安卓开发者收入确认导出Excel','2015-03-27 12:12:25'),(105,'devIosIncome:loadExcel',62,'IOS开发者收入确认导出Excel','2015-03-27 12:12:55'),(106,'applyMoney:loadExcel',68,'媒体提现导出Excel','2015-03-27 12:13:40'),(107,'financeAd:loadExcel',57,'广告主消耗明细导出Excel','2015-03-27 12:24:07'),(108,'financeAdBalance:loadExcel',58,'广告主财务记录导出Excel','2015-03-27 12:25:06'),(109,'adInvoice:loadExcel',59,'广告主发票管理导出Excel','2015-03-27 12:26:04'),(110,'financeDev:loadExcel',51,'媒体账户管理导出Excel','2015-03-27 12:30:01'),(111,'financeDetail:loadExcel',53,'媒体收入明细导出Excel','2015-03-27 12:31:07'),(112,'financeApply:loadExcel',55,'媒体付款记录导出Excel','2015-03-27 12:33:49'),(113,'financeDevInvoice:loadExcel',56,'媒体发票管理导出Excel','2015-03-27 14:08:23'),(114,'sspAndroidConfirm:loadExcel',75,'SSP 安卓广告平台消耗确认导出Excel','2015-04-02 14:26:45'),(115,'sspAndroidConfirm:modify',75,'确认','2015-04-02 14:30:52'),(116,'sspBalance:loadExcel',82,'SSP 广告平台结算导出Excel','2015-04-02 14:31:46'),(117,'sspApplyMoney:modifyCheck',82,'SSP 广告平台结算审核','2015-04-02 14:32:15'),(118,'sspConfirm:loadExcel',83,'SSP 平台消耗明细导出Excel','2015-04-02 14:34:38'),(119,'financeSspBalance:loadExcel',84,'SSP 平台财务记录导出Excel','2015-04-02 14:35:56'),(120,'financeSspBalance:sureCharge',84,'SSP 平台财务记录确认收款','2015-04-02 14:36:31'),(121,'sspInvoice:loadExcel',85,'SSP 平台发票管理导出Excel','2015-04-02 14:37:33'),(122,'sspManage:view',74,'展示SSP 广告平台管理页面','2015-04-02 14:52:56'),(123,'sspManage:add',74,'增加SSP 广告平台','2015-04-02 14:58:15'),(124,'sspManage:modify',74,'修改SSP 广告平台','2015-04-02 14:59:00'),(125,'sspManage:delete',74,'删除SSP广告平台','2015-04-02 14:59:30'),(126,'sspRatioManage:view',77,'展示SSP分成比例管理页面','2015-04-02 15:00:35'),(127,'sspRatioManage:modify',77,'修改SSP分成比例','2015-04-02 15:01:06'),(128,'sspRatio:view',78,'展示IosBanner比例设置','2015-04-02 15:01:50'),(129,'sspRatio:add',78,'增加IosBanner比例配置','2015-04-02 15:03:37'),(130,'sspRatio:modify',78,'修改IosBanner比例配置','2015-04-02 15:03:59'),(131,'sspRatio:delete',78,'删除IosBanner比例配置','2015-04-02 15:04:19'),(132,'sspIosConfirm:modify',76,'确认','2015-04-14 15:19:20'),(133,'sspIosConfirm:loadExcel',76,'导出表格','2015-04-14 15:20:39');

/*Table structure for table `t_sys_resource` */

DROP TABLE IF EXISTS `t_sys_resource`;

CREATE TABLE `t_sys_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID,自动生成',
  `name` varchar(40) NOT NULL DEFAULT '' COMMENT '名称',
  `code` varchar(100) DEFAULT NULL COMMENT '编码',
  `url` varchar(4000) DEFAULT NULL COMMENT 'URL',
  `type` int(1) NOT NULL DEFAULT '0' COMMENT '权限类型表(0链接,1操作按钮)',
  `parent_id` int(11) NOT NULL DEFAULT '0' COMMENT '上级ID(如果为0，则为顶级)',
  `description` varchar(100) NOT NULL DEFAULT '' COMMENT '描述',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='资源表';

/*Data for the table `t_sys_resource` */

insert  into `t_sys_resource`(`id`,`name`,`code`,`url`,`type`,`parent_id`,`description`,`create_time`) values (1,'系统管理','sys_manager','',0,0,'系统管理','2015-01-26 23:35:40'),(2,'用户管理','user_manager','/user/',0,1,'用户管理','2015-01-12 11:26:20'),(3,'菜单管理','resource_manager','/resource/',0,1,'增加用户','2015-01-12 11:26:20'),(4,'角色管理','role_manager','/role/',0,1,'增加用户提交','2015-01-12 11:26:20'),(5,'权限管理','permission_manager','/permission/',0,1,'修改用户','2015-01-12 11:26:20'),(6,'修改密码','modify_password','/developedr/',0,1,'修改密码','2015-01-26 14:57:20'),(7,'编辑器demo','editordemo','/demo/',0,1,'','2015-01-28 19:27:21'),(10,'开发者管理','dev_manager','',0,0,'开发者管理','2015-01-12 11:26:20'),(11,'账户管理','UM_UPDATE_SYS_USER_STATUS','/developer/',0,10,'修改用户状态','2015-01-12 11:26:20'),(23,'广告管理','ad_manager','',0,0,'广告管理','2015-01-27 10:37:58'),(24,'广告主管理','UM_UPDATE_ADVER_STATUS','/advertiser/',0,23,'广告主管理','2015-01-27 11:04:28'),(25,'广告包管理','UM_UPDATE_ADVER_PACKAGE','/adpackage/',0,23,'广告包管理','2015-01-31 01:00:40'),(26,'应用管理','UM_UPDATE_DEV_APPLICATION','/application/',0,10,'媒体应用管理','2015-02-04 01:49:49'),(29,'投放管理','adplacement','/adplacement/',0,23,'投放管理','2015-02-05 18:27:09'),(30,'媒体渠道管理','UM_UPDATE_DEV_CHANNEL','/channel/',0,10,'管理媒体渠道','2015-02-09 18:06:41'),(31,'媒体应用包管理','UM_UPDATE_DEV_PACKAGE','/appPackage/',0,10,'管理应用包','2015-02-11 22:21:13'),(32,'广告管理','/ad_manager_two/','/ad_manager_two/',0,23,'广告管理','2015-02-12 20:06:35'),(33,'媒体应用等级管理','UM_UPDATE_DEV_GRADE','/grade/',0,10,'管理媒体应用等级','2015-02-12 23:05:43'),(34,'媒体应用配比管理','UM_UPDATE_DEV_RATE','/rate/',0,10,'管理媒体应用配比','2015-02-12 23:10:37'),(35,'广告下线列表','UM_OFFLINE','/ad_offline/',0,23,'广告下线列表','2015-02-13 18:39:36'),(36,'广告费用记录','UM_AD_FREE','/ad_fee/',0,23,'广告费用记录','2015-02-13 20:04:08'),(37,'数据统计','data_statis',NULL,0,0,'数据统计','2015-02-26 18:02:36'),(40,'媒体按天统计','STATIC_APP_BYDAY','/static_app_byday/',0,37,'按天分媒体统计数据','2015-02-26 18:19:31'),(41,'广告按天统计','STATIC_AD_BYDAY','/static_ad_byday/',0,37,'按天分广告统计数据','2015-02-26 18:21:54'),(42,'媒体按小时统计','STATIC_APP_BYHOUR','/static_app_byhour/',0,37,'按小时分媒体统计数据','2015-02-26 18:24:55'),(43,'广告按小时统计','STATIC_AD_BYHOUR','/static_ad_byhour/',0,37,'按小时分广告统计数据','2015-02-26 18:26:10'),(45,'综合按小时统计','STATIC_TOTAL_BYHOUR','/static_total_byhour/',0,37,'按小时综合统计数据','2015-02-26 23:40:05'),(46,'综合按天统计','STATIC_TOTAL_BYDAY','/static_total_byday/',0,37,'按天综合统计数据','2015-03-10 20:17:50'),(47,'财务管理','finance_manager',NULL,0,0,'财务管理','2015-03-02 10:22:05'),(49,'公告邮件管理','mail_manager',NULL,0,0,'公告邮件管理','2015-03-02 18:29:27'),(51,'媒体账户管理','FINANCE_DEVELOPER','/finance_developer/',0,47,'媒体账户管理','2015-03-02 18:35:23'),(52,'新闻公告','NOTICE','/notice/',0,49,'新闻公告','2015-03-02 18:35:39'),(53,'媒体收入明细','FINANCE_DEVELOPER_DETAILS','/finance_developer_details/',0,47,'媒体收入明细','2015-03-02 18:39:01'),(54,'邮件管理','MAIL','/mail/',0,49,'邮件管理','2015-03-03 04:29:39'),(55,'媒体付款记录','FINANCE_DEVELOPER_CHECK','/finance_apply/',0,47,'媒体付款记录','2015-03-04 23:35:21'),(56,'媒体发票管理','FINANCE_DEVELOPER_INVOICE','/invoice/',0,47,'媒体发票管理','2015-03-06 00:06:20'),(57,'广告主消耗明细','FINANCE_AD','/finance_ad/',0,47,'广告主消耗明细','2015-03-09 19:54:36'),(58,'广告主财务记录','FINANCE_ADBALANCE','/finance_adBalance/',0,47,'广告主财务记录','2015-03-09 22:24:27'),(59,'广告主发票管理','FINANCE_AD_INVOICE','/ad_invoice/',0,47,'广告主发票管理','2015-03-10 01:08:41'),(60,'运营管理','operations_manager','',0,0,'运营管理','2015-03-11 00:58:27'),(61,'安卓开发者收入确认','OPERATIONS_DEV_ANDROID_INCOME','/operations_dev_android/',0,60,'安卓开发者收入确认','2015-03-11 01:01:28'),(62,'IOS开发者收入确认','OPERATIONS_DEV_IOS_INCOME','/operations_dev_ios/',0,60,'IOS开发者收入确认','2015-03-11 01:03:11'),(65,'安卓广告主消耗确认','OPERATIONS_AD_ANDROID_INCOME','/operations_ad_android/',0,60,'安卓广告主消耗确认','2015-03-11 18:50:30'),(66,'IOS广告主消耗确认','OPERATIONS_AD_IOS_INCOME','/operations_ad_ios/',0,60,'IOS广告主消耗确认','2015-03-11 18:51:21'),(67,'广告主结算','OPERATIONS_ADVERTISER_BALANCE_','/finance_balance/',0,60,'广告主结算','2015-03-11 22:34:30'),(68,'媒体提现','OPERATIONS_DEVELOPER_CHECK','/finance_dev_getmoney_check/',0,60,'媒体提现','2015-03-11 23:37:52'),(69,'对接参数','int_param',NULL,0,0,'对接参数','2015-03-24 22:49:49'),(70,'广告主对接参数','DOCKING_ADVER','/docking_adver/',0,69,'广告主对接参数设置','2015-03-24 22:50:15'),(71,'开发者发送激活','DOCKING_DEVER_ACTIVATE','/dever_activate/',0,69,'给开发者发送激活','2015-03-25 10:40:00'),(72,'系统货币设置','OPERATIONS_CURRENCY','/currency/',0,60,'系统货币设置','2015-03-26 18:42:15'),(73,'ssp管理','ssp_manager',NULL,0,0,'ssp管理','2015-03-30 16:02:07'),(74,'ssp广告平台管理','SSP_MANAGE','/ssp_manage/',0,73,'ssp广告平台管理','2015-03-30 16:52:50'),(75,'SSP 安卓广告平台消耗确认','OPERATIONS_SSP_ANDROID_INCOME','/operations_ssp_android/',0,60,'ssp安卓广告平台消耗确认','2015-03-31 12:23:48'),(76,'SSP IOS广告平台消耗确认','OPERATIONS_SSP_IOS_INCOME','/operations_ssp_ios/',0,60,'ssp IOS广告平台消耗确认','2015-03-31 12:24:34'),(77,'ssp比例配置管理','SSP_RATIO_MANAGE','/ssp_ratio_manage/',0,73,'ssp比例配置管理','2015-03-31 14:45:42'),(78,'iosBanner配置比例','SSP_IOS_BANNER_RATIO','/ssp_ratio/ios_banner/',0,73,'ios banner配置比例','2015-03-31 14:56:25'),(79,'ios插屏配置比例','SSP_IOS_INSERT_RATIO','/ssp_ratio/ios_insert/',0,73,'ios 插屏配置比例','2015-03-31 14:57:48'),(80,'安卓Banner配置比例','SSP_ANDROID_BANNER_RATIO','/ssp_ratio/android_banner/',0,73,'安卓banner配置比例','2015-03-31 15:01:13'),(81,'安卓插屏配置比例','SSP_ANDROID_INSERT_RATIO','/ssp_ratio/android_insert/',0,73,'安卓插屏配置比例','2015-03-31 15:06:44'),(82,'SSP 广告平台结算','OPERATIONS_SSP_BALANCE','/ssp_balance/',0,60,'SSP 广告平台结算','2015-03-31 15:33:29'),(83,'SSP 平台消耗明细','SSP_CONFIRM_DETAIL','/confirm_detail/',0,47,'SSP 平台消耗明细','2015-04-01 11:09:14'),(84,'SSP 平台财务记录','OPERATIONS_SSP_FINANCE_BALANCE','/finance_sspBalance/',0,47,'SSP 广告平台财务记录','2015-04-01 12:08:12'),(85,'SSP 平台发票管理','FINANCE_SSP_INVOICE','/ssp_invoice/',0,47,'SSP 平台发票管理','2015-04-01 15:30:58'),(86,'SSP平台相关ID管理','SSP_CONFIG','/ssp_config/',0,73,'SSP平台相关id管理','2015-04-29 12:14:29');

/*Table structure for table `t_sys_role` */

DROP TABLE IF EXISTS `t_sys_role`;

CREATE TABLE `t_sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID,自动生成',
  `name` varchar(40) NOT NULL DEFAULT '' COMMENT '名称',
  `description` varchar(100) DEFAULT NULL COMMENT '描述',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='角色表';

/*Data for the table `t_sys_role` */

insert  into `t_sys_role`(`id`,`name`,`description`,`create_time`) values (1,'管理员','管理员','2015-01-23 12:04:48'),(11,'test1','test1','2015-01-27 12:27:37'),(12,'开发者销售负责人','开发者销售负责人','2015-01-29 15:45:14'),(13,'test','测试','2015-03-12 14:38:57'),(14,'销售000','销售000','2015-04-27 16:29:36'),(15,'管理员111','管理员111','2015-04-27 16:33:42');

/*Table structure for table `t_sys_role_perminssion_rel` */

DROP TABLE IF EXISTS `t_sys_role_perminssion_rel`;

CREATE TABLE `t_sys_role_perminssion_rel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL COMMENT '角色ID',
  `permission_id` int(11) NOT NULL COMMENT '权限ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8959 DEFAULT CHARSET=utf8 COMMENT='角色权限关系表';

/*Data for the table `t_sys_role_perminssion_rel` */

insert  into `t_sys_role_perminssion_rel`(`id`,`role_id`,`permission_id`) values (58,11,5),(59,11,6),(60,11,8),(61,11,9),(62,11,10),(63,11,11),(64,11,12),(65,11,13),(66,11,14),(67,11,15),(68,11,16),(69,11,17),(70,11,18),(71,11,20),(72,11,21),(7526,13,5),(7527,13,6),(7528,13,7),(7529,13,8),(7530,13,9),(7531,13,10),(7532,13,11),(7533,13,12),(7534,13,13),(7535,13,14),(7536,13,15),(7537,13,16),(7538,13,17),(7539,13,18),(7540,13,19),(7541,13,20),(7542,13,21),(7543,13,24),(7544,13,25),(7545,13,28),(7546,13,29),(7547,13,30),(7548,13,31),(7549,13,33),(7550,13,34),(7551,13,35),(7552,13,36),(7553,13,41),(7554,13,42),(7555,13,43),(7556,13,44),(7557,13,45),(7558,13,46),(7559,13,47),(7560,13,48),(7561,13,49),(7562,13,50),(7563,13,51),(7564,13,52),(7565,13,53),(7566,13,54),(7567,13,58),(7568,13,59),(7569,13,60),(7570,13,67),(7571,13,69),(7572,13,70),(7573,13,71),(7574,13,72),(7575,13,73),(7576,13,74),(7577,13,75),(7578,13,76),(7579,13,77),(7580,13,78),(7581,13,79),(7582,13,107),(7583,13,108),(7584,13,109),(7585,13,110),(7586,13,111),(7587,13,112),(7588,13,113),(7589,13,118),(7590,13,119),(7591,13,120),(7592,13,121),(7593,13,61),(7594,13,62),(7595,13,63),(7596,13,64),(7597,13,65),(7598,13,66),(7599,13,68),(8831,1,5),(8832,1,6),(8833,1,7),(8834,1,8),(8835,1,9),(8836,1,10),(8837,1,11),(8838,1,12),(8839,1,13),(8840,1,14),(8841,1,15),(8842,1,16),(8843,1,17),(8844,1,18),(8845,1,19),(8846,1,20),(8847,1,21),(8848,1,24),(8849,1,25),(8850,1,28),(8851,1,29),(8852,1,30),(8853,1,31),(8854,1,33),(8855,1,34),(8856,1,35),(8857,1,36),(8858,1,41),(8859,1,42),(8860,1,43),(8861,1,44),(8862,1,45),(8863,1,46),(8864,1,47),(8865,1,48),(8866,1,49),(8867,1,50),(8868,1,51),(8869,1,52),(8870,1,53),(8871,1,54),(8872,1,22),(8873,1,23),(8874,1,26),(8875,1,27),(8876,1,32),(8877,1,37),(8878,1,38),(8879,1,39),(8880,1,40),(8881,1,55),(8882,1,56),(8883,1,95),(8884,1,96),(8885,1,97),(8886,1,98),(8887,1,99),(8888,1,100),(8889,1,80),(8890,1,81),(8891,1,82),(8892,1,83),(8893,1,84),(8894,1,85),(8895,1,58),(8896,1,59),(8897,1,60),(8898,1,67),(8899,1,69),(8900,1,70),(8901,1,71),(8902,1,72),(8903,1,73),(8904,1,74),(8905,1,75),(8906,1,76),(8907,1,77),(8908,1,78),(8909,1,79),(8910,1,107),(8911,1,108),(8912,1,109),(8913,1,110),(8914,1,111),(8915,1,112),(8916,1,113),(8917,1,118),(8918,1,119),(8919,1,120),(8920,1,121),(8921,1,61),(8922,1,62),(8923,1,63),(8924,1,64),(8925,1,65),(8926,1,66),(8927,1,68),(8928,1,86),(8929,1,87),(8930,1,88),(8931,1,89),(8932,1,101),(8933,1,102),(8934,1,103),(8935,1,104),(8936,1,105),(8937,1,106),(8938,1,114),(8939,1,115),(8940,1,116),(8941,1,117),(8942,1,132),(8943,1,133),(8944,1,90),(8945,1,91),(8946,1,92),(8947,1,93),(8948,1,94),(8949,1,122),(8950,1,123),(8951,1,124),(8952,1,125),(8953,1,126),(8954,1,127),(8955,1,128),(8956,1,129),(8957,1,130),(8958,1,131);

/*Table structure for table `t_sys_role_resource_rel` */

DROP TABLE IF EXISTS `t_sys_role_resource_rel`;

CREATE TABLE `t_sys_role_resource_rel` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID,自动生成',
  `role_id` int(11) NOT NULL DEFAULT '0' COMMENT '角色ID',
  `resource_id` int(11) NOT NULL DEFAULT '0' COMMENT '权限ID',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1519 DEFAULT CHARSET=utf8 COMMENT='角色资源表';

/*Data for the table `t_sys_role_resource_rel` */

insert  into `t_sys_role_resource_rel`(`id`,`role_id`,`resource_id`,`create_time`) values (174,11,2,'2015-02-09 03:49:57'),(175,11,5,'2015-02-09 03:49:57'),(176,11,6,'2015-02-09 03:49:57'),(177,11,10,'2015-02-09 03:49:57'),(178,11,11,'2015-02-09 03:49:57'),(1387,13,75,'2015-04-01 16:39:05'),(1388,13,76,'2015-04-01 16:39:05'),(1389,13,82,'2015-04-01 16:39:05'),(1390,13,83,'2015-04-01 16:39:05'),(1391,13,84,'2015-04-01 16:39:05'),(1392,13,85,'2015-04-01 16:39:05'),(1455,1,1,'2015-04-01 16:42:59'),(1456,1,2,'2015-04-01 16:42:59'),(1457,1,3,'2015-04-01 16:42:59'),(1458,1,4,'2015-04-01 16:42:59'),(1459,1,5,'2015-04-01 16:42:59'),(1460,1,6,'2015-04-01 16:42:59'),(1461,1,7,'2015-04-01 16:42:59'),(1462,1,10,'2015-04-01 16:42:59'),(1463,1,11,'2015-04-01 16:42:59'),(1464,1,23,'2015-04-01 16:42:59'),(1465,1,24,'2015-04-01 16:42:59'),(1466,1,25,'2015-04-01 16:42:59'),(1467,1,26,'2015-04-01 16:42:59'),(1468,1,29,'2015-04-01 16:42:59'),(1469,1,30,'2015-04-01 16:42:59'),(1470,1,31,'2015-04-01 16:42:59'),(1471,1,32,'2015-04-01 16:42:59'),(1472,1,33,'2015-04-01 16:42:59'),(1473,1,34,'2015-04-01 16:42:59'),(1474,1,35,'2015-04-01 16:42:59'),(1475,1,36,'2015-04-01 16:42:59'),(1476,1,37,'2015-04-01 16:42:59'),(1477,1,40,'2015-04-01 16:42:59'),(1478,1,41,'2015-04-01 16:42:59'),(1479,1,42,'2015-04-01 16:42:59'),(1480,1,43,'2015-04-01 16:42:59'),(1481,1,45,'2015-04-01 16:42:59'),(1482,1,46,'2015-04-01 16:42:59'),(1483,1,47,'2015-04-01 16:42:59'),(1484,1,49,'2015-04-01 16:42:59'),(1485,1,51,'2015-04-01 16:42:59'),(1486,1,52,'2015-04-01 16:42:59'),(1487,1,53,'2015-04-01 16:42:59'),(1488,1,54,'2015-04-01 16:42:59'),(1489,1,55,'2015-04-01 16:42:59'),(1490,1,56,'2015-04-01 16:42:59'),(1491,1,57,'2015-04-01 16:42:59'),(1492,1,58,'2015-04-01 16:42:59'),(1493,1,59,'2015-04-01 16:42:59'),(1494,1,60,'2015-04-01 16:42:59'),(1495,1,61,'2015-04-01 16:42:59'),(1496,1,62,'2015-04-01 16:42:59'),(1497,1,65,'2015-04-01 16:42:59'),(1498,1,66,'2015-04-01 16:42:59'),(1499,1,67,'2015-04-01 16:42:59'),(1500,1,68,'2015-04-01 16:42:59'),(1501,1,69,'2015-04-01 16:42:59'),(1502,1,70,'2015-04-01 16:42:59'),(1503,1,71,'2015-04-01 16:42:59'),(1504,1,72,'2015-04-01 16:42:59'),(1505,1,73,'2015-04-01 16:42:59'),(1506,1,74,'2015-04-01 16:42:59'),(1507,1,75,'2015-04-01 16:42:59'),(1508,1,76,'2015-04-01 16:42:59'),(1509,1,77,'2015-04-01 16:42:59'),(1510,1,78,'2015-04-01 16:42:59'),(1511,1,79,'2015-04-01 16:42:59'),(1512,1,80,'2015-04-01 16:42:59'),(1513,1,81,'2015-04-01 16:42:59'),(1514,1,82,'2015-04-01 16:42:59'),(1515,1,83,'2015-04-01 16:42:59'),(1516,1,84,'2015-04-01 16:42:59'),(1517,1,85,'2015-04-01 16:42:59'),(1518,1,86,'2015-04-29 12:15:31');

/*Table structure for table `t_sys_user` */

DROP TABLE IF EXISTS `t_sys_user`;

CREATE TABLE `t_sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID,自动生成',
  `username` varchar(40) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `real_name` varchar(40) NOT NULL DEFAULT '' COMMENT '真实姓名',
  `description` varchar(400) DEFAULT NULL COMMENT '描述',
  `tel_num` varchar(20) DEFAULT NULL COMMENT '电话号码',
  `email` varchar(255) DEFAULT NULL COMMENT '邮件地址',
  `status` int(1) NOT NULL DEFAULT '0' COMMENT '状态(0:正常1禁用)',
  `salt` varchar(32) NOT NULL COMMENT '盐值',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `t_sys_user` */

insert  into `t_sys_user`(`id`,`username`,`password`,`real_name`,`description`,`tel_num`,`email`,`status`,`salt`,`create_time`) values (1,'admin','e224a2be8783ce802086f6f5d10fba37','','','','',0,'d22097cf27b553b5890ddc63879594f0','2015-01-12 11:26:20'),(2,'SSP','564c2f11dfb2b87fa3f2605608434a71','admin','密码 12345678','13031016567','aaa@123.com',0,'097c3025801969a4c0cdc042129a2124','2015-01-12 11:26:20'),(3,'f','fdfd','','fd','fd','fd',0,'fd','2015-01-21 18:58:08'),(4,'r',NULL,'',NULL,NULL,NULL,0,'f','2015-01-21 18:58:14'),(5,'q',NULL,'',NULL,NULL,NULL,0,'q','2015-01-21 18:58:20'),(6,'w',NULL,'',NULL,NULL,NULL,0,'w','2015-01-21 18:58:25'),(7,'e',NULL,'',NULL,NULL,NULL,0,'e','2015-01-21 18:58:30'),(8,'rr','r','',NULL,NULL,NULL,0,'r','2015-01-21 18:58:44'),(9,'tt',NULL,'',NULL,NULL,NULL,0,'tt','2015-01-21 18:58:49'),(10,'yy','fb15de02e27f58132aef499a7ea5ae2a','fdfdfd','','','',1,'8a58c645d765bbeab8b7a74355f2ff55','2015-01-27 17:28:14'),(13,'uu',NULL,'',NULL,NULL,NULL,1,'uu','2015-01-21 19:01:36'),(14,'ii',NULL,'',NULL,NULL,NULL,1,'ii','2015-01-21 19:01:38'),(16,'aaaaa','912472bd6f10df2004dc0aa50ca1e295','aaaaa','','21312321321','aaaa@163.com',0,'f42247eccad74a6c6a48fd54c192eb26','2015-01-29 14:39:57'),(17,'admin22211','96c85a82b9177f5875427945f2561eab','aaaaa1212','','1111111111','aaa322323a@163.com',0,'8834f7415b0a562be01ec6d1a5e07df3','2015-02-02 12:20:19'),(24,'1111','e76246d76d94a9ec468d64e09ed9e1e2','1111','','','',0,'c9865e11f0c2462e76e7b04a93d3ba58','2015-03-12 11:16:33'),(25,'11111','0725ea8bd55def1e45abbfe9a3078e21','111','','','',1,'a7b96feea733feb6433beb5868f01b83','2015-03-12 11:22:11'),(27,'111111','632395ebd59eeeab86504be36e06e161','11111','','','',0,'de08a5c300b6b34ae948ff4a3f9e07e0','2015-03-12 15:35:02'),(28,'wsp','7f59961d86d4e924476434652d692fd6','王树鹏','','13555555555','100000@11.com',0,'373533f1705f1c9ebcedf2ec7a592e51','2015-04-16 10:34:55');

/*Table structure for table `t_sys_user_role_rel` */

DROP TABLE IF EXISTS `t_sys_user_role_rel`;

CREATE TABLE `t_sys_user_role_rel` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID,自动生成',
  `user_id` int(11) NOT NULL DEFAULT '0' COMMENT '用户ID',
  `role_id` int(11) NOT NULL DEFAULT '0' COMMENT '角色ID',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8 COMMENT='用户角色表';

/*Data for the table `t_sys_user_role_rel` */

insert  into `t_sys_user_role_rel`(`id`,`user_id`,`role_id`,`create_time`) values (1,1,1,'2015-01-23 12:04:50'),(26,10,1,'2015-01-27 17:27:45'),(27,10,11,'2015-01-27 17:27:45'),(31,0,0,'2015-01-29 15:40:26'),(33,10,13,'2015-01-29 15:46:16'),(34,16,1,'2015-01-31 01:48:20'),(37,2,1,'2015-04-01 16:40:52'),(38,2,13,'2015-04-01 16:40:52'),(39,28,1,'2015-04-16 18:34:48'),(40,2,12,'2015-04-27 18:29:52'),(41,3,12,'2015-04-27 18:29:59'),(42,4,12,'2015-04-27 18:30:04');

/*Table structure for table `tao_cart` */

DROP TABLE IF EXISTS `tao_cart`;

CREATE TABLE `tao_cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_date` datetime NOT NULL,
  `modify_date` datetime NOT NULL,
  `cart_key` varchar(255) NOT NULL,
  `member` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `tao_cart` */

insert  into `tao_cart`(`id`,`create_date`,`modify_date`,`cart_key`,`member`) values (1,'2015-06-26 17:22:31','2015-06-26 17:22:31','826a9fca-8ea2-4ade-af63-0607333177247beccdaf77a575871908eb73c0920094',NULL);

/*Table structure for table `tao_cart_item` */

DROP TABLE IF EXISTS `tao_cart_item`;

CREATE TABLE `tao_cart_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_date` datetime NOT NULL,
  `modify_date` datetime NOT NULL,
  `quantity` int(11) NOT NULL,
  `cart` bigint(20) NOT NULL,
  `product` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `tao_cart_item` */

insert  into `tao_cart_item`(`id`,`create_date`,`modify_date`,`quantity`,`cart`,`product`) values (1,'2015-06-26 17:22:31','2015-06-26 17:22:35',2,1,290);

/*Table structure for table `tao_member` */

DROP TABLE IF EXISTS `tao_member`;

CREATE TABLE `tao_member` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_date` datetime DEFAULT NULL,
  `modify_date` datetime DEFAULT NULL,
  `address` varchar(765) DEFAULT NULL,
  `amount` decimal(29,0) DEFAULT NULL,
  `attribute_value0` varchar(765) DEFAULT NULL,
  `attribute_value1` varchar(765) DEFAULT NULL,
  `attribute_value2` varchar(765) DEFAULT NULL,
  `attribute_value3` varchar(765) DEFAULT NULL,
  `attribute_value4` varchar(765) DEFAULT NULL,
  `attribute_value5` varchar(765) DEFAULT NULL,
  `attribute_value6` varchar(765) DEFAULT NULL,
  `balance` decimal(29,0) DEFAULT NULL,
  `birth` datetime DEFAULT NULL,
  `email` varchar(765) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `is_enabled` bit(1) DEFAULT NULL,
  `is_locked` bit(1) DEFAULT NULL,
  `locked_date` datetime DEFAULT NULL,
  `login_date` datetime DEFAULT NULL,
  `login_failure_count` int(11) DEFAULT NULL,
  `login_ip` varchar(765) DEFAULT NULL,
  `mobile` varchar(765) DEFAULT NULL,
  `name` varchar(765) DEFAULT NULL,
  `password` varchar(765) DEFAULT NULL,
  `phone` varchar(765) DEFAULT NULL,
  `point` bigint(20) DEFAULT NULL,
  `register_ip` varchar(765) DEFAULT NULL,
  `safe_key_expire` datetime DEFAULT NULL,
  `safe_key_value` varchar(765) DEFAULT NULL,
  `username` varchar(300) DEFAULT NULL,
  `zip_code` varchar(765) DEFAULT NULL,
  `area` bigint(20) DEFAULT NULL,
  `member_rank` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `tao_member` */

insert  into `tao_member`(`id`,`create_date`,`modify_date`,`address`,`amount`,`attribute_value0`,`attribute_value1`,`attribute_value2`,`attribute_value3`,`attribute_value4`,`attribute_value5`,`attribute_value6`,`balance`,`birth`,`email`,`gender`,`is_enabled`,`is_locked`,`locked_date`,`login_date`,`login_failure_count`,`login_ip`,`mobile`,`name`,`password`,`phone`,`point`,`register_ip`,`safe_key_expire`,`safe_key_value`,`username`,`zip_code`,`area`,`member_rank`) values (13,'2016-07-27 21:34:35',NULL,'北京市朝阳区1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'王树鹏',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,NULL,NULL,'京东金融',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'2016-07-27 10:26:53',NULL,'a',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'利丰贾4',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'2016-07-27 10:28:42',NULL,'a',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'利丰贾4',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'2016-07-27 10:29:06',NULL,'a',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'2016-07-27 10:29:19',NULL,'a',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'2016-07-27 10:29:29',NULL,'a',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'枕头',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'2016-07-27 00:00:00',NULL,'a',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'利丰贾4',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,'2016-07-27 12:49:51',NULL,'a',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'利丰贾4',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(10,'2016-07-27 14:30:44',NULL,'a',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'利丰贾4',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(11,'2016-07-27 14:39:46',NULL,'a',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'利丰贾4',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,'2016-07-27 14:43:46',NULL,'北京市朝阳区',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'王树鹏',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(14,'2016-07-27 21:38:21',NULL,'北京市朝阳区1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'王树鹏',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `tao_order` */

DROP TABLE IF EXISTS `tao_order`;

CREATE TABLE `tao_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_date` datetime DEFAULT NULL,
  `modify_date` datetime DEFAULT NULL,
  `address` varchar(765) DEFAULT NULL,
  `amount_paid` decimal(23,0) DEFAULT NULL,
  `area_name` varchar(765) DEFAULT NULL,
  `consignee` varchar(765) DEFAULT NULL,
  `coupon_discount` decimal(23,0) DEFAULT NULL,
  `expire` datetime DEFAULT NULL,
  `fee` decimal(23,0) DEFAULT NULL,
  `freight` decimal(23,0) DEFAULT NULL,
  `invoice_title` varchar(765) DEFAULT NULL,
  `is_allocated_stock` bit(1) DEFAULT NULL,
  `is_invoice` bit(1) DEFAULT NULL,
  `lock_expire` datetime DEFAULT NULL,
  `memo` varchar(765) DEFAULT NULL,
  `offset_amount` decimal(23,0) DEFAULT NULL,
  `order_status` int(11) DEFAULT NULL,
  `payment_method_name` varchar(765) DEFAULT NULL,
  `payment_status` int(11) DEFAULT NULL,
  `phone` varchar(765) DEFAULT NULL,
  `point` bigint(20) DEFAULT NULL,
  `promotion` varchar(765) DEFAULT NULL,
  `promotion_discount` decimal(23,0) DEFAULT NULL,
  `shipping_method_name` varchar(765) DEFAULT NULL,
  `shipping_status` int(11) DEFAULT NULL,
  `sn` varchar(300) DEFAULT NULL,
  `tax` decimal(23,0) DEFAULT NULL,
  `zip_code` varchar(765) DEFAULT NULL,
  `area` bigint(20) DEFAULT NULL,
  `coupon_code` bigint(20) DEFAULT NULL,
  `member` bigint(20) DEFAULT NULL,
  `operator` bigint(20) DEFAULT NULL,
  `payment_method` bigint(20) DEFAULT NULL,
  `shipping_method` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `tao_order` */

insert  into `tao_order`(`id`,`create_date`,`modify_date`,`address`,`amount_paid`,`area_name`,`consignee`,`coupon_discount`,`expire`,`fee`,`freight`,`invoice_title`,`is_allocated_stock`,`is_invoice`,`lock_expire`,`memo`,`offset_amount`,`order_status`,`payment_method_name`,`payment_status`,`phone`,`point`,`promotion`,`promotion_discount`,`shipping_method_name`,`shipping_status`,`sn`,`tax`,`zip_code`,`area`,`coupon_code`,`member`,`operator`,`payment_method`,`shipping_method`) values (3,'2015-05-23 16:54:49','2015-05-25 16:30:00','fdfd','0','北京市西城区','akaa','0','2015-05-24 16:54:49','0','0',NULL,'\0','\0','2015-05-23 17:10:10',NULL,'0',0,'网上支付',0,'12121212121',2320,NULL,'0','普通快递',0,'20150523103','0','12121',3,NULL,2,1,1,1),(4,'2015-05-23 16:56:26','2015-05-23 17:12:05','fdfd','1804','北京市西城区','akaa','0',NULL,'0','10',NULL,'\0','\0','2015-05-23 17:12:25',NULL,'0',2,'货到付款',2,'12121212121',1794,NULL,'0','顺丰速递',2,'20150523104','0','12121',3,NULL,2,1,3,2),(5,'2015-05-23 17:12:12','2015-05-23 17:26:22','fdfd','500','北京市西城区','akaa','0',NULL,'0','10',NULL,'\0','\0','2015-05-23 17:26:42',NULL,'0',1,'货到付款',1,'12121212121',568,NULL,'0','顺丰速递',2,'20150523105','0','12121',3,NULL,2,1,3,2),(6,'2016-07-27 21:47:11','2016-07-27 21:47:11','我的订单地址',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `tao_order_item` */

DROP TABLE IF EXISTS `tao_order_item`;

CREATE TABLE `tao_order_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_date` datetime DEFAULT NULL,
  `modify_date` datetime DEFAULT NULL,
  `full_name` varchar(765) DEFAULT NULL,
  `is_gift` bit(1) DEFAULT NULL,
  `name` varchar(765) DEFAULT NULL,
  `price` decimal(23,0) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `return_quantity` int(11) DEFAULT NULL,
  `shipped_quantity` int(11) DEFAULT NULL,
  `sn` varchar(765) DEFAULT NULL,
  `thumbnail` varchar(765) DEFAULT NULL,
  `weight` int(11) DEFAULT NULL,
  `orders` bigint(20) DEFAULT NULL,
  `product` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `tao_order_item` */

insert  into `tao_order_item`(`id`,`create_date`,`modify_date`,`full_name`,`is_gift`,`name`,`price`,`quantity`,`return_quantity`,`shipped_quantity`,`sn`,`thumbnail`,`weight`,`orders`,`product`) values (5,'2015-05-23 16:54:49','2015-05-23 16:54:49','维依恋 2013春秋装新款 韩版修身短款女士机车大码pu皮衣短外套[黑色 M]','\0','维依恋 2013春秋装新款 韩版修身短款女士机车大码pu皮衣短外套','266',2,0,0,'201304352','http://storage.shopxx.net/demo-image/3.0/201301/d1d15c1d-e5da-414e-ac53-745b56ccf369-thumbnail.jpg',NULL,3,255),(6,'2015-05-23 16:54:49','2015-05-23 16:54:49','尚都比拉女装2013夏装新款蕾丝连衣裙 韩版修身雪纺打底裙子 春款[白色 M]','\0','尚都比拉女装2013夏装新款蕾丝连衣裙 韩版修身雪纺打底裙子 春款','298',6,0,0,'201304529','http://storage.shopxx.net/demo-image/3.0/201301/0ff130db-0a1b-4b8d-a918-ed9016317009-thumbnail.jpg',NULL,3,300),(7,'2015-05-23 16:56:26','2015-05-23 16:57:19','尚都比拉2013夏装新款 韩版优雅甜美淑女装 春款蕾丝雪纺连衣裙子[绿色 M]','\0','尚都比拉2013夏装新款 韩版优雅甜美淑女装 春款蕾丝雪纺连衣裙子','299',6,0,6,'201304519','http://storage.shopxx.net/demo-image/3.0/201301/51afeef5-f6cb-4936-abea-315cfca0edc0-thumbnail.jpg',NULL,4,290),(8,'2015-05-23 17:12:12','2015-05-23 17:12:52','JackJones杰克琼斯男士立领拼接式夹克I212121041[黑色 XS]','\0','JackJones杰克琼斯男士立领拼接式夹克I212121041','269',1,0,1,'201304263','http://storage.shopxx.net/demo-image/3.0/201301/4107e1ce-5e7c-4941-bc0f-718f35ba14cd-thumbnail.jpg',NULL,5,166),(9,'2015-05-23 17:12:12','2015-05-23 17:12:52','尚都比拉2013夏装新款 韩版优雅甜美淑女装 春款蕾丝雪纺连衣裙子[绿色 M]','\0','尚都比拉2013夏装新款 韩版优雅甜美淑女装 春款蕾丝雪纺连衣裙子','299',1,0,1,'201304519','http://storage.shopxx.net/demo-image/3.0/201301/51afeef5-f6cb-4936-abea-315cfca0edc0-thumbnail.jpg',NULL,5,290),(10,'2016-07-27 21:59:17','2016-07-27 21:59:17','毛呢大衣',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
