import java.util.Scanner;
 
public class AntonAndDanik {
    static Scanner s = new Scanner(System.in);
  
    public static void main(String[] args) {
        
        int n=s.nextInt();
        s.nextLine();
        String input = s.nextLine();
        
        int a=0,d=0;
        for( char x : input.toCharArray()){
            if(x=='D')
                d++;
            else
                a++;
        }
        if(a>d)
            System.out.println("Anton");
        else if(d>a)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    } 
}