package com.youzhi.api.vo;

import demo.sso.utils.IdUtils;
import demo.sso.utils.TimeUtils;
import lombok.Data;

@Data
public class PhoneBrandsVO {

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

    public PhoneBrandsVO(){}

    public PhoneBrandsVO( String brandsName, String brandsLogo, String brandsDesc) {
        this.brandsId = IdUtils.genUniqueId();
        this.brandsName = brandsName;
        this.brandsLogo = brandsLogo;
        this.brandsDesc = brandsDesc;
        this.createYear = TimeUtils.getCurrentYear();
        this.createMonth = TimeUtils.getCurrenMonth();
        this.createDay = TimeUtils.getCurrentDay();
        this.createTime = TimeUtils.getCurrentTime();
        this.updateTime = TimeUtils.getCurrentTime();
    }
}
