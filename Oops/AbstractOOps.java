package Oops;

public class AbstractOOps {
    public static void main(String[] args) {
        horse h=new horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        chiken c= new chiken();
        c.eat();
        c.walk();

        mustang myhorse=new mustang();
    }
}

abstract class animaals{
    String color;
    animaals(){
        System.out.println("animal constructer called");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class horse extends animaals{
    horse(){
        System.out.println("horse constructer called");
    }
    void changecolor(){
        color="daek brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("m contructer called");
    }
}
class chiken extends animaals{
    void changecolor(){
        color="yellow";
    }
    void walk(){
        System.out.println(" walks on four leg");
    }
}