package com.lon.personnelmanager.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lon.personnelmanager.common.constant.SystemConstant;
import com.lon.personnelmanager.user.entity.User;
import com.lon.personnelmanager.user.service.UserService;

@Controller
public class UserContorller {

	@Autowired
	private UserService userservice;
	
	@RequestMapping("login")
    public String login(Model model, String title, Integer pageSize,Integer pageNum) {
        return "login";
    }
	
	@RequestMapping("login.action")
    public String checkLogin(User user,HttpServletRequest request) {
		HttpSession session = request.getSession();
		User loginUser = userservice.login(user);
		if(loginUser!=null) {
			session.setAttribute(SystemConstant.userKey, loginUser);
			return "home";
		}else {
			return "login";
		}
        
    }
	
}
