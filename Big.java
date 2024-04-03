package practise;
import java.math.BigDecimal;
import java.util.*;

public class Big {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
//		9
//		-100
//		50
//		0
//		56.6
//		90
//		0.12
//		.12
//		02.34
//		000.000
//		class Solution{
//		    public static void main(String []args){
		        //Input
		        Scanner sc= new Scanner(System.in);
		        int n=sc.nextInt();
		        String []s=new String[n+2];
		        BigDecimal b[]= null;
		        for(int i=0;i<n;i++){
		            s[i]=sc.next();
		            b[i]=new BigDecimal(s[i]);
		        }
		        sc.close();
		        for(int i=0;i<n-1;i++) {
		        	for(int j=1;j<n;j++) {
		        		if(s[i].compareTo(s[j])==-1) {
		        			BigDecimal tem=b[i];
			        		b[i]=b[j];
							b[j]=tem;
		        		}
		        		
		        	}
		        }
		        for(int i=0;i<n;i++)
		        {
		            System.out.println(b[i]);
		        }
		    }

}
