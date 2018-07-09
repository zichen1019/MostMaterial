package com.zichen.bootstrap.controller;

import com.zichen.bootstrap.base.HousingInformation;
import com.zichen.bootstrap.base.User;
import com.zichen.bootstrap.base.View;
import com.zichen.bootstrap.service.RentingService;
import com.zichen.bootstrap.service.UserService;
import com.zichen.bootstrap.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/renting")
public class RentingController extends BaseController {

    @Autowired
    private RentingService rentingService;
    @Autowired
    private ViewService viewService;
    @Autowired
    private UserService userService;

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

    /**
     * @createTime 2018-6-23
     * @modifyTime
     * @Author zichen
     * @notes 获取房间详细信息
     * @param annalid
     * @return
     */
    @RequestMapping("/information")
    @ResponseBody
    public ModelAndView getInfomation(HttpServletRequest request, String viewname, String annalid){
        session =  getSession(request);
        View view = viewService.selectByViewName(viewname);
        HousingInformation housingInformation = rentingService.selectByPrimaryKey(annalid);
        //获取发布人信息
        User publisher =  userService.selectByPrimaryKey(housingInformation.getPublisher());
        getResultModel(request,view.getViewpath()).addObject("housingInformation",housingInformation)
                .addObject("user",getUser(request))
                .addObject("publisher",publisher);
        return RESULT_MODEL;
    }

}
