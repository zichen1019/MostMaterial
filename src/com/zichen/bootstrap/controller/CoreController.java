package com.zichen.bootstrap.controller;

import com.zichen.bootstrap.base.View;
import com.zichen.bootstrap.service.CoreService;
import com.zichen.bootstrap.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 处理所有请求
 * 前端：	1.正常使用视图。
 * 			2.统计视图。
 * 			3.技术视图。
 * @author 紫宸
 */
@Controller
public class CoreController {
	
	@Autowired
	private CoreService coreService;
	@Autowired
	private ViewService viewService;

	@RequestMapping("/getS")
	public String getS(){
		return "one.ftl";
	}

	@RequestMapping("/getHtml")
	public ModelAndView getHtml(){
		return new ModelAndView("one");
	}

	@RequestMapping("/getFtl")
	public ModelAndView getFtl(){
		return new ModelAndView("one");
	}

	@RequestMapping("/getJsp")
	public ModelAndView getJsp(){
		return new ModelAndView("index");
	}

	/**
	 * 此方法作用是获取视图
	 * 根据传入的路径提示值，从数据库查询相对应的页面路径，并返回此路径的视图
	 * @param viewName 路径提示值
	 * @return 页面
	 */
	@RequestMapping("/view/{viewName}")
	public ModelAndView view(@PathVariable("viewName") String viewName){
		View view = viewService.selectByViewName(viewName);
		return new ModelAndView(view.getViewpath());
	}

	@RequestMapping(value="/headPortrait")
	@ResponseBody
	public void headPortrait(MultipartFile f) throws IOException{
		//Spring MVC 中可以利用 MultipartFile 
	    //接收 上载的文件! 文件中的一切数据
	    //都可以从 MultipartFile 对象中找到

	    //获取上再是原始文件名
	    String file1 = 
	        f.getOriginalFilename();

	    System.out.println(file1);

	    //保存文件的3种方法:
	    //1. transferTo(目标文件)
	    //   将文件直接保存到目标文件, 可以处理大文件
	    //2. userfile1.getBytes() 获取文件的全部数据
	    //   将文件全部读取到内存, 适合处理小文件!!
	    //3. userfile1.getInputStream()
	    //   获取上载文件的流, 适合处理大文件

	    //保存的目标文件夹: /home/soft01/demo
	    File dir = new File("WebRoot/TomcatFile");
	    dir.mkdir();

	    File f1 = new File(dir, file1);

	    //第一种保存文件
	    //userfile1.transferTo(f1);
	    //userfile2.transferTo(f2);

	    //第三种 利用流复制数据
	    InputStream in1 = f.getInputStream();
	    FileOutputStream out1 = 
	        new FileOutputStream(f1);
	    int b;
	    while((b=in1.read())!=-1){
	        out1.write(b);
	    }
	    in1.close();
	    out1.close();

	}
	
}
