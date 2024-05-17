import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        StringBuilder result = new StringBuilder();
        int repeat = num / 4;
        for (int i = 0; i < repeat; i++) {
            result.append("long ");
        }
        result.append("int");

        System.out.println(result.toString());
    }
}