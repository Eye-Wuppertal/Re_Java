数据库的增删查改

建立一个数据库，执行相关操作





#启动mysql

\# net start MySQL57

\#停止mysql

\# net stop MySQL57



show databases; # 显示所有的数据库

create database `testschema`; # 创建一个新的数据库 testschema

drop database testschema; # 删除数据库

create database sanwen;



use sanwen; # 切换数据库，使用sanwen

create table news( # 在sanwen数据库下面创建一个数据库表news

id int primary key , # id 字段，类型是int 是主键

name varchar(60) unique , # name 字段 类型是varchar 长度是60个字节 唯一

password varchar(30) # password 字段 类型varchar 长度是30

) default charset utf8 ENGINE INNODB; # 默认的字符集是utf8 数据库引擎是INNODB



insert into news value(2, 'jones', '123456'); # 插入一条数据到news表



select * from news; # 查询数据表news里面的所有数据



update news set password='888' where id=1; # 更改id为1的用户的密码为888





\#数据库学习：

\#创建数据库：

\# create database [数据库名]; 比如：create database xiaoshuo;

create database xiaoshuo default character set utf8; # 创建数据库名，并设置对应的编码为utf8



\# 选择数据库：

\# use 数据库名；

use xiaoshuo;



\# 新建数据库表：

\# create table 表名(

\# 表字段信息

\# ) 字符集和数据库引擎信息;



\# 例子：

CREATE TABLE posts(

id int primary key auto_increment, # 设置id字段为主键，并且自增

author varchar(30), # 作者 最大长度是30个字符

title varchar(200) not null unique, # 标题 最大长度是200个字符，不能为空，是唯一的

content text not null , # 内容，文本类型最大64k，不能为空

time datetime default current_timestamp() # 发布时间，默认值是当前的时间

) default character set utf8 ENGINE InnoDB; # 数据库引擎是用InnoDB 可以省略。



alter table posts default character set utf8; # 更改数据表的字符集为utf8

\# 插入数据：

\# INSERT INTO 表名（字段名）VALUE (字段值); VALUE则是插入一条数据

\# INSERT INTO 表名（字段名）VALUES (字段值),(第二条数据),(第三条数据)...; VALUES则是可以插入多条数据

\# 例子：

insert into posts values

(4, 'jack', '设置MYSQL数据库编码为UTF-8', '设置MYSQL数据库编码为UTF-8的内容',

'2018-10-15 14:24:50'); # 没有指定插入的列的时候，就需要填完所有的数据

insert into posts(author, title, content) VALUE('brooks', '这是标题', '这是内容');



\# 一次性插入多条数据：

insert into posts(author, title, content)

values ('xiaohong', 'python大法好', 'Python是真的很棒'),

('xiaoming', 'java大法好', 'Java比Python牛多了'),

('laowang', 'php大法好', 'php是世界上最好语言');



\# 查询数据：

\# select 字段名 from 表名 [条件]; # 字段名星号代表所有

select * from posts;

select author, title, content from posts; # 只查询作者，标题，内容

select * from posts where author = 'brooks'; # 查询Brooks发布分文章信息

\# 查询Brooks和xiaohong发布的文章 in是代表集合

select author, title, content from posts where author in('brooks', 'xiaohong');



select * from posts where author != 'brooks'; # 查询非brooks发布的文章



\# 模糊查询 like %字符%

select * from posts where title like '%大法好%'; # 查询标题包含大法好的文章



select * from posts where title like '%大法好'; # 查询标题中以大法好结尾的数据



\# 排序 order by 字段名 desc/asc desc 降序，asc 升序

select * from posts order by id desc;

select * from posts where title like '%大法好%' order by id desc;



\# 查询指定条数的数据

\# limit n 表示查询结果不多于n行

\# limit n,m 表示从第n行开始(不包含n这行)，查询m条数据

select * from posts limit 4; # 查询前面4条数据

select * from posts order by id desc limit 4; # 查询后面4条数据

select * from posts where id > 3 limit 2; # 查询id大于3的2条数据

select * from posts limit 3,2; # 同上

select * from posts where content like '%Python%' and author='xiaohong';



\# 统计条数，as是字段别名关键字

select COUNT(*) as total from posts where author='brooks';



\# 更改数据

\# 语法 update 表名 set 字段名=字段值 条件

update posts set title='python大法好啊，是真的吗' where author='xiaohong';



\# 删除数据

\# delete from 表名 条件

delete from posts where author='laowang';