import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] submitted = new boolean[31]; // 0번 인덱스는 사용하지 않음

        // 입력된 학생 번호에 해당하는 인덱스를 true로 설정
        for (int i = 0; i < 28; i++) {
            int studentNumber = sc.nextInt();
            submitted[studentNumber] = true;
        }

        // 제출하지 않은 학생 번호를 출력
        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}