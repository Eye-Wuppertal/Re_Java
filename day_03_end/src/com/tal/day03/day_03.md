### 1.idea

项目分级 project-module-packages

idea常用快捷键

alt+enter   导入包，自动修正代码

crtl+y      删除光标所在行

crtl+d      复制光标所在行

crtl+alt+l  格式化代码

crtl+/      单行注释

crtl+shift+/多行注释

alt+ins     自动生成代码

alt+shift+上下  移动当前代码

### 2.方法

#### 2.1简单复习

```java
public class method {
    public static void main(String[] args) {
        fun("*");
    }
    public static void fun(String s){
        for(int i = 0;i <= 5;i++){
            for (int j = 0; j <= 10; j++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
```

![image-20210206114700033](D:\Git_Store\Re_Java\day_03\src\com\tal\day03\Img\image-20210206114700033.png)

#### 2.2定义方法的完整格式：

```java
/*
修饰符 返回值类型 方法名称（参数类型 参数名称，...）{
	方法体
	return 返回值
}
修饰符 public static（所有类都可访问 static可以使方法定义放在任何地方）
方法名称：命名规范为小驼峰，可以重名重载，但是重载的方法参数类型或参数数量需不同
参数有多个，需要用“，”隔开
return有两个作用：1.终止当前方法 2.输出方法执行后产生的最终数据
*/
```

例，定义两个数相加的方法

```java
public class methodAdd {
    public static void main(String[] args) {
        System.out.println(add(11,22));//33
    }
    public static int add(int a,int b){
        return a+b;
    }
}
```

#### 2.3方法的三种调用方式

1.单独调用

2.打印调用

3.复制调用

```java
public class methodUse {
    public static void main(String[] args) {
        //单独调用
        add(1,2);
        System.out.println("**********");
        //打印调用
        System.out.println(add(2,3));
        System.out.println("**********");
        //赋值调用
        int num = add(1,4);
        System.out.println(num);
    }
    public static int add(int a,int b){
        System.out.println("Method has been run!");
        return a+b;
    }
}
```

![image-20210206122624505](D:\Git_Store\Re_Java\day_03\src\com\tal\day03\Img\image-20210206122624505.png)

#### 2.4方法的执行顺序

从main方法的string srg[]进入，读到子方法时依次读取各参数，然后进入子方法，然后返回主方法

#### 2.5方法练习

2.5.1

比较两个数字是否相同

2.5.2

求1-100的数字和

2.5.3

打印指定次数的helloworld

```java
public class methodMethodPractice {
    public static void main(String[] args) {

    }
    public static boolean same(int a, int b){
        return a==b;
    }
    public static int add(){
        int sum = 0;
        for(int i = 0; i <= 100;i++){
            sum += i;
        }
        return sum;
    }
    public static void printHelloW(int num){
        for(int i = 0;i < num;num++){
            System.out.println("HelloWorld!!");
        }
    }
}
```

#### 2.6 方法注意事项

1. 方法定义在类中，不能在方法中嵌套方法
2. 方法的定义不会执行，只有调用才会执行
3. 方法有返回值类型则必须有return，且返回值类型和return接的数据类型需要保持一致
4. void方法return后面不能接数据值，但是可以接自己，即return自己
5. 一个方法中可以有多个return，但是要保证只有一个return会被执行

#### 2.7方法重载的注意事项

1. 参数个数不同
2. 参数数据类型不同
3. 不同数据类型的顺序不同

满足以上三点中的一点即可

方法的重载与下列因素无关

1. 与方法的名称无关
2. 与方法的返回值类型无关

#### 2.8方法重载的练习

```java
public class methodOverload {
    public static void main(String[] args) {
        
    }
    public static boolean isSame(int a,int b){
        return a==b;
    }
    public static boolean isSame(short a,short b){
        boolean same = a==b?true:false;
        return same;
    }
}
```

