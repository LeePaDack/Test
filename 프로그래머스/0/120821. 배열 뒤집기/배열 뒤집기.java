import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        // 새로운 배열을 생성하여 주어진 배열의 길이만큼 할당합니다.
        int[] reversedArray = new int[num_list.length];
        
        // 주어진 배열의 원소를 거꾸로 뒤집어서 새로운 배열에 저장합니다.
        for (int i = 0; i < num_list.length; i++) {
            reversedArray[i] = num_list[num_list.length - 1 - i];
        }
        
        // 거꾸로 뒤집힌 배열을 반환합니다.
        return reversedArray;
    }
}