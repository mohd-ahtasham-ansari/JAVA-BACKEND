package methods;

public class string_method {
    public static void main(String[] args) {
        String s= "salmamkhan";
        String y=toUpper(s);
        System.out.println(y);
    }
    public static String toUpper(String s){
        return s.toUpperCase();
    }
}
