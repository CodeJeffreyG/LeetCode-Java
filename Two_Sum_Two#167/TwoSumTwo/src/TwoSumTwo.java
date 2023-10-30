public class TwoSumTwo {

	public static void main(String[] args) {
		int[] array = { 2, 7, 11, 15 };
		twoSum(array, 9);
	}

	public static int[] twoSum(int[] numbers, int target) {
		int i = 0;
		int j = numbers.length - 1;
		int[] answer = new int[0];

		while (i < j) {
			int complement = numbers[i] + numbers[j];

			if (complement > target) {
				j -= 1;
			}

			if (complement < target) {
				i += 1;
			}

			if (complement == target) {
				answer = new int[] { i + 1, j + 1 };
				for (int num : answer) {
					System.out.println(num);
				}
				return answer;
			}
		}

		for (int num : answer) {
			System.out.println(num);
		}
// im adding all this sht
		return answer;
	}
}
