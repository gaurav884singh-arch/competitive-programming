import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] arr = s.replace("+", "").toCharArray();
        Arrays.sort(arr);

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            ans.append(arr[i]);
            if (i != arr.length - 1) {
                ans.append("+");
            }
        }

        System.out.println(ans);
    }
}