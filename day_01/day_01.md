### 1.常规HelloWord练习

新建一个文本文档，后缀名改为".java"

```java
public class HelloWorld {
    public static void main (String[] args){
        System.out.println("Hello Word!");
    }
}
```

打开cmd，转到文件所在路径 cd D:\Git_Store\Re_Java\day_01

键入 javac HelloWorld.java     (javac为编译指令，编译.java 文件)

生成.class 文件

键入 java helloWorld           (java为运行指令，运行编译之后的.class文件)

![](D:\Git_Store\Re_Java\day_01\Img\image-20210120132716999.png)

### 2.注释功能

//单行注释  /* */区块注释

```java
 //public class名必须定义与文件名保持一致
public class HelloWorld {
    //main方法的固定写法，程序从这里开始运行
    public static void main (String[] args){
        //Java的print语句
        System.out.println("Hello Word!");
    }
}
```

### 3.关键字

有特定含义，命名时不能随意使用。

关键字特点：

	1. 完全小写的字母
 	2. 在常见编译软件中会以特殊颜色区分

### 4.标识符

即自定义的命名、

命名规则：

	1. 可以包含字母、数字、下划线（_）和美元符号（$）（C里一般不包含美元符号）
 	2. 数字不能打头
 	3. 标识符不能是关键字

命名规范

1. 类名：每个单词首字母大写（HelloWorld）
2. 变量名与方法名：首字母小写，后面每个单词首字母大写（buttonClick）

### 5.常量

程序运行期间，固定不变的值。

常见分类：

1. 字符串常量：""引用的部分。 "abc"、"1112"
2. 整数常量
3. 浮点数常量
4. 字符常量：单个字符，''引用。 （Java中单个字符可以是汉字）
5. 布尔常量：true or false
6. 空常量：null

```java
public class Demo01_Const{
    public static void main(String[] args){
        System.out.println("ABCCCC");
        System.out.println("");//""中间可以为空
        System.out.println(30);
        System.out.println(2.5);
        System.out.println('$');//''中间不能留空格 null也不能单独放在println（）中
    }
}
```

![image-20210120170316750](D:\Git_Store\Re_Java\day_01\Img\image-20210120170316750.png)

### 6.数据类型

#### 1.基本数据类型（四类八种）

整数型 byte short int long

浮点型 float double

字符型 char

布尔型 boolean

注：

1. 浮点型只是近似值，非精确值
2. 数据范围与字节数不一定相关
3. 浮点型默认为double型，需使用float型需加后缀F
4. 整数默认为int型，需使用long型加后缀L

#### 2.引用数据类型

字符串、数组、类、接口、Lambda等

### 7.变量

创建变量的格式：

数据类型 变量名 = 数据值；

```java
int a;
a=100;
int b = 200;
byte c = 30;//定义的值不能超过数据类型的范围
boolean d = true;
```

注意事项：

1. 变量之间名称不可以重复
2. float和long类型字母后缀不能丢
3. 未赋值的变量不能直接使用
4. 变量使用不能超过作用域的范围（作用域：从定义变量的地方开始，到直属的大括号结束）

### 8.数据类型转换

#### 1.自动类型转换（隐式）

特点：无需特殊处理，自动完成

规则：数据范围由小到大

```java
public class Demo02_Const{
    public static void main(String[] args){
        long n1 = 100;
        //int->long，数据由小到大，自动完成数据转换
        float n2 = 20L;
        System.out.println(n2);//结果为20.0
    }
}
```

#### 2.强制类型转换

特点：代码需要特殊处理

格式：范围小的类型 变量名 = （范围小的类型）原大范围的数据；

```java
public class Demo03_Const{
    public static void main(String[] args){
        int n1 = (int) 100.5;
        System.out.println(n1);//输出100
        int n2 = (int)60000000000L;
        System.out.println(n2);//输出-129542144
       	byte b1 = 40;
       	byte b2 = 50;
       	byte b3 = b1 + b2;//ERROR!
    }
}
```

![image-20210120180733686](D:\Git_Store\Re_Java\day_01\Img\image-20210120180733686.png)

注意事项：

1. 强制类型转换可能发生精度损失和数据溢出，一般不推荐使用。
2. byte/short/char 都可以发生数学运算，char型会使用字符对应的ASCII,值且运算之前会转化为int类型，然后进行运算。
3. boolean 类型不能进行数据类型转换

### 9.编码表

#### 1.ASCII码表：

America Standard Code For Information Interchange，美国信息交换标准代码

常见：48->'0' 65->'A' 97->'a'

#### 2.Unicode码表：

万国码。0-127与ASCII完全一致，从128开始包含有更多字符。

### 10.运算符

#### 1.四则运算与取模（求余） ：+、-、*、/、%

普通运算 略

“+”的三种常见用法：

1. 对数值，即普通的加法

2. 对char型，先转化为int型然后进行加法

3. 对与字符串String型，“+”代表字符串连接操作(任何数据类型和字符串进行连接的时候，

   结果都会变成字符串)

```java
public class Demo04_Const{
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1+str2+"!!!");//输出结果为“HelloWorld!!!”
    }
}
```

![image-20210120192609131](D:\Git_Store\Re_Java\day_01\Img\image-20210120192609131.png)

#### 2.自增自减：++ 、--

使用格式：++变量名或变量名++

```java
a++;
b--;
```

使用方式：

1. 单独使用，为独立步骤，此时++a与a++完全一样；

2. 混合使用，与其他操作混合：

   A. ++a：变量先加1，用结果进行使用

   B. a++：先使用原变量值，结果再+1

```java
public class Demo05_Const{
    public static void main(String[] args){
        int a = 10;
        int b = 10;
        System.out.println("-----a++-----");
        System.out.println(a++);//10
        System.out.println(a);//11
        System.out.println("-----++b-----");
        System.out.println(++b);//11
        System.out.println(b);//11
    }
}
```

![image-20210120194239211](D:\Git_Store\Re_Java\day_01\Img\image-20210120194239211.png)

#### 3.赋值运算符

1. 基本赋值： a = 1；
2. 复合赋值： +=、-+、*=、/=、%=