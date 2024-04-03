package practise;

import java.util.Arrays;

public class BalacingParanthesis {
	public static boolean check(int a,int b,int c,int d) {
		if(a==c) {
			return true;
		}
		else if(b==c) {
			return true;
		}
	return false;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "{}(";
		int a = 0,b = 0,c = 0,d=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				a++;
			}
			else if(s.charAt(i)=='{') {
				b++;
			}
			else if(s.charAt(i)==')') {
				c++;
			}
			else if(s.charAt(i)=='}') {
				d++;
			}
		}
		check(a, b, c, d);
		System.out.println(check(a, b, c, d));

	}

}
