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
		    
		    double H = sc.nextDouble();
		    double W = sc.nextDouble();
		    double X = sc.nextDouble();
		    double Y = sc.nextDouble();
		    double K = sc.nextDouble();
		   
		    
		    double dis = Math.sqrt(Math.pow(W-X,2) + Math.pow(H-Y,2));
		    
		    if(dis<K){
		        System.out.println("1");
		    }
		    else{
		        System.out.println("0");
		    }
		    
		}
	}
}
