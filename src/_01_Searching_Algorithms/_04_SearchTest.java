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
	public void testBinarySearch() {
		int[] array = {1,2,3,4,5,5,5,7,9,10,12,13};
		int start = 1;
		int end= 13;
		int value=12;
		
		assertEquals(10,_01_BinarySearch.binarySearch(array, start, end, value));
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
	}
	
	@Test	

	public void testInterpolationSearch() {
		int[] array= {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
		int start =2;
		int end=30;
		int value = 14;
		assertEquals(6, _02_InterpolationSearch.interpolationSearch(array, value));
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test*/
	public void testExponentialSearch() {
		int[] array= {1,2,3,6,7,7,7,7,7,7,7,9,50,70,80,90,100,100,110,111,200,203,204,205};
		int value = 111;
		assertEquals(19, _03_ExponentialSearch.exponentialSearch(array, value));
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
