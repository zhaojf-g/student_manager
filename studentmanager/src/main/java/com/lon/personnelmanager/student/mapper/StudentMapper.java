package com.lon.personnelmanager.student.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lon.personnelmanager.student.entity.Student;
import com.lon.personnelmanager.user.entity.User;

@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    List<Student> getStudentList(User user);
}