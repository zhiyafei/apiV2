package com.youzhi.api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Video {
    // '视频id'
    @Id
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
    public Video(){}
}
