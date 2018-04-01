package com.youzhi.api.repository;

import com.youzhi.api.entity.Img;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImgRepository  extends JpaRepository<Img,String>{

    List<Img> getImgsByImgTypeIdAndImgLinkedIdEquals(String imgTypeId,String imgLinkedId);

    boolean deleteImgsByImgTypeIdAndImgLinkedIdEquals(String imgTypeId,String imgLinkedId);
}
