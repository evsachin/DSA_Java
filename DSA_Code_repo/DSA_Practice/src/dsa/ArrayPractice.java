package dsa;

import java.lang.reflect.Array;

public class ArrayPractice {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		
//		System.out.println("Index  | value ");
//		System.out.println("--------------");
//		for(int i = 0; i < arr.length;  i++) {
//			System.out.println(i+"      |   "+arr[i]);
//		}
		
		
		System.out.println(arr[arr.length-1]);
		System.out.println(arr[arr.length - 2]);
		arr[arr.length -1] = 100;
		
		System.out.println("---------------------");
		for(int num:arr) {
			
			System.out.println(num);
		}
		
	}

}
