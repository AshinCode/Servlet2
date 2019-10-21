package com.it666.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{

	@Override
	/*当servlet创建的时候调用
	servlet什么时候会被创建呢？
	默认：第一次访问的时候会被创建
	或者通过配置文件设置第一次启动服务器的时候就创建对象*/
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init......");
		//config 可以获取一些配置信息
		//1、可以获取Servlet名称 web.xml
		String name = config.getServletName();
		System.out.println("ServletName ="+name);
		
		//2、可以获取一些初始化参数
		String value = config.getInitParameter("haha");
		System.out.println("getInitParameter="+value);
		
		//3、可以获取ServletContext
		ServletContext servletContext = config.getServletContext();
		
	
	}

	@Override
	//每一次发送请求的时候，都会调用
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service......");
		
	}
	
	@Override
	//当servlet销毁的时候调用
	public void destroy() {
		System.out.println("destroy......");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
