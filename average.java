import java.util.*;
public class average{
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter three no to calculate average:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float f=(float)(a+b+c)/3;
        System.out.println(f);

    }
}