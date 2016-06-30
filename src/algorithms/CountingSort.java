package algorithms;

import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * Counting sort is one of the implementation of Prefix Sort
 * http://www.geeksforgeeks.org/counting-sort/
 */
public class CountingSort {
	public static void main(String[] args) {
		fixedInput();
		// takeInput();
	}

	public static void fixedInput() {
		char[] charArr = { 'z', 'x', 'a', 'b', 'c' };
		countingSortForCharArr1(charArr);
	}

	public static void takeInput() {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] charArr = new int[length];
		for (int i = 0; i < length; ++i) {
			charArr[i] = scanner.next().charAt(0);
		}
		scanner.close();
		countingSortForCharArr(charArr);
	}

	public static void countingSortForCharArr(int[] charArr) {
		int[] totalChars = new int[255];
		// Uniqueness i.e. which which characters are present
		for (int i = 0; i < charArr.length; ++i) {
			++totalChars[charArr[i]];
		}
		// now need to use prefix sums
		for (int i = 1; i < totalChars.length; ++i) {
			totalChars[i] += totalChars[i - 1];
		}

		// Step 1 and 2 can be done in a single step
		// TODO later

		int[] sortedChars = new int[charArr.length];
		for (int i = 0; i < sortedChars.length; ++i) {
			sortedChars[totalChars[charArr[i]] - 1] = charArr[i];
			--totalChars[charArr[i]];
		}

		for (int i = 0; i < sortedChars.length; ++i)
			System.out.println((char) sortedChars[i]);

	}

	public static void countingSortForCharArr1(char[] charArr) {
		int length = charArr.length;
		char[] charArrSorted = new char[length];
		// http://www.flexcomm.com/library/ASCII256.htm
		// though total ASCII characters are 255, we assume we will be taking
		// only alphabets, Z = 122
		int range = 123;
		int[] totalChars = new int[range];
		// find contributoin
		for (int i = 0; i < length; ++i) {
			++totalChars[charArr[i]];
		}
		// find prefix sum
		for (int i = 1; i < range; ++i) {
			totalChars[i] += totalChars[i - 1];
		}
		// now as per contribution on sorted total array, find the new one
		for (int i = 0; i < length; ++i) {
			charArrSorted[totalChars[charArr[i]] - 1] = charArr[i];
			--totalChars[charArr[i]];
		}

		for (int i = 0; i < length; ++i)
			System.out.println(charArrSorted[i]);
	}

}
