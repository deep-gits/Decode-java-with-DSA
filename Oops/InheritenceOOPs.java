package Oops;

public class InheritenceOOPs {
    public static void main(String[] args) {
        fish shark=new fish();
        shark.eat();

        dog doggy =new dog();
        doggy.eat();
        doggy.leg=4;
        System.out.println(doggy.leg);
    }

}

class animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathe");
    }
}

class fish extends animal{
    int fins;

    void swim(){
        System.out.println("swim");
    }
}

class mammal extends animal{
    int leg;
}

class dog extends mammal{
    int  bread;

}