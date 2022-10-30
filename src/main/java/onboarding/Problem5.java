package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> result = new ArrayList<>();
        List<Integer> moneyUnit = List.of(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1);
        for (int unit: moneyUnit) {
            result.add(money/unit);
            money %= unit;
        }
        return result;
    }

}
