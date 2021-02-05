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
