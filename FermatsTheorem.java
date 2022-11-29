/*
 * Near Miss Assignment
 * File Holding the Program: FermatsTheorem
 * 
 * Programmers Names: 
 * 1. Prasanth Reddy Sokkula(PrasanthReddySokku@lewisu.edu)
 * 2. Jasmine Kaur 
 * 
 * Course: FA22-CPSC-60500-003
 * 
 * November 29, 2022
 * 
 * The values for x and y are determined from the value of k in line with the limit range that was specified at the beginning of the procedure. This is done by using the value of k as a starting point.
 * It will be decided upon a number somewhere in the range of 2 to n times 12, and that number will be chosen at random. After that, we followed out the procedures necessary by the method for locating the nearest miss, which included calculating the equation, determining the value of the near miss, and lastly obtaining the value of the nearest miss. This process was repeated until we had the value of the nearest miss.
 */
import java.util.Scanner;
import java.lang.Math;

public class FermatsTheorem {
	public int getLowerlimit() {
		 Scanner input = new Scanner(System.in);
		    
		    System.out.print("Enter Lower limit for K = ");
		    int lower_limit = input.nextInt();
		return lower_limit;
		
	}
	public int getUpperlimit() {
		 Scanner input = new Scanner(System.in);
		    
		    System.out.print("Enter Upper limit for K = ");
		    int upper_limit = input.nextInt();
		return upper_limit;
		
	}
	public int getValueofn() {
		 Scanner input = new Scanner(System.in);
		    
		 	System.out.print("Enter Value for n  greater than 2 = ");
		    int n = input.nextInt();
		return n;
		
	}
	
	public static void main(String[] args) 
	{ 
		int x = 0;
	    int y = 0;
	    int z = 0;
	    int lowerlimit;
	    int upperlimit;
	    int n;
	    FermatsTheorem obj = new FermatsTheorem();
	    lowerlimit = obj.getLowerlimit();
	   
	    Scanner input = new Scanner(System.in);
	    
	    while(lowerlimit < 10)
	    {
	    	System.out.print("WRONG!!!! Enter Lower limit greater than 10 = ");
		    lowerlimit = input.nextInt();
	    }
	    upperlimit = obj.getUpperlimit();
	    while(upperlimit <= lowerlimit)
	    {
	    	System.out.print("WRONG!!! Enter Upper limit greater than Lower limit = ");
		    upperlimit = input.nextInt();
	    }
	    n = obj.getValueofn();
	    while(n < 2)
	    {
	    	System.out.print("WRONG!!! Enter value for n greater than 2 = ");
	    	n = input.nextInt();
	    }
	    System.out.print("\nEnter number of Iterations = ");
	    int counter = input.nextInt();
	    double smallestmiss = 99999999.99; 
	    
	    for (int i =0; i<counter; i++) 
	    {
	        	
	        	x =  (int) ((Math.random() * (upperlimit - lowerlimit)) + lowerlimit);
	        	y =  (int) ((Math.random() * (upperlimit - lowerlimit)) + lowerlimit);
	        	n =  (int) ((Math.random() * (11 - 3)) + 3);
	        	
	        	System.out.print("\nX value = " + x);
	        	System.out.print("\nY value = " + y);
	        	System.out.print("\nN value = " + n + "\n");
	     	        	
	        
	        int xpown_plus_ypown = (int)(Math.pow (x, n))+(int)(Math.pow (y, n));
	        
	        
	        //To get the fermat's equation, nth root of the sum we get above will be taken.
	        z = (int) Math.pow (xpown_plus_ypown, 1.0/n);
	        
	        int nearmiss = (int)(xpown_plus_ypown - Math.pow (z, n));
	        
	        
	        //calculates the relative miss value
	        double relativemiss = 100. * nearmiss / xpown_plus_ypown;
	        System.out.println("\n\nVAlue of Near Miss =  "+nearmiss+" \nValue of Relative Miss = "+relativemiss);
	        
	        
	        //To get the smallest value we compare the relative miss and smallest miss values
	        if(relativemiss<smallestmiss)
	        {
	        	smallestmiss=relativemiss;
	        }
	        System.out.println("Smallest Possible Miss = "+smallestmiss);
	           
	    }
	}

}



