package config;

public class Main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 10;
		int s=0;
		for (int i = 1; i <=num; i++) {
			if (num% i==0) {
				s=s+i;
			}
			System.out.println(s);
		}

	}

}
