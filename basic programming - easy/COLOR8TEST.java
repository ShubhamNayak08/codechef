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
		    
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    int e = sc.nextInt();
		    int f = sc.nextInt();
		    int g = sc.nextInt();
		    
		    if(a%2==0){
		        int n = a;
		        int cost = ((b+c+d+e+f+g)/2)*n;
		        System.out.println(cost);
		    }
		    
		    else{
		        int n = a+1;
		        int cost = ((b+c+d+e+f+g)/2)*n;
		        System.out.println(cost);
		    }
		    
		    
		}
	}
}
