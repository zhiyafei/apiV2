package com.youzhi.api.services;

import com.youzhi.api.entity.Img;
import com.youzhi.api.vo.ImgVO;

import java.util.List;

// 图片
public interface ImgServices {
    // 添加图片
    Img addImg(ImgVO imgVO);
    // 修改图片
    Img updateImg(ImgVO imgVO);
    // 删除图片
    void deleteImgByImgId(String ImgId);
    // 通过关联id删除
    boolean deleteImgsByImgTypeIdAndImgLinkedIdEquals(String imgTypeId,String imgLinkedId);
    // 根据id查找图片
    Img getOneByImgId(String imgId);
    // 根据图片类型id和图片关联id查找图片
    List<Img> getImgsByImgTypeIdAndImgLinkedIdEquals(String imgTypeId,String imgLinkedId);

}
