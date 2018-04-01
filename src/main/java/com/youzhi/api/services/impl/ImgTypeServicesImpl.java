package com.youzhi.api.services.impl;

import com.youzhi.api.entity.ImgType;
import com.youzhi.api.repository.ImgTypeRepository;
import com.youzhi.api.services.ImgTypeServices;
import com.youzhi.api.vo.ImgTypeVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImgTypeServicesImpl implements ImgTypeServices{

    @Autowired
    private ImgTypeRepository imgTypeRepository;

    @Override
    public String getImgTypeIdByImgType(String ImgTypeName) {
        // TODO check ImgTypeName
        ImgType imgType = imgTypeRepository.getImgTypeByTypeNameEquals(ImgTypeName);
        if(imgType.getTypeId() != null || imgType.getTypeId() != null){
            return imgType.getTypeId();
        }else{
            return null;
        }
    }

    @Override
    public ImgType addImgType(String typeName) {
        // TODO IMGTYPENAME must be only
        ImgTypeVO imgTypeVO = new ImgTypeVO(typeName);
        ImgType imgType = new ImgType();
        BeanUtils.copyProperties(imgTypeVO,imgType);
        return imgTypeRepository.save(imgType);
    }

    @Override
    public List<ImgType> addImgTypes(List<String> typeNameList) {
        List<ImgType> list = new ArrayList<>();
        for (String typeName : typeNameList) {
            ImgTypeVO imgTypeVO = new ImgTypeVO(typeName);
            ImgType imgType = new ImgType();
            BeanUtils.copyProperties(imgTypeVO,imgType);
            list.add(imgType);
        }
        return imgTypeRepository.save(list);
    }
}
