package com.lon.personnelmanager.student.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lon.personnelmanager.common.Result.ResultData;
import com.lon.personnelmanager.common.page.PageBean;
import com.lon.personnelmanager.student.entity.Student;
import com.lon.personnelmanager.student.servie.StudentService;
import com.lon.personnelmanager.user.entity.User;

@RestController
@RequestMapping("/student")
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
	@GetMapping("/")
	public ResultData getStudentList(Model model,User user,PageBean page) {
		ResultData result = new ResultData();
		List<Student> list = studentService.getStudentList(user);
		result.setData(list);
		return result;
	}
	
}
