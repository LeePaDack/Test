class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase(); // myString 을 다 소문자로 바꾸기
        myString = myString.replaceAll("a", "A"); // a 를 A 로 바꾸기
        return myString;
    }
}