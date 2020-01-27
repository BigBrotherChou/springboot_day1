package com.porridgez.springboot_day1.SqlMapper;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.porridgez.springboot_day1.entities.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import sun.reflect.generics.tree.VoidDescriptor;

import java.util.List;
@Repository
@Mapper
public interface EmployeeMapper {
    //查询所有操作
    @Select("select * from employee")
    List<Employee> getAll();

    //按照id查询员工操作
    @Select("select * from employee where id=#{id}")
    Employee getEmployee(@Param("id")Integer id);

    //添加操作
    @Insert("insert into employee(lastname,gender,age) values (#{lastname},#{age})")
    int insertEmployee(Employee employee);

    //修改操作
    @Update("update employee set name=#{name},age=#{age}")
    int updateEmployee(Employee employee);
}
