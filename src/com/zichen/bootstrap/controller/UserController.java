package com.zichen.bootstrap.controller;

import com.zichen.bootstrap.base.User;
import com.zichen.bootstrap.base.View;
import com.zichen.bootstrap.service.UserService;
import com.zichen.bootstrap.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private ViewService viewService;
    @Autowired
    private UserService userService;

    @RequestMapping("/personalView")
    @ResponseBody
    public ModelAndView personalView(HttpServletRequest request, String viewName){
        View view = viewService.selectByViewName(viewName);
        return new ModelAndView(view.getViewpath());
    }


    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(HttpServletRequest request, User user){
        String pssd = user.getLoginpssd();
        User u = userService.checkUser(user);
        Map<String,Object> map = new HashMap();
        if(u == null){
            map.put(ERROR,"用户名不存在");
        }else if(!(user.getLoginpssd().equals(u.getLoginpssd()))){
            map.put(ERROR,"密码错误");
        }else{
            map.put(SUCCESS,"success");
            session = getSession(request);
            session.setAttribute("userId",u.getAnnalid());
            System.out.println("session写入----------"+u.getName()+":登陆成功---------------------------------------------------");
        }
        return map;
    }
}
