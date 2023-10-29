public class MoveZeros {
	public static void main(String[] args) {
		int[] array = { 0, 1, 0, 3, 12 };
		moveZeroes(array);

	}

	public static int[] moveZeroes(int[] nums) {
		int i = 0;
		int j = 1;

		while (j < nums.length) {
			if (nums[i] == 0 && nums[j] != 0) {
				int saveJ = nums[j];
				i = saveJ;
				j = 0;
			} else if (nums[i] == 0 && nums[j] == 0) {
				j += 1;
				continue;
			}
			j += 1;
			i = j - 1;
		}

		return nums;

	}
}
