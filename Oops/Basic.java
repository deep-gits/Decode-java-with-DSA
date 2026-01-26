package Oops;

public class Basic {
    public static void main(String[] args) {
        Pen d=new Pen();
        d.setTip(5);
        System.out.println(d.tip);
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
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;

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
