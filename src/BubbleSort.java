
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int n=a.length;
        for (int i=0;i<n;i++)
            for (int j=0;j<n-i-1;j++)
                if (a[j] > a[j+1]) {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
        System.out.println(Arrays.toString(a));
    }
}
