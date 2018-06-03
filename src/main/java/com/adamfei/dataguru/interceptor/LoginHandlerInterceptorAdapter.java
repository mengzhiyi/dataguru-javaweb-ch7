package com.adamfei.dataguru.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登录interceptor判断
 * @author adam
 *
 */
public class LoginHandlerInterceptorAdapter implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse reponse, Object arg2, Exception arg3)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse reponse, Object arg2, ModelAndView arg3)
			throws Exception {

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse reponse, Object arg2) throws Exception {
		
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		if(username == null){
			reponse.sendRedirect(request.getContextPath()+"/login");
			return false;
		}
		
		return true;
	}

}
