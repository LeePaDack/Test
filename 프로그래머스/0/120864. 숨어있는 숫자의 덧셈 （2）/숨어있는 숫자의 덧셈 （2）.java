class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        // 매개변수의 소문자와 대문자를 제외한다.
        String[] check = my_string.split("[a-zA-Z]");

        // 공백이 들어가있는 값을 제외
        for (int i = 0; i < check.length; i++) {
            if(!check[i].equals("")){
                answer += Integer.parseInt(check[i]);
            }
        }
        return answer;
    }
}