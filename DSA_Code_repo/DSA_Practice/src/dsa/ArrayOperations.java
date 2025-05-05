package dsa;

import java.util.Arrays;

public class ArrayOperations {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7};
		arr = insert(arr, 2, 10);
//		arr = delete(arr,2);
//		int index = search(arr,10);
//		System.out.println("index of 10 is = "+index);
		System.out.println(" "+Arrays.toString(arr));
	}
	
	static int[] insert(int [] arr, int index, int value) {
		int [] newArr = new int[arr.length + 1];
		for(int i = 0,j = 0; i <arr.length; i++ ) {
			if(index == i) {
				newArr[i] = value; 
			}else {
				newArr[i] = arr[j++];
			}
		}
		return newArr;
	}
}
