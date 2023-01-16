import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TheNearestLetter {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer idx = map.get(c);
            idx = Objects.isNull(idx) ? -1 : i - idx;
            map.put(c, i);
            answer[i] = idx;
        }

        return answer;
    }
}