public class MoveZeros {
	public static void main(String[] args) {
		int[] array = { 0, 1, 0, 3, 12 };
		moveZeroes(array);

	}

	public static int[] moveZeroes(int[] nums) {
		int start = 0;

		for (int i = 0; i < nums.length; i += 1) {

			if (nums[i] != 0) {
				int saveNumStart = nums[start];
				nums[start] = nums[i];
				nums[i] = saveNumStart;
				start += 1;
			}
		}
		return nums;
	}
}
