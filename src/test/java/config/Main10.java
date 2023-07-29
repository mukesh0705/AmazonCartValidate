package config;

public class Main10 {

	public static void main(String[] args) {
		String[] strASrray= {"ani","jan","sam","chris","mon"};
		String s="sam";
		for (int i = 0; i < strASrray.length; i++) {
			if (s.equals(strASrray[i])) {
				strASrray[i]="Admin";
				break;
			}
			System.out.println(strASrray[i]);
		}
		

	}

}
