import java.util.Scanner;
 public class Hypotenuse{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y;
        float a;
        x=s.nextInt();
        y=s.nextInt();
        //z=s.nextInt();
        a=(float) Math.sqrt((x*x)+(y*y));
        System.out.printf("%.2f",a);
        s.close();
    }
 }