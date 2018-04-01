package com.youzhi.api.entity;

/*
*  手机品牌
* */

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class PhoneBrands {
    // '手机品牌id'
    @Id
    private String brandsId ;
    // '手机品牌名称'
    private String brandsName;
    //  '手机品牌logo'
    private String brandsLogo ;
    //  '品牌描述'
    private String brandsDesc ;
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
    public PhoneBrands(){}
}
