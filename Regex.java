package practise;

import java.util.Scanner;
import java.util.regex.*;

public class Regex {

	public static void main(String[] args) {
		//remove instances of words that are repeated more than once
//		Goodbye bye bye world world world
//		Sam went went to to to his business
//		Reya is is the the best player in eye eye game
//		in inthe
//		Hello hello Ab aB
		String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

//        Scanner in = new Scanner(System.in);
//        int numSentences = Integer.parseInt(in.nextLine());
        
        
            String input = "Goodbye bye bye world world world";
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);


	}

}
