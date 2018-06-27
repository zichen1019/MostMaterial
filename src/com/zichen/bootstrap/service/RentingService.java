package com.zichen.bootstrap.service;

import com.zichen.bootstrap.base.HousingInformation;
import com.zichen.bootstrap.base.HousingInformationWithBLOBs;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RentingService {

    List<HousingInformation> getList(HousingInformation housingInformation);

    int deleteByPrimaryKey(String annalid);

    int insert(HousingInformationWithBLOBs record);

    int insertSelective(HousingInformationWithBLOBs record);

    HousingInformationWithBLOBs selectByPrimaryKey(String annalid);

    int updateByPrimaryKeySelective(HousingInformationWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HousingInformationWithBLOBs record);

    int updateByPrimaryKey(HousingInformation record);

}
