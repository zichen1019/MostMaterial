package com.zichen.bootstrap.service.impl;

import com.zichen.bootstrap.base.HousingInformation;
import com.zichen.bootstrap.base.HousingInformationWithBLOBs;
import com.zichen.bootstrap.mapper.HousingInformationMapper;
import com.zichen.bootstrap.service.RentingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentingServiceImpl implements RentingService {

    @Autowired
    private HousingInformationMapper housingInformationMapper;

    @Override
    public List<HousingInformation> getList(HousingInformation housingInformation) {
        return housingInformationMapper.getList(housingInformation);
    }

    @Override
    public int deleteByPrimaryKey(String annalid) {
        return housingInformationMapper.deleteByPrimaryKey(annalid);
    }

    @Override
    public int insert(HousingInformationWithBLOBs record) {
        return housingInformationMapper.insert(record);
    }

    @Override
    public int insertSelective(HousingInformationWithBLOBs record) {
        return housingInformationMapper.insertSelective(record);
    }

    @Override
    public HousingInformationWithBLOBs selectByPrimaryKey(String annalid) {
        return housingInformationMapper.selectByPrimaryKey(annalid);
    }

    @Override
    public int updateByPrimaryKeySelective(HousingInformationWithBLOBs record) {
        return housingInformationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(HousingInformationWithBLOBs record) {
        return housingInformationMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(HousingInformation record) {
        return housingInformationMapper.updateByPrimaryKey(record);
    }
}
