package com.youzhi.api.repository;

import com.youzhi.api.entity.ImgType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImgTypeRespository extends JpaRepository<ImgType,String>{

    ImgType getImgTypeByTypeNameEquals(String typeName);

}
