package corejava;

public class Count_VowelaAndConsonants {

	public static void main(String[] args) {
		int vCount =0;
		int cCount = 0;
		
		String str = "Hi All, How are you";
		
		System.out.println(str);
		str = str.toLowerCase();
		System.out.println(str);
		
		for (int i = 0; i < str.length(); i++) {
			//Check whether a character is a VOWEL
			if (str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vCount++;
			}//Check whether a character is a consonant
			else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				cCount++;
			}
		}
		
		System.out.println("String length: " + str.length());
		
		System.out.println(" Number of Vowels: "+ vCount);
		System.out.println(" Number of Consonants: "+ cCount);
		

	}

}
