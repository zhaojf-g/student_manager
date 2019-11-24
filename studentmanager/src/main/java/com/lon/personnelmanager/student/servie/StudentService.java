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
	
	/**
	 * 添加学生
	 * @param user
	 * @return
	 */
	Student insertStudent(Student student);
	
	/**
	 * 修改学生
	 * @param student
	 * @return
	 */
	Student updateStudent(Student student);
	
	/**
	 * 删除学生
	 * @param id
	 * @return
	 */
	Integer deleteStudent(Integer id);
}
