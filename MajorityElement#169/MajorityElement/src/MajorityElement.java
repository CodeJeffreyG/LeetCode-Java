import java.util.HashMap;

public class MajorityElement {
	public static void main(String[] args) {
		int[] array = { 3, 2, 3 };

		System.out.println(majorityElement(array));
	}

	public static int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int currentHighestNum = 0;
		int max = 0;

		for (int num : nums) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		for (int num : nums) {
			if (map.get(num) > max) {
				max = map.get(num);
				currentHighestNum = num;
			}

		}

		return currentHighestNum;
	}
}
