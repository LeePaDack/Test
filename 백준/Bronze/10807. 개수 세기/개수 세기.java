import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 배열의 크기 N을 입력받음
        int N = sc.nextInt();
        
        // 배열 생성
        int[] numbers = new int[N];
        
        // 배열의 요소를 입력받음
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // 찾고자 하는 숫자 v를 입력받음
        int v = sc.nextInt();
        
        // 숫자 v의 등장 횟수를 세기 위한 변수 count
        int count = 0;
        
        // 배열을 순회하면서 숫자 v의 등장 횟수를 셈
        for (int i = 0; i < N; i++) {
            if (numbers[i] == v) {
                count++;
            }
        }
        
        // 결과 출력
        System.out.println(count);
        
        // 자원 해제
        sc.close();
    }
}