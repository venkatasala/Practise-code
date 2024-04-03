package practise;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="madam";
		String s="java";
		String com="";
		for(int i=s.length()-1;i>=0;i--) {
			com+=s.charAt(i);
		}
		if(s.equals(com)) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}

	}

}
