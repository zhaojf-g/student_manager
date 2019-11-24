package com.lon.personnelmanager.student.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lon.personnelmanager.common.Result.ResultCode;
import com.lon.personnelmanager.common.Result.ResultData;
import com.lon.personnelmanager.common.page.PageBean;
import com.lon.personnelmanager.student.entity.Student;
import com.lon.personnelmanager.student.servie.StudentService;
import com.lon.personnelmanager.user.entity.User;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	/**
	 * @param user
	 * @param page
	 * @return
	 */
	@ApiOperation(value = "根据登录用户查询学生列表")
	@GetMapping("/")
	public ResultData getStudentList(User user,PageBean page) {
		ResultData result = new ResultData();
		List<Student> list = studentService.getStudentList(user);
		result.setData(list);
		return result;
	}
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	@ApiOperation(value = "添加学生")
	@PostMapping("/")
	public ResultData insertStudent(Student student) {
		ResultData result = new ResultData();
		student = studentService.insertStudent(student);
		if(student!=null) {
			result.setData(student);
		}else {
			result.setCode(ResultCode.RESULT_FAIL_CODE);
		}
		return result;
	}
	
	/**
	 * 
	 * @param student
	 * @return
	 */
	@ApiOperation(value = "修改学生")
	@PutMapping("/")
	public ResultData updateStudent(Student student) {
		ResultData result = new ResultData();
		student = studentService.updateStudent(student);
		if(student!=null) {
			result.setData(student);
		}else {
			result.setCode(ResultCode.RESULT_FAIL_CODE);
		}
		return result;
	}
	
	@ApiOperation(value = "删除学生")
	@DeleteMapping("/{id}")
	public ResultData deleteStudent(@PathVariable("id")Integer id) {
		ResultData result = new ResultData();
		Integer i = studentService.deleteStudent(id);
		if(i>0) {
			result.setData(i);
		}else {
			result.setCode(ResultCode.RESULT_FAIL_CODE);
		}
		return result;
	}
	
	
}
