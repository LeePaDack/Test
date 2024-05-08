import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dice = new int[3];

        // 주사위 값 입력 받기
        for (int i = 0; i < 3; i++) {
            dice[i] = scanner.nextInt();
        }

        // 모두 같은 경우
        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            System.out.println(10000 + dice[0] * 1000);
        }
        // 두 개만 같은 경우
        else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[0] == dice[2]) {
            int sameValue = (dice[0] == dice[1]) ? dice[0] : dice[2];
            System.out.println(1000 + sameValue * 100);
        }
        // 모두 다른 경우
        else {
            int max = Math.max(Math.max(dice[0], dice[1]), dice[2]);
            System.out.println(max * 100);
        }

        scanner.close();
    }
}