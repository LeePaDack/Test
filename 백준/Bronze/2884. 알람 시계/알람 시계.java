import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		
		int hr = sc.nextInt(); // 시
		int Min = sc.nextInt(); // 분
		
		if(Min < 45) {
			hr--;		// 시(hour) 1 감소
			Min= 60 - (45 - Min); 	// 분(min) 감소
			if(hr < 0) {
				hr = 23;
			}
			System.out.println(hr + " " + Min);
		}
		else {
			System.out.println(hr + " " + (Min - 45));
		}
	}
}