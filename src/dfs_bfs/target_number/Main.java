package dfs_bfs.target_number;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        Solution solution = new Solution();
        System.out.println(solution.solution(numbers, target));
    }
}
