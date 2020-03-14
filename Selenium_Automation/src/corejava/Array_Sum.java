package corejava;

public class Array_Sum {
	public static void main(String[] args) {
		double[] num = { 12, 42.123456789, 4, 5, 6 };
		System.out.println("Length of array: " + num.length);
		System.out.println(num[0]);
		double sum = 0;
		// Advance For loop
		for (double i : num) {
			sum = sum + i;// 12+42
		} // for loop end

		System.out.println("Sum of Array: " + sum);
		double avg = sum / num.length;
		System.out.println(avg);
		System.out.format("Average of Array: %.2f", avg);
	}

}
