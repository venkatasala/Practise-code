package practise;

import java.util.Arrays;

public class SubString {
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
//        String[] s1=new String[s.length()-2];
//        for(int i=0;i<s.length()-2;i++) {
//        	s1[i]=s.substring(i, k);
//        	k++;
//        
//        }
//        smallest=s1[0];
//        largest=s1[s1.length-1];
        return smallest + "\n" + largest;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcometojava";
        int k = 3;
        //System.out.println(getSmallestAndLargest(s, k));
        String[] s1=new String[s.length()-k+1];
        for(int i=0;i<s.length()-k+1;i++) {
        	s1[i]=s.substring(i, i+k);
        	//k++;
        }
        System.out.println(Arrays.toString(s1));
	}

}
