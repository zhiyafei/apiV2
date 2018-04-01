package com.youzhi.api.services.impl;

import com.youzhi.api.constvalue.ImgTypeConst;
import com.youzhi.api.entity.Phone;
import com.youzhi.api.repository.PhoneRespository;
import com.youzhi.api.services.PhoneServices;
import com.youzhi.api.vo.PhoneVO;
import demo.sso.utils.TimeUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class phoneServicesImpl implements PhoneServices {
    @Autowired
    private PhoneRespository phoneRespository;
    @Autowired
    private ImgTypeServicesImpl imgTypeServices;

    @Override
    public List<Phone> getPhonesByBrandsIdEqualsAndProductionYearEquals(String brandsId, String year) {
        // TODO 字段检查
        return phoneRespository.getPhonesByBrandsIdEqualsAndProductionYearEquals(brandsId,year);
    }

    @Autowired
    private ImgServicesImpl imgServices;

    @Override
    public Phone getOnePhone(String phoneId) {
        // TODO 字段检查
        return phoneRespository.findOne(phoneId);
    }

    @Override
    public List<Phone> getPhoneListByBrandsId(String brandsId) {
        // TODO 字段检查
        return phoneRespository.getPhonesByBrandsIdEquals(brandsId);
    }

    @Override
    public Phone addPhone(PhoneVO phoneVO) {
        // TODO check 手机厂商是否存在
        phoneVO.setCreateTime(TimeUtils.getCurrentTime());
        phoneVO.setUpdateTime(TimeUtils.getCurrentTime());
        phoneVO.setCreateYear(TimeUtils.getCurrentYear());
        phoneVO.setCreateMonth(TimeUtils.getCurrenMonth());
        phoneVO.setCreateDay(TimeUtils.getCurrentDay());
        Phone phone = new Phone();
        BeanUtils.copyProperties(phoneVO,phone);
        return phoneRespository.save(phone);
    }

    @Override
    public List<Phone> addListPhone(List<PhoneVO> phoneVOList) {
        List<Phone> phoneList = new ArrayList<>();
        for (PhoneVO phoneVO : phoneVOList) {
            // TODO check 手机厂商是否存在
            phoneVO.setCreateTime(TimeUtils.getCurrentTime());
            phoneVO.setUpdateTime(TimeUtils.getCurrentTime());
            phoneVO.setCreateYear(TimeUtils.getCurrentYear());
            phoneVO.setCreateMonth(TimeUtils.getCurrenMonth());
            phoneVO.setCreateDay(TimeUtils.getCurrentDay());
            Phone phone = new Phone();
            BeanUtils.copyProperties(phoneVO,phone);
            phoneList.add(phone);
        }
        return phoneRespository.save(phoneList);
    }

    @Override
    public Phone updatePhone(PhoneVO phoneVO) {
        if (phoneVO.getPhoneId() != null || phoneVO.getPhoneId() != ""){
            phoneVO.setUpdateTime(TimeUtils.getCurrentTime());
            Phone phone = new Phone();
            BeanUtils.copyProperties(phoneVO,phone);
            return phoneRespository.save(phone);
        } else {
            return null;
        }

    }

    @Override
    public List<Phone> updatePhoneList(List<PhoneVO> phoneVOList) {
        List<Phone> phoneList = new ArrayList<>();
        for (PhoneVO phoneVO : phoneVOList) {
            if (phoneVO.getPhoneId() != null || phoneVO.getPhoneId() != ""){
                phoneVO.setUpdateTime(TimeUtils.getCurrentTime());
                Phone phone = new Phone();
                BeanUtils.copyProperties(phoneVO,phone);
                phoneList.add(phone);
            }
        }
        return phoneRespository.save(phoneList);
    }

    @Override
    @Transactional
    public void deletePhone(String phoneId) {
        if (phoneId!= null || phoneId != ""){
                // TODO check PhoneId 是否合法
            phoneRespository.delete(phoneId);
            String imgTypeId = imgTypeServices.getImgTypeIdByImgType(ImgTypeConst.TYPE_PHONE_VALUE);
            if(imgTypeId != null || imgTypeId != ""){
                imgServices.deleteImgsByImgTypeIdAndImgLinkedIdEquals(imgTypeId,phoneId);
            }

        }
    }

    @Override
    @Transactional
    public boolean deletePhoneList(List<String> phoneIdList) {
        // TODO 只提供一个删除方法
        // TODO 方法危害性极大 不予实现
        return false;
    }
}
