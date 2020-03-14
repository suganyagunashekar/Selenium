package corejava;

public class Ooops_polymorphism_1 {

	// 2 types of Polymorphism - Compile time and Run time
	// Complile - known as method overloading
	// Run time - method Overriding
	// method overloading
	public static int add() {

		int a = 20;
		int b = 20;
		return a + b;
		
	}

	public static int add(int a, int b) {
		return a + b;
		
	}

	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void add(String a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {

		System.out.println(add());
		System.out.println(add(20, 30));
		add(20, 40, 60);
		add("Hi", 65, 32);
	}
}
