package com.zichen.bootstrap.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class BaseController {

    protected HttpSession session;

    protected Map<String,Object> REL;

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

}
