package methods;

public class method {
    public static void main(String[] args) {
        int [] arr= {1,43,54,12,34,45,4};
        sumofarray(arr);

        String name = ToUpper("akshat");
        System.out.println(name);
        int a= Sum(4,5);
        int b= Sum(10,10);
        System.out.println(Sum(a,b));
    }
    public static void sumofarray(int[] arr){
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        System.out.println(sum);
    }
    private static String ToUpper(String s){
        return s.trim().toUpperCase();
    }
    private static int Sum(int a,int b){
        return a+b;
    }
}

