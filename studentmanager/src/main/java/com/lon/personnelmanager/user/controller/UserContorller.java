package com.lon.personnelmanager.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lon.personnelmanager.common.Result.ResultCode;
import com.lon.personnelmanager.common.Result.ResultData;
import com.lon.personnelmanager.user.entity.User;
import com.lon.personnelmanager.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserContorller {

	@Autowired
	private UserService userservice;
	
	@PostMapping("/login")
    public ResultData login(User user) {
		ResultData result = new ResultData();
		User loginUser = userservice.login(user);
		if(loginUser!=null) {
			result.setData(loginUser);
		}else {
			result.setCode(ResultCode.RESULT_FAIL_CODE);
		}
        return result;
    }
	
}
