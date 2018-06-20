package com.zichen.bootstrap.service;

import com.zichen.bootstrap.base.HousingInformation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RentingService {

    List<HousingInformation> getList(HousingInformation housingInformation);

}
