package config;

public class Main06 {

	public static void main(String[] args) {
		int[] numArray = {10,5,16,20,40,55,68};
		int sum=0;
		for (int num : numArray) {
			sum+=num;
		}
		int a=sum/numArray.length;
		System.out.println(a);

	}

}
