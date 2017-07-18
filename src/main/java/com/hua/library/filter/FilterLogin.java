package com.hua.library.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FilterLogin implements Filter {

	@Override
	public void destroy() {
		System.out.println("start ------------- destroy");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("start ------------- doFilter");
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		HttpSession session = request.getSession();
		String a = request.getRequestURI();
		boolean is = request.getMethod().equals("POST");
		System.out.println(is);
		 if(a.contains(".css") 
				 || a.contains(".js") 
				 || a.contains(".png")
				 || a.contains(".jpg")
				 || a.contains(".GIF")
				 || a.contains(".gif")
				 ||request.getRequestURI().indexOf("login.do")!=-1 
				 || request.getRequestURI().indexOf("login.jsp")!=-1 
				 || (request.getRequestURI().indexOf("main.do")!=-1 && is)
				 || session.getAttribute("name")!=null){
	            //如果发现是css或者js文件，直接放行
	               chain.doFilter(request, response);
	               return;
	        }else{
	        	response.sendRedirect("login.do");
	        }
		System.out.println("end ------------- doFilter");
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
