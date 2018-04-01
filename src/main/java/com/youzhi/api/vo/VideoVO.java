package com.youzhi.api.vo;

import demo.sso.utils.IdUtils;
import demo.sso.utils.TimeUtils;
import lombok.Data;

@Data
public class VideoVO {

    private String videoId;
    //'视频地址'
    private String videoUrl;
    //'视频标题'
    private String videoTitle;
    //'视频描述'
    private String videoDesc;
    //'视频大小'
    private String videoSize ;
    //'视频时长'
    private String videoLength ;
    //'视频观看次数'
    private String videoViewTimes;
    //'视频上传人id'
    private String videoUploadUserId;
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

    public VideoVO(String videoUrl, String videoTitle, String videoDesc, String videoSize, String videoLength, String videoViewTimes, String videoUploadUserId) {
        this.videoId = IdUtils.genUniqueId();
        this.videoUrl = videoUrl;
        this.videoTitle = videoTitle;
        this.videoDesc = videoDesc;
        this.videoSize = videoSize;
        this.videoLength = videoLength;
        this.videoViewTimes = videoViewTimes;
        this.videoUploadUserId = videoUploadUserId;
        this.createYear = TimeUtils.getCurrentYear();
        this.createMonth = TimeUtils.getCurrenMonth();
        this.createDay = TimeUtils.getCurrentDay();
        this.createTime = TimeUtils.getCurrentTime();
        this.updateTime = TimeUtils.getCurrentTime();
    }

    public VideoVO(){}
}
