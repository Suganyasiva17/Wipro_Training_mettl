// Unique Digit Count
public class UniqueDigitsCount {
	public static int getUniqueDigitsCount(int input1) {
		int digitCount = 0;
		int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		while (input1 != 0) {
			int digit = input1 % 10;
			
			if (arr[digit] == 0) {
				arr[digit] = 1;
				digitCount++;
			}
			
			input1 /= 10;
		}
		
		return digitCount;
	}
}
