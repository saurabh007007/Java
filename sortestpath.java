import java.util.*;
public class sortestpath {
    public static float sp(String sa){
        int  x=0, y=0;
        for(int i=0;i<sa.length();i++){
            if(sa.charAt(i)=='E'){
                x++;
            }else if(sa.charAt(i)=='W'){
                x--;
            }else if(sa.charAt(i)=='N'){
                y++;
            }else{
                y--;
            }
        }
        double x2=x*x;
        double y2=y*y;
        return (float)Math.sqrt(x2+y2);
        
    }
    public static void main(String arg[]){
        String sa="ENNAENANWNSNWNS";
        System.out.println(sp(sa));
    }
}
