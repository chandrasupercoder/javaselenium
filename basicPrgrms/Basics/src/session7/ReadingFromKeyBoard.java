package session7;

import java.util.Scanner;

public class ReadingFromKeyBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        System.out.println("Number is "+n);

        System.out.println("enter a decimal number");
        double d=sc.nextDouble();
        System.out.println("Decimal number is "+d);

        System.out.println("Enter your city");
        String city=sc.next();
        System.out.println("City is "+city);
    }

}
