package com.youzhi.api.services.impl;

import com.youzhi.api.entity.PhoneBrands;
import com.youzhi.api.entity.Tag;
import com.youzhi.api.repository.TagRespository;
import com.youzhi.api.services.TagServices;
import com.youzhi.api.vo.TagVO;
import demo.sso.utils.TimeUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagServicesImpl implements TagServices {

    @Autowired
    private TagRespository tagRespository;

    @Override
    public Tag add(String tagName, String logo) {
        // TODO check tagName and Logo
        TagVO tagVO = new TagVO(tagName,logo);
        Tag tag  = new Tag();
        BeanUtils.copyProperties(tagVO,tag);
        return tagRespository.save(tag);
    }

    @Override
    public Tag update(String tagId,String tagName, String logo) {
        // TODO check tagId check tagName check logo
       Tag tag = getOneTag(tagId);
       if (tag.getTagId() != null){
           if (tagName != null ){
               tag.setTagName(tagName);
           }
           if (logo != null) {
               tag.setTagLogo(logo);
           }
           return tagRespository.save(tag);
       }
       return null;
    }

    @Override
    public void deleteTag(String tagId) {
        // TODO check tagId
        tagRespository.delete(tagId);
    }

    @Override
    public boolean deleteTagList(List<String> tagIdList) {
        // TODO check tagIdList
        // TODO 权限太大 不予实现
        return false;
    }

    @Override
    public Tag getOneTag(String tagId) {
        // TODO check tagId;
        return tagRespository.findOne(tagId);
    }

    @Override
    public List<Tag> getAll() {
        return tagRespository.findAll();
    }

    @Override
    public List<Tag> getTagsByTagNamelike(String tagName) {
        // TODO check tagName
        return tagRespository.findTagsByTagNameLike(tagName);
    }

    @Override
    public Tag getTagByTagNameEq(String tagName) {
        // TODO check tagName
        return tagRespository.findTagByTagNameEquals(tagName);
    }
}
