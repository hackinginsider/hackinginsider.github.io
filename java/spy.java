package java;
import java.util.Scanner;
public class spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int number = sc.nextInt();
        int n1, n2, n3 ,n4, sum, multiply;
        n1 = number % 10;
        n2 = number / 10 % 10;
        n3 = number / 100 % 10;
        n4 = number / 1000 % 10;
        sum = n1 + n2 + n3 + n4;
        multiply = n1 * n2 * n3 * n4;
        if(sum == multiply){
            System.out.println("The number is spy number");
        }
        else{
            System.out.println("The number is not spy number");
        }
    }
}