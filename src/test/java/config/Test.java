package config;

public class Test {
	enum day {
		
		mon,
		sat,
		sun,
	}
	
		public static void main(String[] args) {
			day ch=day.sun;
			switch (ch) {
			case mon:
				System.out.println("lets work");
				break;
			case sat:
				System.out.println("waiting for sun");
				break;
			case sun:
				System.out.println("lets have fun");
				break;
				
			}
			
	}

}
