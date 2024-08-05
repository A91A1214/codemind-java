import java.util.Scanner;
public class pr2 {
    public static void main(String[] args) {
        Scanner mv=new Scanner(System.in);
        int a,b,c;
        float s,ar;
        a=mv.nextInt();
        b=mv.nextInt();
        c=mv.nextInt();
        //s=mv.nextInt();
        s=(a+b+c)/2;
        ar=(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print("Area:"+ar);
        mv.close();

    }
}
