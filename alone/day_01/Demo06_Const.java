public class Demo06_Const{
    public static void main(String[] args){
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        System.out.println("-----a+=a++-----");
        a+=a++;
        System.out.println(a);//20
        System.out.println("-----b+=++b-----");
        b+=++b;
        System.out.println(b);//21
        System.out.println("-----c+=(c++)-----");
        c+=(c++);
        System.out.println(c);//20
        System.out.println("-----d+=(++d)-----");
        d+=(++d);
        System.out.println(d);//21
    }
}