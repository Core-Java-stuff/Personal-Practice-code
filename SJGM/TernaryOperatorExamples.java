package com.sjgm.question;

import java.util.ArrayList;
import java.util.List;

/**
 * @author basanta.kumar.hota
 *         ***************************************************** Syntax of
 *         ternary : condition ? exprTrue :exprFalse *
 *         *****************************************************
 */
public class TernaryOperatorExamples {

	static List<Integer> list = null;

	static {
		list = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			list.add(i);
		}
	}

	// Find minimum number
	public static int findMinimum(int i, int j) {
		// it indicates if (i < j) then return i else j
		return i < j ? i : j;
	}

	// find prime number using java normal
	public static boolean findPrime(int no) {
		boolean flag = false;
		for (int i = 2; i <= no / 2; i++) {
			if (i % 2 == 0) {
				flag = false;
			} else {
				flag = true;
			}

		}
		return flag;
	}

	// find prime number using java ternary operator
	public static boolean findPrimeUsingTernary(int no) {
		boolean flag = false;
		for (int i = 2; i <= no / 2; i++) {
			flag = (i % 2 == 0) ? false : true;
		}
		return flag;
	}

	// Find sum of even or sum of add based on method parameter using java 8 and
	// ternary operator
	public static int sumOfEvenAndOdd(String type) {
		return (type.equals("even")) ? list.stream().filter(i -> i % 2 == 0)
				.mapToInt(i -> i).sum() : list.stream().filter(i -> i % 2 != 0)
				.mapToInt(i -> i).sum();

	}

	public static void main(String[] args) {
		System.out.println(findMinimum(10, 12));
		System.out.println(findPrime(11));

		System.out.println("sum :" + sumOfEvenAndOdd("even"));

	}
}
