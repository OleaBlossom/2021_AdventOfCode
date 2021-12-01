package aoc2021;

import java.util.ArrayList;
import java.util.List;

public class Day01 extends AOCPuzzle {

    public Day01() {
        super("1");
    }

    @Override
    void solve(List<String> input) {
        List<Integer> depths = convertToInts(input);

        int counter = 0;

        for (int i = 1; i < depths.size(); i++) {

            if (depths.get(i - 1) < depths.get(i)) {
                counter++;
            }
        }

        lap(counter);

        List<Integer> rollingDepths = new ArrayList<>();

        for (int i = 2; i < depths.size(); i++) {

            int first = depths.get(i - 2);
            int second = depths.get(i - 1);
            int third = depths.get(i);

            rollingDepths.add(first + second + third);
        }

        int secondCounter = 0;
        for (int i = 1; i < rollingDepths.size(); i++) {

            if (rollingDepths.get(i - 1) < rollingDepths.get(i)) {
                secondCounter++;
            }
        }

        lap(secondCounter);
    }
}
