package session9;

public class StringBufferAndBuilder {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("welcome");
        StringBuilder sb1= new StringBuilder("sample");
        System.out.println(sb.reverse());
        System.out.println(sb1.reverse());

        //immutable
        String s="welcome";
        System.out.println("Before concat: "+s);
        s.concat(" to Java");
        System.out.println("After concat: "+s);

        //mutable
        StringBuffer sbf=new StringBuffer("welcome");
        sbf.append(" to Java");
        System.out.println(sbf);

        StringBuilder sbr=new StringBuilder("welcome");
        sbr.append(" to Java");
        System.out.println(sbr);

        String s1="welcome";
        String s2="welcome";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3="sample";
        String s4=new String("sample");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        String s5=new String("abc");
        String s6=new String("abc");

        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));

    }

}
