package session5;
public class Breakstmt {
    public static void main(String [] args){
        for (int i = 0; i < 10; i++) {
            if(i==5)
                break;
            System.out.println("for loop: "+i);
        }

        int i=0;
        while(i<10){
            i++;
            if(i==5){
                break;
            }
            System.out.println("while loop: "+i);
        }
        i=0;
        do{
            i++;
            if(i==5){
                break;
            }
            System.out.println("Do while loop: "+i);
        }while(i<10);

    }
    }
