package com.youzhi.api.repository;

import com.youzhi.api.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneRespository extends JpaRepository<Phone,String> {

    List<Phone> getPhonesByBrandsIdEquals(String brandsId);
    List<Phone> getPhonesByBrandsIdEqualsAndProductionYearEquals(String brandsId,String year);
}
