import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hasNext()를 이용하여 입력이 있는 동안 계속 처리
        while (sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }

        sc.close();
    }
}