package practise;

import java.util.Scanner;

public class Game {
	public static boolean canWin(int leap, int[] game) {
        return canWinHelper(leap, game, 0);
    }
    
private static boolean canWinHelper(int leap, int[] game, int i) {
	if (i < 0 || i >= game.length || game[i] == 1) 
	return false;

	if (i == game.length - 1 || i + leap >= game.length)
	return true;
	
	game[i] = 1;

    return canWinHelper(leap, game, i + leap) || 
           canWinHelper(leap, game, i + 1) || 
           canWinHelper(leap, game, i - 1);
}

	public static void main(String[] args) {
        int q = 1;
        while (q-- > 0) {
            int n = 6;
            int leap = 5;
            
            int[] game = {0,0,0,1,1,1};
            int len=game.length-1;
            //for (int i = 0; i < n; i++) {
                //game[i] = scan.nextInt();
            //}

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        //scan.close();
    }
}