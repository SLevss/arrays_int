package telran.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MyArraysIntTest {

	@Test
	void testAddNumber() {
		 int[] array = {4, 3, 6, 7};
		 int num = 5;
		
		Arrays.binarySearch(addNumber(array, num));
	}

	

	@Test
	void testRemoveNumber() {
		int[] array = {4, 3, 6, 5};
		  int index = 2;
		Arrays.binarySearch(removeNumber(array, index));
	}

	@Test
	void testInsertNumber() {
		 int[] array = {4, 3, 6, 5};
	        int index = 2;
	        int num = 1;
	           
	   Arrays.binarySearch(insertNumber(array, index, num));
	

	}

}
