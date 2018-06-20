package com.zichen.bootstrap.common.properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import javax.servlet.http.HttpServlet;

public class Log4jInitServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    private static Logger logger = Logger.getLogger(Log4jInitServlet.class.getName());

    public Log4jInitServlet() {
        super();
    }

    public void init(){
        logger.debug("init debug");
        System.setProperty("logRoot","D:/Logs/"+getServletContext().getRealPath("/"));
        PropertyConfigurator.configure(getServletContext().getRealPath("/")+getInitParameter("configfile"));
        logger.info("init info");
    }

}
