package Recursion;
import java.util.*;
public class sumOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("!~~~~~~~! FIND THE SUM OF NATURAL NUMBERS UP TO THE GIVEN NUMBER !~~~~~~!");
        System.out.println("enter the number  :");
        int n =sc.nextInt();

        System.out.println(sum(n));
    }
    public static int sum(int n){
        if (n==0) return 0;
        return n +sum(n-1);
    }
}
