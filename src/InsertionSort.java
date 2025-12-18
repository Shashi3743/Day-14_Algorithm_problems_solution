
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        for (int i = 1; i < a.length; i++) {
            String k = a[i];
            int j = i - 1;

            while (j >= 0 && a[j].compareTo(k) > 0) {
                a[j + 1] = a[j--];
            }
            a[j+1] = k;
        }

        System.out.println(Arrays.toString(a));
        sc.close();
    }
}
