package session8;

import java.util.Arrays;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str="   welcome  ";
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(str);

        str="I am a good boy";
        System.out.println(str.contains("boy"));

        String s1="I am all good";
        System.out.println(s1.replace('a', 'x'));
        System.err.println(s1);
        System.out.println(s1.replace("good", "bad"));

        System.out.println(s1.substring(5,7));

        String s2="aabbbccccdd";
        System.out.println(s2.replace('b','r').replace('c','s'));

        System.out.println(Arrays.toString(s1.split(" ")));

        String amount="$12,34,56";
        System.out.println(amount.replace("$", "").replace(",",""));

        String email="adhi.chandu@xyz.com";
        System.out.println(Arrays.toString(Arrays.toString(email.split("@")).split("\\.")).replace("[", "").replace("]", ""));
        
        String arr[]=email.replace('@', ',').replace('.', ',').split(",");
        for(String x:arr)
            System.out.println(x);

    }
}
