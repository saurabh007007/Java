import java.util.*;

public class bit {
    public static void oddeven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even number ");

        }else{
            System.out.println("ODD NUMBERS");
        }
    }
    public static void main(String[] args) {
        int n=6;
        oddeven(n);
    }
    
}
