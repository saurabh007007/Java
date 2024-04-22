public class builder {
    public static String builder_type(String str){
        StringBuilder sc= new StringBuilder("");
        for(int i=1;i<str.length();i++){
            sc.append(str.charAt(i));
        }
        return sc.toString();
    }
    public static void main(String arg[]){
        String sc="Hello";
        System.out.println(builder_type(sc));

    }
}
