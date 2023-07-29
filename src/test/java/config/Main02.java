package config;

public class Main02 {

	public String doSomething( String input) {
		// TODO Auto-generated method stub
		 
			StringBuilder output=new StringBuilder();
			char[] charArray=input.toCharArray();

			for (char c : charArray) {
				if (!Character.isWhitespace(c)) {
					output.append(c);

				}
				
			}
			return output.toString();
		
	}
	public static void main(String[] args) {
		Main02 b=new Main02();
		System.out.println(b.doSomething("Mukesh is Hero"));
		//b.doSomething("Mukesh");
	}

	

}
