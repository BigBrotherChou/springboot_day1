package com.porridgez.springboot_day1.controller;

import com.porridgez.springboot_day1.SqlMapper.EmployeeMapper;
import com.porridgez.springboot_day1.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeMapper;

    //显示所有员工列表
    @GetMapping("/emps")
    public String List(Map<String,Object> map){
        map.put("employees",employeeMapper.getAll());
        return "emp/list";
    }
    //跳转到添加页面
    @GetMapping("/emp")
    public String addEmployee(){
        return "emp/add";
    }
    //提交添加员工
    @PostMapping("/emp")
    public String addEmploy(Employee employee){

        return "redirect:/emps";
    }

    //跳转到员工修改页面
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id")Integer id,Model model){
        model.addAttribute("emp",employeeMapper.getEmployee(id));
        return "emp/add";
    }
    //提交员工信息修改
    @PutMapping("/emp")
    public String editEmployee(Employee employee){

        return "/emp/list";
    }
}
