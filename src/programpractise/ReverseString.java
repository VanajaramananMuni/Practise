package programpractise;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String name = "vanajaramanan";

		String[] reversed = name.split("");
		// System.out.println(Arrays.deepToString(reversed));

		for (int i = reversed.length - 1; i >= 0; i--) {

			System.out.print(reversed[i]);
		}
	}

}
