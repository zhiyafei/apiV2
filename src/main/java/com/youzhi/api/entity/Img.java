package com.youzhi.api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Img {
    //'图片id'
    @Id
    private String imgId;
    //'图片地址'
    private String imgUrl ;
    //'图片类型id'
    private String imgTypeId ;
    //'图片大小'
    private String imgSize ;
    //'图片关联id'
    private String imgLinkedId ;
    //'图片上传人id'
    private String imgUploadUserId ;
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

    public Img(){}
}
