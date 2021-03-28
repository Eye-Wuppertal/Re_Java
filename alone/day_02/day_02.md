day_02(1.22)

### 1.方法（函数）入门

将复杂的运算或语句定义为子方法，极大的化简优化main方法

方法定义的格式

```java
public static void MethodName（）{
    MethodBody
}
```

注意事项：

1. 方法定义无所谓先后
2. 方法的定义不能嵌套
3. 方法定义后只有调用才会运行

```java
public class Demo01Method{
    public static void main(String[] args){
        //兔子
        rabbit();
        //老虎
        tiger();
    }

    public static void tiger(){
        System.out.println("吃肉");
        System.out.println("威猛");
        System.out.println("大");
    }

    public static void rabbit(){
        System.out.println("吃草");
        System.out.println("可爱");
        System.out.println("小");
    }
}
```

### 2.JShell

java jdk9以上可以使用 cmd键入jshell进入

jshell可以用于简单的代码直接运行，简单工具

![image-20210122191704263](D:\Git_Store\Re_Java\day_02\Img\image-20210122191704263.png)  

### 3.常见语句

#### 1.判断语句if-else if-else

```java
if(判断条件1){
}
else if(判断条件2){   
}
else{   
}
```

```java
public class Demo02If_Else {
    public static void main(String[] args) {
        System.out.println("出门逛街，看到了一家网吧");
        int age = 17;
        if(age>=18){
            System.out.println("上了一会网");
        }else if(age>=16){
            System.out.println("根据政策可以限时上网两小时");
        }else{
            System.out.println("年龄太小，不让上网，唉");
        }  
    }
}
```

![image-20210205155812128](D:\Git_Store\Re_Java\day_02\Img\image-20210205155812128.png)

#### 2.选择语句switch-case

```java
switch(表达式){
    case 值1:
        语句1；
        break;
    case 值2:
        语句2；
        break;
        ...
    default:
        语句n+1；
        break;
}
```

```java
public class Demo03Switch {
    public static void main(String[] args) {
        int num =2;
        switch(num){
            case 1:System.out.println("A");
            break;
            case 2:System.out.println("AA");
            break;
            default:System.out.println("ERROR");
            break;
        }
    }
}
```

![image-20210205161243269](D:\Git_Store\Re_Java\day_02\Img\image-20210205161243269.png)

switch语句注意事项：

1. 多个case后面的值不能重复

2. switch后面的表达式只能是下列数据类型：

   基本数据类型：byte/short/char/int

   引用数据类型：String字符串、enum枚举

3. switch语句从匹配到的case开始运行，一直到break结束或整体结束

#### 3.循环语句

循环结构的组成

初始条件、判断条件、循环体、步进条件

##### 3.1for循环

```java
for(初始表达式；布尔表达式；步进表达式){
    循环体；
}
```

##### 3.2while循环

```java
while(条件判断){
    循环体；
    步进语句；
}
```

##### 3.3do_while循环

```java
do{
    循环体；
    步进语句；
}while(条件判断)；
```

练习：用循环求出1-100的偶数和

```java
public class Demo04Circulation {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i <= 100; i += 2) 
        {
            sum += i;
        }
        System.out.println(sum);//2550
    }
}
```

循环语句注意事项：

1. 如果判断条件从未满足，for和while执行0次，do_while至少执行一次
2. 对已知循环次数的一般用for循环，未知的用while或do_while（while更为常见）
3. break也可以用在循环中，直接跳出循环，continue跳出当次循环

4. 若循环条件一直满足，则为死循环
5. 循环可以嵌套