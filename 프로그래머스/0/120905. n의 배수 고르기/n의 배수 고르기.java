import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                temp.add(numlist[i]);
            }
        }
        
        int[] result = new int[temp.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
        }
        
        return result;
    }
}