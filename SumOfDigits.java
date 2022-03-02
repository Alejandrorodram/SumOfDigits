package sumOfDigits;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println(SumDigits1(456));
		System.out.println(SumDigits1(493193));
		System.out.println(SumDigits2(456));
		System.out.println(SumDigits2(493193));
		System.out.println(SumDigits3(456));
		System.out.println(SumDigits3(493193));
		System.out.println(SumDigits4(456));
		System.out.println(SumDigits4(493193));
	}

	public static int SumDigits1(int digits) {
		int sum = 0;

		while (digits != 0) {
			int d1 = digits % 10;
			sum = sum + d1;
			digits = digits / 10;

			if (digits == 0 && sum >= 10) {
				digits = sum;
				sum = 0;
			}
		}
		return sum;
	}

	public static int SumDigits2(int digits) {
		return (digits != 0 && digits % 9 == 0) ? 9 : digits % 9;
	}

	public static int SumDigits3(int digits) {
		while (digits > 9) {
			digits = digits / 10 + digits % 10;
		}
		return (digits);
	}

	public static int SumDigits4(int digits) {
		return (1 + (digits - 1) % 9);
	}
}
