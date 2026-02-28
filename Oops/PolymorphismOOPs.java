package Oops;

public class PolymorphismOOPs {
    public static void main(String[] args) {
//        calculater calc =new calculater();
//        System.out.println(calc.sum(1,2));
//        System.out.println(calc.sum((float)1.5,(float)2.5));
//        System.out.println(calc.sum(1,2,3));

        deer d =new deer();
        d.eat();

    }
}

class animals{
    void eat(){
        System.out.println("eats nothig");
    }
}

class deer extends animal{
    void eat(){
        System.out.println("est grass");
    }
}


class calculater{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum (int a,int b,int c){
        return a+b+c;
    }
}
