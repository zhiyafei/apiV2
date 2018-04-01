package com.youzhi.api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Tag {
    //'标签id'
    @Id
    private String tagId ;
    //'标签名称'
    private String tagName ;
    //'标签图片'
    private String tagLogo ;
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

    public Tag(){}
}
