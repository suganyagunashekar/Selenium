package corejava;

public class Array_ascorder {
public static void main(String[] args) {
	int[] a= {123,45,89,111};//45 89  111 123
	int temp;
	for (int i = 0; i < a.length; i++) {
		
		for (int j = i+1; j < a.length; j++) {
			if (a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
					}
	}// i for loop end
	
	System.out.println("Array Ascending Order: ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+", ");
	}
}
}
