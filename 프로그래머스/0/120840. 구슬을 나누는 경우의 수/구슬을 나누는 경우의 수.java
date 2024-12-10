// 1번째 방법
class Solution {
    public int solution(int balls, int share) {
        if(balls == share) return 1;
        
        double answer = 1;
        for (int i  = balls; i > balls - share; i--) answer *= i;
        for(int i = share; i > 0; i--) answer /= i;
        return (int)answer;
    }
}
