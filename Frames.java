import java.util.Scanner;
public class Frames{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m,n,x,r;
        m=sc.nextInt();
        n=sc.nextInt();
        x=sc.nextInt();
        r=(m+n)*x*2;
        System.out.println(r);
        sc.close();
    }
}