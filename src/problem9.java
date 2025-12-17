import java.util.*;

public class problem9 {

    static <T extends Comparable<T>> void sort(T[] a){
        for(int i=1;i<a.length;i++){
            T k=a[i]; int j=i-1;
            while(j>=0 && a[j].compareTo(k)>0)
                a[j+1]=a[j--];
            a[j+1]=k;
        }
    }

    static <T> boolean search(T[] a, T k){
        for(T x:a) if(x.equals(k)) return true;
        return false;
    }

    public static void main(String[] args){
        Integer[] a={3,1,4,2};
        sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(search(a,3));
    }
}
