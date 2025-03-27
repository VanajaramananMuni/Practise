package com.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseStirng {

	public static void main(String[] args) {

		String A = "madam";

		String split[] = A.split("");

		System.out.println(Arrays.deepToString(split));

		String ss = "";
		for (int i = split.length - 1; i >= 0; i--) {
			ss += split[i];

		}

		// String reversed = String.join("", ls);

		if (A.equals(ss)) {

			System.out.print("Yes");
		} else {

			System.out.println("NO");
		}
	}

}
