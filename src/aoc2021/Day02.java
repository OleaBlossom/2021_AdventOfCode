package aoc2021;

import java.util.List;

public class Day02 extends AOCPuzzle {
    public Day02() {
        super("2");
    }

    @Override
    void solve(List<String> input) {

        int horizontal1 = 0;
        int vertical1 = 0;

        for (String line : input)
        {
            String[] lineData = line.split(" ");
            String direction = lineData[0];
            int distance = Integer.parseInt(lineData[1]);

            switch (direction)
            {
                case "forward":
                    horizontal1 += distance;
                    break;
                case "up":
                    vertical1 -= distance;
                    break;
                case "down":
                    vertical1 += distance;
                    break;
            }

        }

        lap("h: " + vertical1 + ", v: " + horizontal1 + ", total: " + (vertical1 * horizontal1));


        int horizontal2 = 0;
        int vertical2 = 0;
        int aim = 0;

        for (String line : input)
        {
            String[] lineData = line.split(" ");
            String direction = lineData[0];
            int distance = Integer.parseInt(lineData[1]);

            switch (direction)
            {
                case "forward":
                    horizontal2 += distance;
                    vertical2 += (aim * distance);
                    break;
                case "up":
                    aim -= distance;
                    break;
                case "down":
                    aim += distance;
                    break;
            }

        }

        lap("total: " + (horizontal2 * vertical2));
    }
}
