package methods;

public class variableargument {
    public static void main(String[] args) {
        System.out.println(sumof(1,2,3,4,5,6,7,8,9));
    }
    public static int sumof(int... a){
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }
}
