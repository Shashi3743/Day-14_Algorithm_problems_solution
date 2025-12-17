
import java.io.*;
import java.util.*;

public class problem2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] words = new BufferedReader(new FileReader("src/words.txt"))
                .readLine().split(",");
        Arrays.sort(words);
        String key = sc.next();
        System.out.println(Arrays.binarySearch(words, key) >= 0);
    }
}
