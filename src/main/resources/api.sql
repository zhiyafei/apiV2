
## 手机品牌表
CREATE  TABLE phone_brands (
  brands_id VARCHAR(32) NOT NULL COMMENT '手机品牌id',
  brands_name VARCHAR(32) NOT NULL COMMENT '手机品牌名称',
  brands_logo VARCHAR(64) NOT NULL COMMENT '手机品牌logo',
  brands_desc VARCHAR(128) NOT NULL COMMENT '品牌描述',
  create_year VARCHAR(32) NOT NULL COMMENT '创建年份',
  create_month VARCHAR(32) NOT NULL COMMENT '创建月份',
  create_day VARCHAR(32) NOT NULL COMMENT '创建当天',
  create_time timestamp NOT NULL default current_timestamp comment '创建时间',
  update_time timestamp NOT NULL default current_timestamp on update current_timestamp comment '更新时间',
  primary key (brands_id)
) comment '手机品牌表';
## 手机表
CREATE  TABLE phone (
  phone_id VARCHAR(32) NOT NULL COMMENT '手机id',
  brands_id VARCHAR(32) NOT NULL COMMENT '手机品牌id',
  phone_name VARCHAR(32) NOT NULL COMMENT '手机名字',
  phone_price VARCHAR(32) NOT NULL COMMENT '价格',
  phone_upload_user_id VARCHAR(32) NOT NULL COMMENT '手机录入人员id',
  phone_sales_volume  VARCHAR(32) NOT NULL COMMENT '总销量',
  production_year VARCHAR(32) NOT NULL COMMENT '生产年份',
  production_month VARCHAR(32) NOT NULL COMMENT '生产月份',
  production_day VARCHAR(32) NOT NULL COMMENT '生产当天',
  create_year VARCHAR(32) NOT NULL COMMENT '创建年份',
  create_month VARCHAR(32) NOT NULL COMMENT '创建月份',
  create_day VARCHAR(32) NOT NULL COMMENT '创建当天',
  create_time timestamp NOT NULL default current_timestamp comment '创建时间',
  update_time timestamp NOT NULL default current_timestamp on update current_timestamp comment '更新时间',
  primary key (phone_id)
) comment '手机表';
## 标签表
CREATE  TABLE tag (
  tag_id VARCHAR(32) NOT NULL COMMENT '标签id',
  tag_name VARCHAR(32) NOT NULL COMMENT '标签名称',
  tag_logo VARCHAR(64) COMMENT '标签图片',
  create_year VARCHAR(32) NOT NULL COMMENT '创建年份',
  create_month VARCHAR(32) NOT NULL COMMENT '创建月份',
  create_day VARCHAR(32) NOT NULL COMMENT '创建当天',
  create_time timestamp NOT NULL default current_timestamp comment '创建时间',
  update_time timestamp NOT NULL default current_timestamp on update current_timestamp comment '更新时间',
  primary key (tag_id)
) comment '标签表';

## 图片表
CREATE  TABLE img (
  img_id VARCHAR(32) NOT NULL COMMENT '图片id',
  img_url VARCHAR(64) NOT NULL COMMENT '图片地址',
  img_type_id VARCHAR(32) NOT NULL COMMENT '图片类型id',
  img_size  VARCHAR(32) NOT NULL COMMENT '图片大小',
  img_linked_id VARCHAR(32) NOT NULL COMMENT '图片关联id',
  img_upload_user_id VARCHAR(32) NOT NULL COMMENT '图片上传人id',
  create_year VARCHAR(32) NOT NULL COMMENT '创建年份',
  create_month VARCHAR(32) NOT NULL COMMENT '创建月份',
  create_day VARCHAR(32) NOT NULL COMMENT '创建当天',
  create_time timestamp NOT NULL default current_timestamp comment '创建时间',
  update_time timestamp NOT NULL default current_timestamp on update current_timestamp comment '更新时间',
  primary key (img_id)
) comment '标签表';
## 标签表
CREATE  TABLE img_type (
  type_id VARCHAR(32) NOT NULL COMMENT '图片类型id',
  type_name VARCHAR(32) NOT NULL COMMENT '类型名称',
  create_year VARCHAR(32) NOT NULL COMMENT '创建年份',
  create_month VARCHAR(32) NOT NULL COMMENT '创建月份',
  create_day VARCHAR(32) NOT NULL COMMENT '创建当天',
  create_time timestamp NOT NULL default current_timestamp comment '创建时间',
  update_time timestamp NOT NULL default current_timestamp on update current_timestamp comment '更新时间',
  primary key (type_id)
) comment '标签表';
## 视频表
CREATE  TABLE video (
  video_id VARCHAR(32) NOT NULL COMMENT '视频id',
  video_url VARCHAR(64) NOT NULL COMMENT '视频地址',
  video_title VARCHAR(128) NOT NULL COMMENT '视频标题',
  video_desc VARCHAR(128) NOT NULL COMMENT '视频描述',
  video_size VARCHAR(32) NOT NULL COMMENT '视频大小',
  video_length VARCHAR(32) NOT NULL COMMENT '视频时长',
  video_view_times VARCHAR(32) NOT NULL COMMENT '视频观看次数',
  video_upload_user_id VARCHAR(32) NOT NULL COMMENT '视频上传人id',
  create_year VARCHAR(32) NOT NULL COMMENT '创建年份',
  create_month VARCHAR(32) NOT NULL COMMENT '创建月份',
  create_day VARCHAR(32) NOT NULL COMMENT '创建当天',
  create_time timestamp NOT NULL default current_timestamp comment '创建时间',
  update_time timestamp NOT NULL default current_timestamp on update current_timestamp comment '更新时间',
  primary key (video_id)
) comment '视频表';
