import java.util.*;

public class Permutations {

    static void rec(String s, String ans, List<String> r) {
        if (s.isEmpty()) { r.add(ans); return; }
        for (int i = 0; i < s.length(); i++)
            rec(s.substring(0,i)+s.substring(i+1), ans+s.charAt(i), r);
    }

    static List<String> recursive(String s) {
        List<String> r = new ArrayList<>();
        rec(s,"",r);
        return r;
    }

    static List<String> iterative(String s) {
        List<String> r = new ArrayList<>();
        r.add("");
        for (char c : s.toCharArray()) {
            List<String> t = new ArrayList<>();
            for (String x : r)
                for (int i = 0; i <= x.length(); i++)
                    t.add(x.substring(0,i)+c+x.substring(i));
            r = t;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(recursive(s).equals(iterative(s)));
//        System.out.println(iterative(s));
//        System.out.println("----------------------------------------------------------------------");
//        System.out.println(recursive(s));
    }
}
