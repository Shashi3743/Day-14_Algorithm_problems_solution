import java.util.*;

public class problem10 {
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        Scanner sc=new Scanner(System.in);
        int l=0,h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            System.out.println("Is your number <= "+m+" ? (true/false)");
            if(sc.nextBoolean()) h=m-1;
            else l=m+1;
        }
        System.out.println("Your number is "+l);
    }
}
