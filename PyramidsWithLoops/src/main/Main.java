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
        int row,temp,c,n;
        temp = n = 5;
        for ( row = 1 ; row <= n ; row++ )
           {
              for ( c = 1 ; c < temp ; c++ )
                System.out.print(" ");

              temp--;

              for ( c = 1 ; c <= 2*row - 1 ; c++ )
                  System.out.print(c);

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
