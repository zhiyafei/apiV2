package com.youzhi.api.vo;

import demo.sso.utils.IdUtils;
import demo.sso.utils.TimeUtils;
import lombok.Data;

@Data
public class TagVO {

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

    public TagVO(){}

    public TagVO(String tagName, String tagLogo) {
        this.tagId = IdUtils.genUniqueId();
        this.tagName = tagName;
        this.tagLogo = tagLogo;
        this.createYear = TimeUtils.getCurrentYear();
        this.createMonth = TimeUtils.getCurrenMonth();
        this.createDay = TimeUtils.getCurrentDay();
        this.createTime = TimeUtils.getCurrentTime();
        this.updateTime = TimeUtils.getCurrentTime();
    }
}

