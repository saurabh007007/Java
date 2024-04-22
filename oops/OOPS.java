public class OOPS{
public static void main(String args[]) {
    Pen p1=new Pen();
    p1.setcolore("green");
    System.out.println(p1.color);
    p1.setcolore("Null");
    p1.color="Yellow";
    System.out.println(p1.color);
    BankAccount myAcc= new BankAccount();
    myAcc.username="Saurabh yadav";
    myAcc.setpass("sauerabh");

}
}

class BankAccount{
    public String username;
    private String password;
    public void setpass(String pwd){
        password =pwd;
    }
}
class Pen{
    String color;
    void setcolore(String newcolor){
        this.color=newcolor;
    }
    String getcolor(){
        return this.color;
    }

}