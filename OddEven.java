import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter any number: ");
            int a =sc.nextInt();
            if(a%2==0)
                System.out.println("Even number");
            else    
                System.err.println("Odd Number");
        }
    }
}
