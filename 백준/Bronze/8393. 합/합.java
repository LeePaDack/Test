import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        sc.close();
        
        int sum = 0;
        
        for(int i = 1; i <= A; i++){
            sum += i;
        }
        
        System.out.println(sum);
    }
}