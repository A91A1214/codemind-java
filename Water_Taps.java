import java.util.Scanner;
 public class WaterTaps {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y,a;
        //float a;
        x=s.nextInt();
        y=s.nextInt();
        a=((x*y)/(x+y));
        System.out.println(a);
        s.close();
    }
 }