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
		    
		    long n = sc.nextLong();
		    int i = 0;
		    while(n%2==0){
		        
		        n = n/2;
		        i++;
		    }
		    if(i%2==0){
		        System.out.println("1");
		    }
		    else{
		        System.out.println("0");
		    }
		}
	}
}
