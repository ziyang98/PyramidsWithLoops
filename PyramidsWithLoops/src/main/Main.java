/*  Assignment 04
 * Ziyang Zeng
 * zengzg@mail.uc.edu
 * Due Date: 26/09/2019
 * Course: IS4010 App Dev with Java
 * Spring 2019
 * Description: This is the fourth assignment.This program can print pyramids using loops.
 * Citations: 
 * Anything else:
 * Printing pyramids using loops. It kind-of works.  
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/ 
package main;

public class Main {

	public static void main(String[] args) { 
        int lines,j,n;
        lines = n = 5;
        for ( int i = 1 ; i <= n ; i++ )
           {
              for ( j = 1 ; j < lines ; j++ )
                System.out.print(" ");

              lines--;

              for ( j = 1 ; j <= 2*i - 1 ; j++ )
                  System.out.print(j);

              System.out.println("");}
/*		int lines = 5;
		for (int i = 1; i <= lines; i=i+1) {
			for (int j = 1; j < lines; j++) {
				System.out.print(" ");
			
			lines--;
			
			for (int k = 1; k <= 2*lines - 1; k++) {
                System.out.print(k);  }             
            }
            System.out.println();
		}*/
	}
}
