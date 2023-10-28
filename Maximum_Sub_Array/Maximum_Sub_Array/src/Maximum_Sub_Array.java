public class Maximum_Sub_Array {
	public static void main(String[] args) {
		int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(array));
	}

	public static int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int currentSum = 0;

		for (int num : nums) {
			currentSum += num;
			if (currentSum < 0) {
				currentSum = 0;
			}
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
		}

		return maxSum;
	}
}
