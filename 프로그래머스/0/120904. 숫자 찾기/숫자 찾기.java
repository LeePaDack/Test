class Solution {
    public int solution(int num, int k) {
        int answer = -1; // 초기값을 -1로 설정

        String str = Integer.toString(num);
        String[] arr = str.split("");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(Integer.toString(k))) {
                answer = i + 1; // 정답을 찾았을 때 answer 값을 업데이트하고 루프를 빠져나감
                break;
            }
        }

        return answer;
    }
}