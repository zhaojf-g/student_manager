package com.lon.personnelmanager.student.servie.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lon.personnelmanager.student.entity.Student;
import com.lon.personnelmanager.student.mapper.StudentMapper;
import com.lon.personnelmanager.student.servie.StudentService;
import com.lon.personnelmanager.user.entity.User;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper mapper;
	
	@Override
	public List<Student> getStudentList(User user) {
		List<Student> list = mapper.getStudentList(user);
		return list;
	}

	@Override
	public Student insertStudent(Student student) {
		int i = mapper.insert(student);
		if(i>0) {
			return student;
		}
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		int i = mapper.updateByPrimaryKey(student);
		if(i>0) {
			return student;
		}
		return null;
	}

	@Override
	public Integer deleteStudent(Integer id) {
		int i = mapper.deleteByPrimaryKey(id);
		if(i>0) {
			return i;
		}
		return 0;
	}
	

}
