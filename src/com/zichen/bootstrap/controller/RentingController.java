package com.zichen.bootstrap.controller;

import com.zichen.bootstrap.base.HousingInformation;
import com.zichen.bootstrap.service.RentingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/renting")
public class RentingController {

    @Autowired
    private RentingService rentingService;

    /**
     * 查询租房信息
     * @param housingInformation
     * @return
     */
    @RequestMapping("/getRentings")
    @ResponseBody
    public List<HousingInformation> getRentings(HousingInformation housingInformation){

        return rentingService.getList(housingInformation);
    }

}
