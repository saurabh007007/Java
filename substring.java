public class substring{
    public static void sub_string(String sa,int si,int ei){
        String ca="";
        for(int i=si;i<ei;i++){
            
            ca+=sa.charAt(i);
        }
        System.out.println(ca);

    }

    public static void main(String arg[]){
        String sa="Let us check the string";
        sub_string(sa,4,10);
    }
}
