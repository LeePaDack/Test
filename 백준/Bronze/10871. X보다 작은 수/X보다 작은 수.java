import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        // 결과를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();

        // 숫자 배열 입력 받기
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            if (number < X) {
                result.append(number).append(" ");
            }
        }

        // 결과 출력
        System.out.println(result.toString().trim());
    }
}