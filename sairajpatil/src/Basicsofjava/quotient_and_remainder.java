package Basicsofjava;
import java.util.Scanner;
public class quotient_and_remainder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter dividend :");
        int a= sc.nextInt();
        System.out.println("enter divisor");
        int b = sc.nextInt();
        int p= a/b;
        int q= a-(b*p);
        System.out.println("remiender when"+a+"is divided by"+b+"is"+q);




    }






   }




