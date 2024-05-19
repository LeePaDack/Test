import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 개수 T를 입력받음
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt(); // A를 입력받음
            int B = sc.nextInt(); // B를 입력받음
            System.out.println("Case #" + i + ": " + (A + B)); // "Case #i: A+B" 형식으로 출력
        }

        sc.close();
    }
}