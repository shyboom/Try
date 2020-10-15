package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.pojo.Employee;

@Mapper
public interface EmployeeMapper {
	@Select("select * from tbl_emp")
	List<Employee> getall_Emp();
}
