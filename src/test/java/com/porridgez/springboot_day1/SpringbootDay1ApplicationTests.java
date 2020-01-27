package com.porridgez.springboot_day1;

import com.porridgez.springboot_day1.SqlMapper.AccountMapper;
import com.porridgez.springboot_day1.SqlMapper.EmployeeMapper;
import com.porridgez.springboot_day1.entities.Employee;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

@MapperScan("com.porridgez.springboot_day1.SqlMapper")
@SpringBootTest
class SpringbootDay1ApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private AccountMapper accountMapper;
    @Test
    void contextLoads() throws Exception{
//        System.out.println(dataSource.getClass());
//        Connection connection=dataSource.getConnection();
//        System.out.println(connection);
//        connection.close();
        System.out.println(employeeMapper.getAll());
    }

    @Test
    public void functionTest(){
        List<Employee> list=employeeMapper.getAll();
        System.out.println(list);
    }

}
