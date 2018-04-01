package com.youzhi.api.services;

import com.youzhi.api.entity.Tag;

import java.util.List;

public interface TagServices {

    // 创建标签
    Tag add(String tagName,String logo);
    // 修改标签名字 或者logo
    Tag update(String tagId,String tagName,String logo);
    // 删除标签
    void deleteTag(String tagId);
    // 删除多个标签
    boolean deleteTagList(List<String> tagIdList);
    // 查询标签
    Tag getOneTag(String tagId);
    // 查询所有标签
    List<Tag> getAll();
    // 按照名字查询标签 模糊查找
    List<Tag> getTagsByTagNamelike(String tagName);
    // 精确查找
    Tag getTagByTagNameEq(String tagName);
}
