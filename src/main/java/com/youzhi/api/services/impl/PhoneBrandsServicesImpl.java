package com.youzhi.api.services.impl;

import com.youzhi.api.entity.Img;
import com.youzhi.api.entity.PhoneBrands;
import com.youzhi.api.repository.PhoneBrandsRespository;
import com.youzhi.api.services.PhoneBrandsServices;
import com.youzhi.api.services.PhoneServices;
import com.youzhi.api.vo.PhoneBrandsVO;
import demo.sso.utils.TimeUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneBrandsServicesImpl implements PhoneBrandsServices {
    @Autowired
    private PhoneBrandsRespository phoneBrandsRespository;
    @Override
    public PhoneBrands add(PhoneBrandsVO phoneBrandsVO) {
        phoneBrandsVO.setCreateTime(TimeUtils.getCurrentTime());
        phoneBrandsVO.setUpdateTime(TimeUtils.getCurrentTime());
        phoneBrandsVO.setCreateYear(TimeUtils.getCurrentYear());
        phoneBrandsVO.setCreateMonth(TimeUtils.getCurrenMonth());
        phoneBrandsVO.setCreateDay(TimeUtils.getCurrentDay());
        PhoneBrands phoneBrands = new PhoneBrands();
        BeanUtils.copyProperties(phoneBrandsVO,phoneBrands);
        return phoneBrandsRespository.save(phoneBrands);
    }

    @Override
    public PhoneBrands update(PhoneBrandsVO phoneBrandsVO) {
        phoneBrandsVO.setUpdateTime(TimeUtils.getCurrentTime());
        PhoneBrands phoneBrands = new PhoneBrands();
        BeanUtils.copyProperties(phoneBrandsVO,phoneBrands);
        return phoneBrandsRespository.save(phoneBrands);
    }

    @Override
    public PhoneBrands getOneByBrandsId(String brandsId) {
        return phoneBrandsRespository.findOne(brandsId);
    }
}
