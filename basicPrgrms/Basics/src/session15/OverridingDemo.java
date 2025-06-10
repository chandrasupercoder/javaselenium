package session15;

class Bank{
    double roi(){
        return 1.0;
    }
}
class UB extends Bank{
    double roi(){
        return 10.5;
    }
}

class SBI extends Bank{
    double roi(){
        return 12.5;
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Bank b=new Bank();
        System.out.println(b.roi());
        UB ub =new UB();
        System.out.println(ub.roi());
        SBI sbi=new SBI();
        System.out.println(sbi.roi());
    }
}
