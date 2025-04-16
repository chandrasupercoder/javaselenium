package session6;

public class EvenOddSum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int eSum=0,oSum=0,eCount=0,oCount=0;
        for(int x:a)
            if(x%2==0){
                eSum+=x;
                eCount++;
            }
            else{
                oSum+=x;
                oCount++;
            }
        System.out.println("Even Sum: "+eSum+" Odd Sum: "+oSum+" Even Number Count: "+eCount+" Odd Number Count: "+oCount);
    }
   


}
