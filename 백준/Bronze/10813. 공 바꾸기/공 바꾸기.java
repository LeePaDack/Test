import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N과 M 입력받기
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 초기 바구니 상태 배열 생성
        int[] baskets = new int[N + 1];  // 1번부터 N번 바구니이므로 크기를 N+1로 설정

        // 초기 상태로 1번부터 N번 바구니에 각 번호의 공을 넣기
        for (int i = 1; i <= N; i++) {
            baskets[i] = i;
        }

        // M번의 공 교환 과정
        for (int i = 0; i < M; i++) {
            int basket1 = sc.nextInt();
            int basket2 = sc.nextInt();

            // 두 바구니의 공을 교환
            int temp = baskets[basket1];
            baskets[basket1] = baskets[basket2];
            baskets[basket2] = temp;
        }

        // 최종 바구니 상태 출력
        for (int i = 1; i <= N; i++) {
            System.out.print(baskets[i] + " ");
        }

        sc.close();
    }
}