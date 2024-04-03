package practise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagcontentExtractor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = 1;//Integer.parseInt(in.nextLine());
		while(testCases>0){
			//String line ="<h1>Nayeem loves counseling</h1>";// in.nextLine();
			String line="<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
			String r="<([^<>]+)>([^<>]+)</\\1>";
            Pattern p=Pattern.compile(r);
            Matcher matcher = p.matcher(line);
            int count=0;
            while(matcher.find()==true){
                System.out.println(matcher.group(2));
                count++;
            }
            if(count==0){
                System.out.println("None");
            }
			testCases--;
		}
	}
}
