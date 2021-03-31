day04

## JDBC（Java Database Connectivity）

Java连接数据库的一种标准，使用Java操作数据库的接口

### jdbc怎样获取数据库的链接

```java
		//1. 注册驱动（8.0以上版本使用com.mysql.cj.jdbc.Driver）
        Class.forName("com.mysql.jdbc.Driver");
		//2. 获取数据库链接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/train",uname,upsd);
		//3. 获取数据库操作对象
        Statement statement = connection.createStatement();
		//4. 对操作对象执行数据库相关指令
        ResultSet resultSet = statement.executeQuery("select * from tb_user");	
```

