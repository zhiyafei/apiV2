package com.youzhi.api.services;

import com.youzhi.api.entity.ImgType;
import com.youzhi.api.vo.ImgTypeVO;

import java.util.List;

public interface ImgTypeServices {
    // add
    ImgType addImgType(String typeName);
    List<ImgType> addImgTypes(List<String> typeNameList);
    String getImgTypeIdByImgType(String ImgTypeName);
}
