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