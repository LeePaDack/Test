import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] picture, int k) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < picture.length; i++) {
                String[] enlarge = picture[i].split("");
                String str = "";
                for (int j = 0; j < enlarge.length; j++) {
                    str += enlarge[j].repeat(k);
                }
                for (int j = 0; j < k; j++) {
                    list.add(str);
                }
            }
            return list.toArray(new String[list.size()]);
        }   
}