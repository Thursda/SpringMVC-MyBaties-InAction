package org.fkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

/**
 *  HelloWorldController是一个基于注解的控制器,
 *  可以同时处理多个请求动作，并且无须实现任何接口。
 *  org.springframework.stereotype.Controller注解用于指示该类是一个控制器
 */
@Controller
public class HelloWorldController{
	
	 @RequestMapping("/helloWorld")
	 public String helloWorld(Model model) {
		 String message = HelloWorldController.class.getSimpleName() + ".HelloWorld";
	     model.addAttribute("message", message);
	     return "helloWorld";
	     //返回视图名称，已在springMVC-config.xml中配置了viewResolver，包括文件路径和文件.jsp后缀
	 }
	 
	 @RequestMapping("/helloWorld2")
	 public String helloWorld2(Model model) {
		 String message = HelloWorldController.class.getSimpleName() + ".HelloWorld2";
	     model.addAttribute("message", message);
	     return "helloWorld2";
	     //返回视图名称，已在springMVC-config.xml中配置了viewResolver，包括文件路径和文件.jsp后缀
	 }
}

