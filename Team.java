// 231A Team 
import java.util.*;
public class Team
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int count = 0;
        while(t-->0)
        {
            int petya = s.nextInt();
            int vasya = s.nextInt();
            int tonya = s.nextInt();
            if(petya+vasya+tonya >=2)
                ++count;
        }
        System.out.println(count);
    }
}