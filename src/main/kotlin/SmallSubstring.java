import java.util.ArrayList;
import java.util.List;

public class SmallSubstring {
    public int solution(String t, String p) {

        int length = p.length();
        List<Double> numbers = new ArrayList<>();
        double baseNumber = Double.parseDouble(p);
        for(int i = 0; i <= t.length() - length; i++) {
            numbers.add(Double.parseDouble(t.substring(i, i + length)));
        }

        int answer = 0;
        for (Double number : numbers) {
            if (baseNumber >= number) {
                answer++;
            }
        }

        return answer;
    }
}
