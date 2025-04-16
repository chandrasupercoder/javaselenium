package session6;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int a[][]=new int[3][2];
        a[0][0]=100;
        a[0][1]=200;
        a[1][0]=300;
        a[1][1]=400;
        a[2][0]=500;
        a[2][1]=600;
        for(int x[]:a)
            for(int y:x)
                System.out.println(y);
        
        int b[][]={{100,200},{300,400},{500,600}};
        for(int i=0;i<b.length;i++)
            for(int j=0;j<b[i].length;j++)
                System.out.println(b[i][j]);

    }

}
