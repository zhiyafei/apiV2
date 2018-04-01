package com.youzhi.api.vo;

import demo.sso.client.UserHolder;
import demo.sso.utils.IdUtils;
import demo.sso.utils.TimeUtils;
import lombok.Data;

@Data
public class PhoneVO {
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

    public PhoneVO(String phoneName,String brandsId, String phonePrice,  String phoneSalesVolume, String productionYear, String productionMonth, String productionDay) {
        this.phoneId = IdUtils.genUniqueId();
        this.brandsId = brandsId;
        this.phoneName = phoneName;
        this.phonePrice = phonePrice;
        this.phoneUploadUserId = UserHolder.getUser().getId();
        this.phoneSalesVolume = phoneSalesVolume;
        this.productionYear = productionYear;
        this.productionMonth = productionMonth;
        this.productionDay = productionDay;
        this.createYear = TimeUtils.getCurrentYear();
        this.createMonth = TimeUtils.getCurrenMonth();
        this.createDay = TimeUtils.getCurrentDay();
        this.createTime = TimeUtils.getCurrentTime();
        this.updateTime = TimeUtils.getCurrentTime();
    }

    public PhoneVO() {
    }
}
