public class Demo01Method{
    public static void main(String[] args){
        //兔子
        System.out.println("吃草");
        System.out.println("可爱");
        System.out.println("小");
        rabbit();
        //老虎
        System.out.println("吃肉");
        System.out.println("威猛");
        System.out.println("大");
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