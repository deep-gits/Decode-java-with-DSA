package Oops;

public class Basic {
    public static void main(String[] args) {
        Pen d=new Pen();
        d.setColor("blue");
        System.out.println(d.getColor());
        d.setTip(5);
        System.out.println(d.getTip());
        student c=new student();
        c.rollno=4;
        System.out.println(c.rollno);

        BankAccount myAcc = new BankAccount();
        myAcc.username="Deepaksaraswat";
        myAcc.setPassword("deeoo");

    }

}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    void setColor(String newColor){
        color=newColor;

    }
    int getTip(){
        return this.tip;
    }
    void setTip(int newTip){

        tip=newTip;
    }
}

class student{
    int rollno;
    String name;
    void setRollno(int d){
        rollno=d;

    }
}
