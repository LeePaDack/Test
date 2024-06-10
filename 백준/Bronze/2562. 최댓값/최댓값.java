import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];
        
        // 배열에 9개의 숫자 입력
        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int max = numbers[0]; // 최댓값 초기화
        int index = 0; // 최댓값의 인덱스 초기화
        
        // 최댓값과 그 인덱스 찾기
        for (int i = 1; i < 9; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }
        
        // 최댓값과 그 인덱스 출력 (인덱스는 1부터 시작)
        System.out.println(max);
        System.out.println(index + 1);
    }
}