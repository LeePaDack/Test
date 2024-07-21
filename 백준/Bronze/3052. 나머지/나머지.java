import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> remainders = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            int remainder = number % 42;
            remainders.add(remainder);
        }
  
        System.out.println(remainders.size());
    }
}