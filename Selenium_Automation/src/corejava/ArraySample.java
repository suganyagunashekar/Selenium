package corejava;

public class ArraySample {
	public static void main(String[] args) {
//		int[] abc = {24,453,3,4,878,55};
		String abc[] = { "SDfdsf", "SDgfsdg" };
		String[] ab = {"Sdfsdf","SDfsdfs","SDgdsgdsg"};

		String te[] = new String[3];
		te[0] = "sdfsdgsd";
		for (int i = 0; i < te.length; i++) {
			System.out.println(te[i]);
		}

		System.out.println("*********************************");
		int test[] = new int[2];//
		test[0] = 353;
		test[1] = 35;
		// test[2] = 356346;
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		
		
		
		

	}
}
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
//at corejava.Array_ascorder.main(Array_ascorder.java:14)
