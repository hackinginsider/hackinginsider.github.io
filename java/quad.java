package java;

import java.util.Scanner;
class quad{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        int d = (b*b)-(4*a*c);
        if(d>0){
            double r1 = (-b+Math.sqrt(d))/(2*a);
            double r2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("The roots are "+r1+" and "+r2);
        }
        else if(d==0){
            double r1 = (-b)/(2*a);
            System.out.println("The roots are "+r1);
        }
        else{
            System.out.println("The roots are imaginary");
        }
    }
}