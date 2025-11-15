package datatypes;

public class testSting {
    public static void main(String[] args) {
        String name =" Moon";
        String a= new String("Moon");
        String b=new String("Moon");
        String c="Moon";
        String d="Moon";
        System.out.println(name==a);
        System.out.println(a==b);
        System.out.println(c==d);

        String name1="AKSHAT";
        String name2="Akshat";
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));
    }
}
