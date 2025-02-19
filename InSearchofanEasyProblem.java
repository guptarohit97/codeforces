import java.util.Scanner;

public class InSearchofanEasyProblem {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        int cnt=0;
        for(int i=0;i<n;i++)
        {

            int a=s.nextInt();
            if(a==1)
            {
                cnt++;
            }
        }
        if(cnt==0)
        {
            System.out.println("EASY");
        }
        else{
            System.out.println("HARD");
        }
    }
}
