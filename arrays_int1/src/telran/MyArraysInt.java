package telran;

import java.util.Arrays;

public class MyArraysInt {
	public static int [] addNumber(int[] array, int num) {
		 int[] result = Arrays.copyOf(array, array.length + 1);
	     result[result.length - 1] = num;
	     return result;
        
	}
	public static int[] removeNumber(int [] array, int index) {
		
		 if (array == null
		            || index < 0
		            || index >= array.length) {
		 
		            return array;
		        }
		      
		int[] result = new int[array.length - 1];
		System.arraycopy(array, 0, result, 0, index);
		System.arraycopy(array, index + 1,result, index,array.length - index - 1);
	
		    return result;
	}
	
	public static int[] insertNumber(int [] array, int index, int num) {
		 int[] result = new int[array.length + 1];
	        System.arraycopy(array, 0, result, 0, index);
	        result[index] = num;
	        System.arraycopy(array, index, result, index + 1, array.length - index);
	        return result;
	}
	
}
