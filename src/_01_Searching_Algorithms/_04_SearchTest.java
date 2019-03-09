package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
/*	public void testLinearSearch() {
		String[] words = {"yes", "no" , "maybe", "nope","oke","kren","kkee","plop","leach"};
		String value="leach";
		//1. use the assertEquals method to test your linear search method.
		assertEquals(8, _00_LinearSearch.linearSearch(words,value));
	}

	@Test
	*/
	public void testBinarySearch() {
		int[] array = {1,2,3,4,5,5,5,7,9,10,15,100};
		int start = 1;
		int end= 100;
		int value=15;
		
		assertEquals(10,_01_BinarySearch.binarySearch(array, start, end, value));
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
