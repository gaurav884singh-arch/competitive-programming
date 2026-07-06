import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        
        char firstChar = input.charAt(0);
        char capitalizedFirstChar = Character.toUpperCase(firstChar);
        String result = capitalizedFirstChar + input.substring(1);
        
        System.out.println(result);
        scanner.close();
    }
}