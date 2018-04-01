package com.youzhi.api.vo;

import demo.sso.utils.IdUtils;
import demo.sso.utils.TimeUtils;

public class ImgTypeVO {
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

    public ImgTypeVO(){}

    public ImgTypeVO(String typeName) {
        this.typeId = IdUtils.genUniqueId();
        this.typeName = typeName;
        this.createYear = TimeUtils.getCurrentYear();
        this.createMonth = TimeUtils.getCurrenMonth();
        this.createDay = TimeUtils.getCurrentDay();
        this.createTime = TimeUtils.getCurrentTime();
        this.updateTime = TimeUtils.getCurrentTime();
    }
}
