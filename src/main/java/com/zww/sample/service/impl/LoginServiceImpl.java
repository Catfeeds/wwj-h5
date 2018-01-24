 package com.zww.sample.service.impl;

 import com.zww.sample.repository.LoginMapper;
 import com.zww.sample.service.LoginService;
 import com.zww.sample.vo.LoginVo;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

 import java.sql.*;

 /**
  * 登录
  * @author john
  * @since 2017.10.10
  */
 @Service
 public class LoginServiceImpl implements LoginService {

     @Autowired
     private LoginMapper loginMapper;

     /**
      * 根据微信openId登录
      *
      * @param openId
      * @return
      */
     @Override
     public LoginVo login(String openId, String petName,
                          String portraitUri, String unionId) {

         /* 根据微信openId查询用户id */
         LoginVo vo = loginMapper.queryUserInfoByUnionId(unionId);

         // test
         boolean runFlg = false;
         if (runFlg) {
             try {
                 String url = "jdbc:mysql://localhost:3306/zwwsit?";
                 String name = "sys";
                 String pwd = "12345678";
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection(url, name, pwd);
                 Statement stat = con.createStatement();
                 ResultSet rs = stat.executeQuery("SELECT * FROM user_login WHERE unionId = 'obxmxxJF1YN5zL2WB4pDzuLdYv80'");
                 while (rs.next()) {
                     System.out.println("查询成功！！");
                 }
             } catch (SQLException e) {
                 e.printStackTrace();
             } catch (ClassNotFoundException e) {
                 e.printStackTrace();
             }
         }

         return vo;
     }
 }
