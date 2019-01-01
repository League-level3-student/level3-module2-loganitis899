package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise

	static boolean intArraySorted(int[] array) {
		int p = 0;
		for (p = 0; p < array.length - 1; p++) {
			if (array[p] > array[p + 1]) {
				return false;
			}

		}

		return true;
	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise

	static boolean doubleArraySorted(double[] array) {
		int p = 0;
		for (p = 0; p < array.length - 1; p++) {
			if (array[p] > array[p + 1]) {
				return false;
			}

		}

		return true;
	}
	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)

	static boolean charArraySorted(char[] array) {
		int p = 0;
		for (p = 0; p < array.length - 1; p++) {
			if (array[p] > array[p + 1]) {
				return false;
			}

		}

		return true;
	}

	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)
	static boolean stringArraySorted(String[] array) {
		int p;
		for (p = 0; p < array.length - 1; p++) {
			if (array[p].compareTo(array[p + 1]) > 1) {
				return false;

			}

		}

		return true;
	}
}
