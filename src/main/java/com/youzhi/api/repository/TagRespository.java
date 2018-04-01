package com.youzhi.api.repository;

import com.youzhi.api.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRespository  extends JpaRepository<Tag,String>{
    List<Tag> findTagsByTagNameLike(String tagName);
    Tag findTagByTagNameEquals(String tagName);
}
