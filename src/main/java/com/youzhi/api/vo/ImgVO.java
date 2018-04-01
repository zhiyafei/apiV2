package com.youzhi.api.vo;


import demo.sso.utils.IdUtils;
import demo.sso.utils.TimeUtils;
import lombok.Data;

@Data
public class ImgVO {
    //'图片id'
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

    public ImgVO () {}

    public ImgVO( String imgUrl, String imgTypeId, String imgSize, String imgLinkedId, String imgUploadUserId) {
        this.imgId = IdUtils.genUniqueId();
        this.imgUrl = imgUrl;
        this.imgTypeId = imgTypeId;
        this.imgSize = imgSize;
        this.imgLinkedId = imgLinkedId;
        this.imgUploadUserId = imgUploadUserId;
        this.createYear = TimeUtils.getCurrentYear();
        this.createMonth = TimeUtils.getCurrenMonth();
        this.createDay = TimeUtils.getCurrentDay();
        this.createTime = TimeUtils.getCurrentTime();
        this.updateTime = TimeUtils.getCurrentTime();
    }
}
