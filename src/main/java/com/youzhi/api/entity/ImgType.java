package com.youzhi.api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ImgType {

    //'图片类型id'
    @Id
    private String typeId;
    //'类型名称
    private String typeName;
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

    public ImgType(){}
}
