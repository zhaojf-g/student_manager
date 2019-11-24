package com.lon.personnelmanager.student.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lon.personnelmanager.common.page.PageBean;
import com.lon.personnelmanager.student.entity.Student;
import com.lon.personnelmanager.student.servie.StudentService;
import com.lon.personnelmanager.user.entity.User;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	/**
	 * 根据登录用户查询学生
	 * @param model
	 * @param user
	 * @param page
	 * @return
	 */
	@RequestMapping("/home")
	public String getStudentList(Model model,User user,PageBean page) {
		List<Student> list = studentService.getStudentList(user);
		return "home";
	}
	
}
