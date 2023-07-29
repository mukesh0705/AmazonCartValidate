package config;

public class Main09 {

	public static void main(String[] args) {
		int[]intArray= {10,20,3,40,5,6,1,8};
		int small=intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] <small &&intArray[i]%2==0)
				small=intArray[i];
			
			
		}
		System.out.println(small);

	}

}
