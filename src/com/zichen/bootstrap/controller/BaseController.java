package com.zichen.bootstrap.controller;


import com.zichen.bootstrap.base.User;
import com.zichen.bootstrap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class BaseController {

    @Autowired
    private UserService userService;

    protected HttpSession session;

    protected ModelAndView RESULT_MODEL;

    protected Map<String,Object> RESULT_MAP;

    protected static final String SUCCESS = "success";

    protected static final String ERROR = "error";

    public HttpSession getSession(HttpServletRequest request){
        session = request.getSession();
        if(session != null && session.getAttribute("userId") != null){
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("D:\\session.txt"));
                out.newLine();
                out.append("["+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"]\t"+session.getId());
                out.flush();//写入文件  清空缓存
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return session;
    }

    public User getUser(HttpServletRequest request){
        session = getSession(request);
        if(session.getAttribute("userId") == null){
            return null;
        }
        return userService.selectByPrimaryKey(session.getAttribute("userId").toString());
    }

    public ModelAndView getResultModel(HttpServletRequest request,String path){
        this.RESULT_MODEL = new ModelAndView(path).addObject("user",getUser(request))
                .addObject("base","MostMaterial");
        return RESULT_MODEL;
    }

    public Map<String,Object> getResultMap(HttpServletRequest request){
        this.RESULT_MAP = new HashMap<>();
        RESULT_MAP.put("user",getUser(request));
        RESULT_MAP.put("base","MostMaterial");
        return RESULT_MAP;
    }

    /** 基于@ExceptionHandler异常处理 */
    @ExceptionHandler
    public String exp(HttpServletRequest request, Exception ex){
        request.setAttribute("ex", ex);
        // 根据不同错误转向不同页面
        return "error";
    }
}
