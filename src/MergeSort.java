
import java.util.*;

public class MergeSort {

    static void sort(String[] a, int l, int r) {
        if (r-l<=1) return;
        int m=(l+r)/2;
        sort(a,l,m);
        sort(a,m,r);
        merge(a,l,m,r);
    }

    static void merge(String[] a,int l,int m,int r){
        String[] t=new String[r-l];
        int i=l,j=m,k=0;
        while(i<m&&j<r) {
            t[k++] = a[i].compareTo(a[j]) <= 0 ? a[i++] : a[j++];
        }
        while(i<m)t[k++]=a[i++];
        while(j<r)t[k++]=a[j++];
        System.arraycopy(t,0,a,l,t.length);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] a=sc.nextLine().split(" ");
        sort(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }
}
