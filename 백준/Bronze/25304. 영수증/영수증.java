import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 영수증의 총 금액 입력
        int receiptTotal = sc.nextInt();

        // 물건의 종류 수 입력
        int itemCount = sc.nextInt();

        // 변수를 초기화하여 계산된 총 금액을 저장하기 위해 사용
        int calculTotal = 0; 

        // 각 물건의 가격과 개수 입력
        for (int i = 0; i < itemCount; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            calculTotal += price * quantity;
        }

        // 영수증의 총 금액과 계산된 총 금액 비교
        if (calculTotal == receiptTotal) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
