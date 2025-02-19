import java.util.Scanner;

public class VanyaandFence {

    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        int h=s.nextInt();
        int ans =n;
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            if(a>h){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
