package com.porridgez.springboot_day1.SqlMapper;

import com.porridgez.springboot_day1.entities.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface EmployeeMapper {
    @Select("select * from employee")
    List<Employee> getAll();
}
