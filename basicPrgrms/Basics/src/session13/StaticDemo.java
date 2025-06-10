package session13;

public class StaticDemo {
    static int a=10;
    int b=20;
    static void m1(){
        System.out.println("This is m1 static method ....");
    }
    void m2(){
        System.out.println("This is m2 non static method ....");
    }
    void m3(){
        System.out.println("a= "+a);
        m1();
        System.out.println("b= "+b);
        m2();
    }
    public static void main(String[] args) {
        System.out.println("a= "+a);
        m1();
        StaticDemo sd=new StaticDemo();

        System.out.println("b= "+sd.b);
        sd.m2();
        sd.m3();
    }
}
