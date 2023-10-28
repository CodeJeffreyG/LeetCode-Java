public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		int[] array = { 7, 6, 4, 3, 1 };

		System.out.println(BestTimeToBuyAndSell(array));

	}

	public static int BestTimeToBuyAndSell(int[] stocks) {
		int currentLowest = stocks[0];
		int complement = 0;
		int profit = 0;

		for (int num : stocks) {
			if (num < currentLowest) {
				currentLowest = num;
			}

			complement = num - currentLowest;

			if (complement > profit) {
				profit = complement;
			}

		}

		return profit;
	}
}
