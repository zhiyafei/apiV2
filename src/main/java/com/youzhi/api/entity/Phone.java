package com.youzhi.api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 手机表
 */
@Entity
@Data
public class Phone {
    //'手机id'
    @Id
    private String phoneId ;
    // 厂商ID
    private String brandsId ;
    //'手机名字'
    private String phoneName ;
    //'价格'
    private String phonePrice ;
    //'手机录入人员id'
    private String phoneUploadUserId;
    //'总销量'
    private String phoneSalesVolume ;
    //'生产年份'
    private String productionYear;
    //'生产月份'
    private String productionMonth ;
    //'生产当天'
    private String productionDay;
    //'创建年份'
    private String createYear;
    //'创建月份'
    private String createMonth ;
    //'创建当天'
    private String createDay ;
    //'创建时间'
    private String createTime ;
    //'更新时间'
    private String updateTime ;

    public Phone(){}
}
