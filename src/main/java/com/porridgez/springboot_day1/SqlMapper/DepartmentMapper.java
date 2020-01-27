package com.porridgez.springboot_day1.SqlMapper;

import com.porridgez.springboot_day1.entities.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface DepartmentMapper {
    /**
     * 查询所有部门
     * @return
     */
    @Select("select * from department")
    List<Department> getAll();
}
