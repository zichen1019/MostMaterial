package com.zichen.bootstrap.service.impl;

import com.zichen.bootstrap.base.HousingInformation;
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
}
