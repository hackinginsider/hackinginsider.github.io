package java;
import java.util.Scanner;
public class niven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int num = sc.nextInt();
        // sample input 18 so 1+8 = 9 and 18 is divisible by 9
        int n1 = num%10; 
        int n2 = num / 10 % 10;
        int sum = n1+n2;
        if(num%sum==0){
            System.out.println("The number is niven number");
        }
        else{
            System.out.println("The number is not niven number");
        }
    }
}
