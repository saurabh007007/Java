import java.util.*;
public class star{
    public static void star(int n){
        for (int i =1 ; i<=n ; i++)
        {
            System.out.print("*");
            
        }
    }

   public static void main(String arg[]){
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();
    star(n);
   } 
}
