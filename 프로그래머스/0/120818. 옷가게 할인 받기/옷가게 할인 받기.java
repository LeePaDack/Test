class Solution {
    public int solution(int price) {
        int answer = 0;
      if (price >= 500000) {
            price = (int) (price * 0.8); 
            answer = price;
        } else if (price >= 300000) {
            price = (int) (price * 0.9); 
            answer = price;
        } else if (price >= 100000) {
            price = (int) (price * 0.95); 
            answer = price;
        } else {
            answer = price;
        }
        return answer;
    }
}