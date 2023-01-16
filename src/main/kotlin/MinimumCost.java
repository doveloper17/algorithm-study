import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumCost {
    public int minimumCost(int[] cost) {


        List<Integer> costList = Arrays.stream(cost).boxed().collect(Collectors.toList());
        costList.sort(Collections.reverseOrder());
        int result = 0;
        for (int i = 0; i < costList.size(); i++) {
            if ((i + 1) % 3 == 0) {
                continue;
            }
            result += costList.get(i);
        }

        return result;
    }
}
