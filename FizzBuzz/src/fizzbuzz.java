
public class fizzbuzz {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			String temp = "";
			temp += dividedThree(i);
			temp += dividedFive(i);
			if (temp.equals("")) {
				temp += i;
			}
			System.out.println(temp);

		}

	}

	public static String dividedThree(int n) {
		if (n % 3 == 0) {
			return "Fizz";
		} else {
			return "";
		}
	}

	public static String dividedFive(int n) {
		if (n % 5 == 0) {
			return "Buzz";
		} else {
			return "";
		}
	}
}
