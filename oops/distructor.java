public class distructor {
    public static void main(String arg[]){
        // Fish shark=new Fish();
        // shark.eat();
        Dog d =new Dog();

        s.eat();

   }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eatsa");
    }
    void brea(){
        System.out.println("breatjs");
    }

    
}
class Mammles extends Animal{
    int legs;
}

class Dog extends Mammles{
    String bread;
}
class Fish extends Animal{
    void nam(){
        System.out.print("Whaeel");
    }
}
class Bird extends Animal{
    void nam(){
        System.out.print("Whaeel");
    }
}