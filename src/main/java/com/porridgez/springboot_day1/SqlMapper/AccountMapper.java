package com.porridgez.springboot_day1.SqlMapper;

import com.porridgez.springboot_day1.entities.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AccountMapper {
    @Select("select * from account where username=#{username} and password=#{password}")
    public Account getAccount(@Param("username") String username, @Param("password") String password);
}
