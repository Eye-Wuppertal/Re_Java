package jdbc;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbctest {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        String url = "127.0.0.1";
        String port = "3306";
        String uname = "root";
        String upsd = "wt988269";
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取数据库链接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/train",uname,upsd);
        //获取数据库操作对象
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from tb_user");
        System.out.println(resultSet);
        while(resultSet.next()){
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            String psd = resultSet.getString("password");
            System.out.println(id+"-"+name+"-"+psd);
        }
    }
}
