package com.youzhi.api.services;

import com.youzhi.api.entity.Video;
import com.youzhi.api.vo.VideoVO;

public interface VideoServices {
    // 添加视频
    Video add(VideoVO videoVO);
    // 删除视频
    void deleteByVideoId(String videoId);

    // 修改视频其他属性
    Video updateVideoByVIdeoDesc(VideoVO videoVO);
}
