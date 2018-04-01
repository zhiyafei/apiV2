package com.youzhi.api.services;

import com.youzhi.api.entity.Phone;
import com.youzhi.api.vo.PhoneVO;

import java.util.List;

public interface PhoneServices {
    // 添加手机
    Phone addPhone(PhoneVO phoneVO);
    // 添加手机list
    List<Phone> addListPhone(List<PhoneVO> phoneVOList);
    // 修改手机
    Phone updatePhone(PhoneVO phoneVO);
    // 修改手机list
    List<Phone> updatePhoneList(List<PhoneVO> phoneVOList);
    // 删除手机 并且删除关联图片
    void deletePhone(String phoneId);
    // 删除手机list 并且删除关联手机图片
    boolean deletePhoneList(List<String> phoneIdList);
    // 通过手机id获取手机
    Phone getOnePhone(String phoneId);
    // 通过厂商id获取手机列表
    List<Phone> getPhoneListByBrandsId(String brandsId);
    // 通过厂商id和生产年份过滤手机列表
    List<Phone> getPhonesByBrandsIdEqualsAndProductionYearEquals(String brandsId,String year);

}
