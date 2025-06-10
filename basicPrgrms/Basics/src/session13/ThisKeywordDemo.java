package session13;

public class ThisKeywordDemo {
    int x,y;
    ThisKeywordDemo(int x, int y){
            this.x=x;
            this.y=y;
    }
    void display(){
        System.out.println("x= "+x+" y= "+y);
    }
    public static void main(String[] args) {
        ThisKeywordDemo th=new ThisKeywordDemo(100,200);
        th.display();
    }
}
