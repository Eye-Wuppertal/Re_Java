package jdbcConnect;

import java.sql.*;

public class jdbcConnect {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/train";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "wt988269";
    //连接对象
    private static Connection connection;
    //1. 获取链接
    public static Connection getConnection(){
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            return connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    //2. 栈式关闭
    public static void close(ResultSet rs, Statement stmt, Connection
            connection) {
        try {//关闭结果集
            if (rs != null) rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {//关闭sql语句
            if (stmt != null) stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {//关闭连接
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
