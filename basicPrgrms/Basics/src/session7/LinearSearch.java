package session7;

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={34,12,67,56,89,45};
        int key=36;
        boolean flag=false;
        for(int x:a){
            if(x==key){
                System.err.println("Found the element");
                flag=true;
                break;
            }
        }
        if(flag==false)
            System.err.println("Element not found");
    }

}
