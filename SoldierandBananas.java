import java.util.Scanner;

public class SoldierandBananas {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int p=s.nextInt();
        int t=s.nextInt();
        int b=s.nextInt();

        int sum=0;
        for(int i=1;i<=b;i++)
        {
            sum+=p*i;
        }
        if(sum>t){
            System.out.println(Math.abs(sum-t));
        }
        else{
            System.out.println(0);
        }
    }
    
}
