package session3;

public class ConditionalOperator {
    public static void main(String[] args) {
        int a=10,b=20;
        int var=(a<b)?a:b;
        System.out.println(var);

        int age=30;
        String vote= (age>18)?"eligible":"Not eligible";
        System.out.println(vote);
    }

}
