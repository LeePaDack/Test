import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader와 BufferedWriter를 사용하여 입출력 최적화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 입력을 한 줄 읽어서 정수로 변환
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // 한 줄 입력을 받아서 공백을 기준으로 분리
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            // 결과를 BufferedWriter에 작성
            bw.write((A + B) + "\n");
        }
        
        // 모든 출력을 한 번에 flush
        bw.flush();
        
        // BufferedReader와 BufferedWriter를 닫기
        br.close();
        bw.close();
    }
}