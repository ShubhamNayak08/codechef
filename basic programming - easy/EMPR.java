/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    double P = sc.nextDouble();
		    double X = sc.nextDouble();
		    double Y = sc.nextDouble();
		    double Z = sc.nextDouble();
		    
		    if(Z==1){
		        double s = P + ((P*Y)/100);
		        System.out.printf("%.10f\n",s);
		    }
		    else{
		        double s = P - ((P*X)/100);
		        System.out.printf("%.10f\n",s);
		    }
		    
		}
	}
}
