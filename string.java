import java.util.*;
public class string {
    public static void char_at(String sa){
        int str=sa.length();
        for(int i=0;i<str;i++){
            System.out.println(sa.charAt(i));
        }
    }
    public static void main(String arg[]){
        String sa="Saurabh yadav ";
        char_at(sa);

    }
}
