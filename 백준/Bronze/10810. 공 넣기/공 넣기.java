import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N: 바구니의 개수, M: 공을 넣는 횟수
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 바구니 배열 생성, 초기값은 0
        int[] baskets = new int[N];
        
        // M번 공을 넣는 작업 수행
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt() - 1; // 시작 인덱스
            int end = sc.nextInt() - 1; // 끝 인덱스
            int ball = sc.nextInt(); // 넣을 공 번호
            
            // 해당 범위의 바구니에 공을 넣음
            for (int j = start; j <= end; j++) {
                baskets[j] = ball;
            }
        }
        
        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}



/*

입력 처리:

Scanner 객체를 사용하여 입력을 받습니다.
N은 바구니의 개수, M은 공을 넣는 횟수를 나타냅니다.
바구니 배열 생성:

int[] baskets = new int[N];를 사용하여 N개의 바구니를 저장할 배열을 생성합니다.
초기값은 자동으로 0으로 설정됩니다.
M번 반복하여 공을 넣는 작업 수행:

start와 end 인덱스를 입력받고, 해당 범위에 공 번호 ball을 넣습니다.
주어진 start와 end 값은 1부터 시작하기 때문에 배열 인덱스를 맞추기 위해 1을 뺍니다.
결과 출력:

for 루프를 사용하여 배열의 모든 값을 출력합니다.

*/