package telran.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static telran.MyArraysInt.*;

class MyArraysIntTest {

	@Test
	void testAddNumber() {
		int array[] = {4, 3, 6, 7};
		 int expected1[] = {1, 2, 3, 4};
		 int num = 5;
		
		 assertArrayEquals(expected1, addNumber(array, num));
	}

	

	@Test
	void testRemoveNumber() {
		int array[] = {4, 3, 6, 5};
		
		int expected1[] = {1, 3};
		int expected2[] = {1, 2};
		  assertArrayEquals(expected1, removeNumber(array, 1));
		  assertArrayEquals(expected2, removeNumber(array, 2));
		
	}

	@Test
	void testInsertNumber() {
		int array[] = {4, 3, 6};
		int expected1[] = {4, 3, -4, 6};
		int expected2[] = {4, 3, 3, -4};
	       
	           
	   assertArrayEquals(expected1, insertNumber(array, 2, -4));
	   assertArrayEquals(expected2, insertNumber(array, 3, -4));

	}
	@Test
	@Disabled
	void testBinarySearchOutOfBound() {
		int array[] = {1,2,3};
		assertEquals(0, Arrays.binarySearch(array, 2, 0, 1));
		assertEquals(0, Arrays.binarySearch(array, -2, 2, 1));
		assertEquals(0, Arrays.binarySearch(array, 0, 6, 1));
	}
}
