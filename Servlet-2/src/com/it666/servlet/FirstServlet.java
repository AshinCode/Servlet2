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
	/*��servlet������ʱ�����
	servletʲôʱ��ᱻ�����أ�
	Ĭ�ϣ���һ�η��ʵ�ʱ��ᱻ����
	����ͨ�������ļ����õ�һ��������������ʱ��ʹ�������*/
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init......");
		//config ���Ի�ȡһЩ������Ϣ
		//1�����Ի�ȡServlet���� web.xml
		String name = config.getServletName();
		System.out.println("ServletName ="+name);
		
		//2�����Ի�ȡһЩ��ʼ������
		String value = config.getInitParameter("haha");
		System.out.println("getInitParameter="+value);
		
		//3�����Ի�ȡServletContext
		ServletContext servletContext = config.getServletContext();
		
	
	}

	@Override
	//ÿһ�η��������ʱ�򣬶������
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service......");
		
	}
	
	@Override
	//��servlet���ٵ�ʱ�����
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
