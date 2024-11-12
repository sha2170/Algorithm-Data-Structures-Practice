public class Solution_43165 {
    public int solution_43165(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        }

        int add = dfs(numbers, target, index+1, sum+numbers[index]);
        int subtract = dfs(numbers, target, index+1, sum-numbers[index]);

        return add + subtract;
    }
}
