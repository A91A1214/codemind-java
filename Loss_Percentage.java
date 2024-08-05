import java.util.Scanner;
public class Loss_Percentage{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m,n,x;
        float r;
        m=sc.nextInt();
        n=sc.nextInt();
        x=m-n;
        r=(float) (x*100)/m;
        System.out.format("%.2f",r);
        sc.close();
    }
}