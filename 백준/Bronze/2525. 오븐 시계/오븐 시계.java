import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Hr = sc.nextInt();
        int Min = sc.nextInt();
        int CT = sc.nextInt(); // 스캐너로 시, 분, 요리시간 을 받음
        
        Min += CT;  // 분 = 분 + 요리시간 
        Hr += Min / 60; // 시간 = 시간 + 분 / 60 (60분이 넘으면 시간에 +1 을 해줌)
        Min %= 60; // %= 는 Min = Min % 60 을 의미함 (60분이 안넘는 나머지를 분에 저장)
        Hr %= 24; // 시간 = 시간 % 24  (24시간이 넘어가면 0시 부터 체크하기 위해)
        
        System.out.println(Hr + " " + Min);
        
        sc.close();
    }
}