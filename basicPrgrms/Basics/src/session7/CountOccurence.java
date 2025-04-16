package session7;

public class CountOccurence {
    public static void main(String[] args) {
        int a[]={34,12,67,56,89,45,45,45};
        int key=45;
        int count=0;
        for(int x:a){
            if(x==key){
                count++;
            }
        }
        if(count==0)
            System.out.println("Element not found");
        else
            System.out.println("Element repeated for "+count+" times");
    }

}
