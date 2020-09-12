package com.yehong.library.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yehong.library.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

@Mapper
public interface UserMapper{
    //通过id返回用户类
    @Select("SELECT id, user_name, passwd FROM `user` WHERE id = #{id} ")
    User getUserByID(int id);

    //是否存在用户名查询
    @Select("SELECT COUNT(*) FROM `user` WHERE user_name=#{userName}")
    boolean isExist(String userName);

    //通过用户名查询密码
    @Select("SELECT passwd FROM `user` WHERE user_name=#{userName}")
    String getPasswdByName(String userName);

    @Select("SELECT COUNT(*) FROM `user` WHERE  user_name= #{userName} AND passwd = #{passwd}")
    boolean logIn(@Param("userName") String userName, @Param("passwd") String passwd);

    //插入用户名密码并返回主键id,用getId获得
    @Insert("INSERT INTO `library`.`user`(`user_name`, `passwd`) VALUES (#{userName}, #{passwd})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insertUser(User user);

    //改用户名密码
    @Update("UPDATE `library`.`user` SET `user_name` = #{userName}, `passwd` = #{passwd} WHERE `id` = #{id}")
    boolean updateUser(User user);




}
