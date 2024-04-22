public class Abstractss {
    public static void main(String arg[]){
        // Horse h =new Horse();
        // h.walk();
        // h.eat();
        // Chicken c= new Chicken();
        // c.walk();
        // c.eat();
        // System.out.println(c.color);
        Mustang m =new Mustang();
        
    }
}
abstract class Animal{
    //non abstractr method
    void eat(){
        System.out.println("eats");
    }
    // abstract methopd
    abstract void walk();

    //constrcuctor
    String color;
    Animal(){
        color="brown";
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Animal constructor");
    }
    void walk(){
        System.out.println("Walks on four legs");
    }
    void changecolor(){
        color="grren";
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("color");
    }
}
class Chicken extends Animal{
    void changecolor(){
        color="red";
    }
    void walk(){
        System.out.println("Walk on 2 lesg");
    }
}