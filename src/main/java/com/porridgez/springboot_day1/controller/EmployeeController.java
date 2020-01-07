package com.porridgez.springboot_day1.controller;

import com.porridgez.springboot_day1.SqlMapper.EmployeeMapper;
import com.porridgez.springboot_day1.dao.EmployeeDao;
import com.porridgez.springboot_day1.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeMapper;
    @GetMapping("/dashboard/list")
    public String List(Map<String,Object> map){
//        Collection<Employee> employeeCollection= employeeDao.getAll();
//        model.addAttribute("emps",employeeCollection);
//        model.addAttribute("employees",employeeDao.getAll());
        map.put("employees",employeeMapper.getAll());
        return "emp/list";
    }
}
