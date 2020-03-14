package corejava;

import java.util.Arrays;

public class StringArray_ascOrder {
public static void main(String[] args) {
	String[] a = {"b","c","a","d"};
	String temp;
	for (int j = 0; j < a.length; j++) {
		Arrays.sort(a);
		
		System.out.println(a[j]);
	}
	
	
//		for (int i = 0; i < a.length; i++) {
//		
//		for (int j = i+1; j < a.length; j++) {
//			if (a[i].contentEquals(a[j])){
//				temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//					}
//	}// i for loop end
//	
//	System.out.println("Array Ascending Order: ");
//	for (int i = 0; i < a.length; i++) {
//		System.out.print(a[i]+", ");
//	}
}
}

