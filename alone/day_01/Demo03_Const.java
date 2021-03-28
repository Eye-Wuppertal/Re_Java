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