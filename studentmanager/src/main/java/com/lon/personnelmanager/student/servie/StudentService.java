package com.lon.personnelmanager.student.servie;

import java.util.List;

import com.lon.personnelmanager.student.entity.Student;
import com.lon.personnelmanager.user.entity.User;

public interface StudentService {
	
	/**
	 * 根据登录用户查询学生
	 * @param user
	 * @return
	 */
	List<Student> getStudentList(User user);

}
