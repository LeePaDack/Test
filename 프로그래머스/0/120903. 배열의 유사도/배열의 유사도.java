class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(int i=0; i<s1.length; i++) {        
            for(int j=0; j<s2.length; j++) {
                if(s1[i].equals(s2[j])) {       //s1의 i번째 문자열과 s2의 j번째 문자열이 같으면
                    answer++;                   //answer에 1을 더함
                    break;
                }
            }
        }
        return answer;
    }
}