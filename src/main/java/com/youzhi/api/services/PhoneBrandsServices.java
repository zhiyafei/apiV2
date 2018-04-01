package com.youzhi.api.services;

import com.youzhi.api.entity.PhoneBrands;
import com.youzhi.api.vo.PhoneBrandsVO;

public interface PhoneBrandsServices {
    // 添加手机厂商
    PhoneBrands add(PhoneBrandsVO phoneBrandsVO);
    // 修改手机厂商
    PhoneBrands update(PhoneBrandsVO phoneBrandsVO);
    // 获取手机厂商信息
    PhoneBrands getOneByBrandsId(String brandsId);
}
