class Solution {
    public int[] solution(int n) {
        // 삼각형을 표현할 2 차원 배열과 채워넣을 숫자 선언
        int[][] triangle = new int[n][n];
        int v = 1; // v 는 채워넣을 숫자로 숫자를 triangle 에 기록할 때마다 1 씩 증가
        int x = 0; // 숫자 초기화 (0,0) 을 위해
        int y = 0;
        
        while (true) {
            // 아래로 이동하기
            while (true) {
                triangle[y][x] = v++; // 2 차원 배열은 y,x 로 생각해야함
                if (y + 1 == n || triangle[y + 1][x] != 0)
                    break;
                y += 1; // 아래로 진행하는 것은 y 값의 증가 때문이므로
            }
            // 오른쪽으로 이동할 수 있는 경우 반복문 탈출하도록 작성
            // 오른쪽으로 이동할 수 있을 때만 진행
            if (x + 1 == n || triangle[y][x + 1] != 0)
                break;
            x += 1;
            
            // 오른쪽으로 이동하기
            while(true) {
                triangle[y][x] = v++;
                if(x + 1 == n || triangle[y][x + 1] != 0)
                    break;
                x += 1;
            }
            if(triangle[y - 1][x - 1] != 0) 
                break;
            x -= 1;
            y -= 1;
            
            // 왼쪽으로 이동하기
            while(true) {
                triangle[y][x] = v++;
                if(triangle[y - 1][x - 1] != 0)
                    break;
                x -= 1;
                y -= 1;
            }
            if(y + 1 == n || triangle[y + 1][x] != 0)
                break;
            y += 1;
        }
        // 채운 숫자들을 1 차원 배열로 구성하여 반환
        // v 변수는 채워 넣은 마지막 숫자 + 1 이 있으므로  v - 1
        int[] result = new int[v - 1];
        
        // 2 차원 배열에서는 삼각형이 왼쪽으로 몰려 있는 직각 삼각형 모양으로 들어있다는 것을
        // 이용하여 이중 반복문으로 1 차원 배열에 숫자를 넣어줌
        int index = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                result[index++] = triangle[i][j];
            }
        }
        return result;
    }
}