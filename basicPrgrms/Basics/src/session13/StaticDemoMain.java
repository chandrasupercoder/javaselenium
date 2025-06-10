package session13;
public class StaticDemoMain{

    public static void main(String[] args){
        StaticDemo sd=new StaticDemo();
        System.out.println("a= "+StaticDemo.a);
        StaticDemo.m1();

        System.out.println("b= "+sd.b);
        sd.m2();
        sd.m3();
    }
}