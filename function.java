import java.util.*;
public class function{
    public static int F(int a, int b){
        return (a+b);
    }
public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(F(a,b));
}
}