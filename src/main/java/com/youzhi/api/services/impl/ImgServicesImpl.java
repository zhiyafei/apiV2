package com.youzhi.api.services.impl;

import com.youzhi.api.entity.Img;
import com.youzhi.api.repository.ImgRepository;
import com.youzhi.api.services.ImgServices;
import com.youzhi.api.vo.ImgVO;
import demo.sso.utils.TimeUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgServicesImpl implements ImgServices {
    @Autowired
    private ImgRepository imgRepository;
    @Override
    public Img addImg(ImgVO imgVO) {
        imgVO.setCreateTime(TimeUtils.getCurrentTime());
        imgVO.setUpdateTime(TimeUtils.getCurrentTime());
        imgVO.setCreateYear(TimeUtils.getCurrentYear());
        imgVO.setCreateMonth(TimeUtils.getCurrenMonth());
        imgVO.setCreateDay(TimeUtils.getCurrentDay());
        Img img = new Img();
        BeanUtils.copyProperties(imgVO,img);
        return imgRepository.save(img);
    }

    @Override
    public Img updateImg(ImgVO imgVO) {
        if(imgVO.getImgId() != null || imgVO.getImgId() != ""){
            imgVO.setUpdateTime(TimeUtils.getCurrentTime());
            Img img = new Img();
            BeanUtils.copyProperties(imgVO,img);
            return imgRepository.save(img);
        }
        return null;

    }

    @Override
    public void deleteImgByImgId(String ImgId) {
       imgRepository.delete(ImgId);
    }

    @Override
    public boolean deleteImgsByImgTypeIdAndImgLinkedIdEquals(String imgTypeId, String imgLinkedId) {
        return imgRepository.deleteImgsByImgTypeIdAndImgLinkedIdEquals(imgTypeId,imgLinkedId);
    }

    @Override
    public Img getOneByImgId(String imgId) {
        return imgRepository.findOne(imgId);
    }

    @Override
    public List<Img> getImgsByImgTypeIdAndImgLinkedIdEquals(String imgTypeId, String imgLinkedId) {
        return imgRepository.getImgsByImgTypeIdAndImgLinkedIdEquals(imgTypeId,imgLinkedId);
    }
}
