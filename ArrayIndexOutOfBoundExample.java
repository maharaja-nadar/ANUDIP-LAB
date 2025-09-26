package lab;

public class ArrayIndexOutOfBoundExample {


		public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4}; // Array of 4 elements
	        
	        try {
	            // Loop intentionally goes one step beyond array length
	            for (int i = 0; i <= arr.length; i++) {
	                System.out.println("Element at index " + i + ": " + arr[i]);
	            }
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index out of bounds.");
	        }
	    }
	}