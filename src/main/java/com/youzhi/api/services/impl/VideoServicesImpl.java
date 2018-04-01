package com.youzhi.api.services.impl;


import com.youzhi.api.entity.Video;
import com.youzhi.api.repository.VideoRespository;
import com.youzhi.api.services.VideoServices;
import com.youzhi.api.vo.VideoVO;
import demo.sso.utils.TimeUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServicesImpl implements VideoServices {
    @Autowired
    private VideoRespository videoRespository;
    @Override
    public Video add(VideoVO videoVO) {
        videoVO.setCreateTime(TimeUtils.getCurrentTime());
        videoVO.setUpdateTime(TimeUtils.getCurrentTime());
        videoVO.setCreateYear(TimeUtils.getCurrentYear());
        videoVO.setCreateMonth(TimeUtils.getCurrenMonth());
        videoVO.setCreateDay(TimeUtils.getCurrentDay());
        Video video = new Video();
        BeanUtils.copyProperties(videoVO,video);
        return videoRespository.save(video);
    }

    @Override
    public void deleteByVideoId(String videoId) {
        // TODO check videoId
         videoRespository.delete(videoId);
    }

    @Override
    public Video updateVideoByVIdeoDesc(VideoVO videoVO) {
        videoVO.setUpdateTime(TimeUtils.getCurrentTime());
        Video video = new Video();
        BeanUtils.copyProperties(videoVO,video);
        return videoRespository.save(video);
    }
}
