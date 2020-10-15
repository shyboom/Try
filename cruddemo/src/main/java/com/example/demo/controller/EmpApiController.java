package com.example.demo.controller;

import com.example.demo.service.EmployeeService;
import com.example.demo.pojo.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-12T12:15:20.272Z[GMT]")
@Controller
public class EmpApiController implements EmpApi {

    private static final Logger log = LoggerFactory.getLogger(EmpApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    @Autowired
    private EmployeeService service;

    @org.springframework.beans.factory.annotation.Autowired
    public EmpApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Employee>> getallEmp() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	List<Employee> list = service.getall_Emp();
                System.out.println(list.toString());
                return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
				
				  } catch (Exception e) {
				  log.error("Couldn't serialize response for content type application/json",
				  e); return new
				  ResponseEntity<List<Employee>>(HttpStatus.INTERNAL_SERVER_ERROR); }
				 
        }

        return new ResponseEntity<List<Employee>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
