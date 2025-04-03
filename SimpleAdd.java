
import java.util.Scanner;

public class SimpleAdd {
    public static void main(String[] args) {
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number a:");
            a=sc.nextInt();
            System.out.println("Enter number b:");
            b=sc.nextInt();
        }
        int c=a+b;
        System.out.println("Sum is: "+ c);  
    }
}
