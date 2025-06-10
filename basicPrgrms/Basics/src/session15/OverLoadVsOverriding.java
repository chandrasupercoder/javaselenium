package session15;

class ABC{
    void m1(int a){
        System.out.println("a= "+a);
    }
    void m2(int b){
        System.out.println("b= "+b);
    }
}
class XYZ extends ABC{
    void m1(int a){
        System.out.println("a*a= "+a*a);
    }
    void m1(float b){
        System.out.println("b= "+b);
    }
}

public class OverLoadVsOverriding {
    public static void main(String[] args) {
        ABC abc=new ABC();
        XYZ xyz=new XYZ();
        abc.m1(6);
        abc.m2(8);
        xyz.m1(9);
        xyz.m1(3.5f);
    }
}
