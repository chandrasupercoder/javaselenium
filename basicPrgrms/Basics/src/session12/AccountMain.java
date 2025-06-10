package session12;

public class AccountMain {
    public static void main(String[] args) {
        Account a=new Account();
        a.setAccno(101);
        System.out.println("Account number: "+a.getAccno());
        a.setName("Raja");
        System.out.println("Name of Customer: "+a.getName());
        a.setAmount(200.56);
        System.out.println("Account Balance: "+a.getAmount());        
    }
}
