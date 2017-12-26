package Task_Chapter_10;

public class MyInteger {

	private int Value;

	public MyInteger(int value) {

		Value = value;
	}

	public int getValue() {

		return Value;

	}

	public boolean isEven() {

		return Value % 2 == 0;
	}

	public boolean isOdd() {

		return Value % 2 != 0;

	}

	public boolean isPrime() {

		if (Value == 1 || Value == 2) {
			return true;
		} else {
			for (int i = 2; i < Value; i++) {
				if (Value % i == 0)
					return false;
			}
		}
		return true;
	}

	public static boolean isEven(int myInt) {

		return myInt % 2 == 0;
	}

	public static boolean isOdd(int myInt) {

		return myInt % 2 != 0;

	}

	public static boolean isPrime(int myInt) {

		for (int i = 2; i < myInt; i++) {
			if (myInt % 2 == 0) {

			}
		}
		return false;

	}

	public static boolean isEven(MyInteger myInt) {

		return myInt.isEven();
	}

	public static boolean isOdd(MyInteger myInt) {

		return myInt.isOdd();

	}

	public static boolean isPrime(MyInteger myInt) {

		return myInt.isPrime();

	}

	public boolean equals(int testInt) {

		if (testInt == getValue()) {

		}

		return false;
	}

	public boolean equals(MyInteger myInt) {

		if (myInt.getValue() == this.getValue()) {
			return true;

		}
		return false;
	}

	public static int parseInt(char[] values) {

		int sum = 0;
		for (char i : values) {
			sum += Character.getNumericValue(i);

		}
		return sum;

	}

	public static int parseInt(String value) {

		return Integer.parseInt(value);

	}
}
