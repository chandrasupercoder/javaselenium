package session6;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;
        System.out.println(a[1]);

        int b[]={1,2,3,4,5};
        System.out.println(b[4]);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
        for(int x:b) //for each loop
            System.out.println(x);

    }

}
