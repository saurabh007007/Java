import java.util.*;
public class bill{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pen:");
        int p=sc.nextInt();
        System.out.println("Enter the price of pencil:");
        int pe=sc.nextInt();
        System.out.println("Enter the price of eraser:");
        int er=sc.nextInt();
        System.out.println("Bill");
        System.out.print(p+pe+er);
    }
}