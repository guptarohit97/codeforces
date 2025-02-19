import java.util.Scanner;

public class DivisibilityProblem {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int t=s.nextInt();
        int a,b,d;
        for(int i=0;i<t;i++)
        {
            a=s.nextInt();
            b=s.nextInt();
            d=a%b;
            if(d==0){
                System.out.println(0);
                }   
            else{
                System.out.println(b-d);
            }
        }
    }
    
}
