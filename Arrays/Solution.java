class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{0};
    }

    // Testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(numbers, target);

        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
