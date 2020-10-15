package com.example.demo.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeMapper;
import com.example.demo.pojo.Employee;

@Service
public class EmployeeServiceImpl implements com.example.demo.service.EmployeeService{
	@Resource
	public EmployeeMapper employeeMapper;
	
	@Override
	public List<Employee> getall_Emp(){
		return employeeMapper.getall_Emp();
	}
}
