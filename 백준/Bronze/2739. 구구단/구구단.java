import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        
        for (int i = 1; i <= 9; i++) {
            System.out.println(Num + " * " + i + " = " + (Num * i));
        }
        
        sc.close();
    }
}