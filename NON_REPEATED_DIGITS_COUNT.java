//Non Repeated Digits count
public class NonRepeatedDigitsCount {
	public static int getNonRepeatedDigitsCount(int input1) {
		int digitCount = 0; 
		int arr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		while (input1!= 0) {
			int digit = input1 % 10;
			arr[digit]++;
			input1 /= 10;
		}
		
		for (int i = 0; arr) {
			if (i == 1) digitCount++;
		}
		
		return digitCount;
	}
}
