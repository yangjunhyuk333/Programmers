package stack_queue.function;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(progresses, speeds)));
    }
}
