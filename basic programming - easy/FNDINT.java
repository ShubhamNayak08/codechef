/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-->0){
		    long a = in.nextLong();
		    String str = Long.toString(a);
		    if(str.length()==1){
		        a++;
		        System.out.println(a);
		    } else {
		        int count = 1;
		        while(count!=0){
		            a++;
		            str = Long.toString(a);
		            count = 0;
		            for (int i=0; i<str.length()-1;i++){
		                for (int j = i+1; j<str.length(); j++){
		                    if(str.charAt(i)==str.charAt(j)){
		                        count++;
		                    }
		                } 
		            } 
		        }
		        System.out.println(a);
		    }
		}
	}
}
