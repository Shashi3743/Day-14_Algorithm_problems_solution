
import java.util.*;

public class problem8 {

    static boolean prime(int n){
        if(n<2)return false;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }

    static boolean pal(int n){
        int r=0,t=n;
        while(t>0){r=r*10+t%10;t/=10;}
        return r==n;
    }

    static boolean ana(int a,int b){
        char[] x=String.valueOf(a).toCharArray();
        char[] y=String.valueOf(b).toCharArray();
        Arrays.sort(x); Arrays.sort(y);
        return Arrays.equals(x,y);
    }

    public static void main(String[] args){
        List<Integer> p=new ArrayList<>();
        for(int i=0;i<=1000;i++) if(prime(i)) p.add(i);
        for(int i=0;i<p.size();i++) {
            for (int j = i + 1; j < p.size(); j++) {
                if (ana(p.get(i), p.get(j)) && pal(p.get(i))) {
                    System.out.println(p.get(i) + " " + p.get(j));
                }
            }
        }
    }
}
