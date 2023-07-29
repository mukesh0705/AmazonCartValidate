package config;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a=0;
		System.out.println(" a = "+ a);
		int b = 20/ a;
		System.out.println(" b= "+b);

	}
		catch (Exception e) {
			System.out.println("Devide by zero error");
		}
		finally {
			System.out.println("inside the finally block");
		}

}}
