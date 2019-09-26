/*  Assignment 04
 * Ziyang Zeng
 * zengzg@mail.uc.edu
 * Due Date: 26/09/2019
 * Course: IS4010 App Dev with Java
 * Spring 2019
 * Description: This is the fourth assignment.This program can print pyramids using loops.
 * Citations: Stack Overflow,https://stackoverflow.com/questions/21373738/simple-java-program-of-pyramid
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
        int lines,n;
        lines = n = 5;
        for ( int i = 1 ; i <= n ; i++ )// The number of rows
           {
              for (int j = 1 ; j < lines ; j++ ) // The number of columns
                System.out.print(" "); // Print the spaces
              lines--;
              for (int j = 1 ; j <= 2*i - 1 ; j++ )
                  System.out.print(i); //Print the number 
              System.out.println("");}
	}
}
