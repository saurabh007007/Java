public class method {
    public static void main(String arg[]){
        Calculator su= new Calculator();
        System.out.println(su.sum(2,6));
        System.out.println(su.sum((float)2.6,(float)6.8));
        System.out.println(su.sum(2,6,8));
        Dog d=new Dog();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eat grass");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("eat anythink");
    }
}

class Calculator{
   int  sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a ,int b , int c){
        return a+b+c;
    }
}