import java.util.ArrayList;
import java.util.List;

public class LaserBeams {

    public int numberOfBeams(String[] bank) {

        List<Integer> beams = new ArrayList<>();
        for (String str : bank) {
            int beamCount = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    beamCount++;
                }
            }
            if (beamCount != 0) {
                beams.add(beamCount);
            }
        }

        int result = 0;
        for (int i = 0; i < beams.size() - 1; i++) {
            result += beams.get(i) * beams.get(i + 1);
        }

        return result;
    }
}
