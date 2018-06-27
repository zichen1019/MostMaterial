package com.zichen.bootstrap.mapper;

import com.zichen.bootstrap.base.HousingInformation;
import com.zichen.bootstrap.base.HousingInformationWithBLOBs;

import java.util.List;

public interface HousingInformationMapper {
    int deleteByPrimaryKey(String annalid);

    int insert(HousingInformationWithBLOBs record);

    int insertSelective(HousingInformationWithBLOBs record);

    HousingInformationWithBLOBs selectByPrimaryKey(String annalid);

    int updateByPrimaryKeySelective(HousingInformationWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HousingInformationWithBLOBs record);

    int updateByPrimaryKey(HousingInformation record);

    List<HousingInformation> getList(HousingInformation record);
}