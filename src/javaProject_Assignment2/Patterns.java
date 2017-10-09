package javaProject_Assignment2;
//import java.util.Scanner;
public class Patterns {
	public static void main(String[] args) //Main method starts
	{
	    {
	        //Declaration of variables
	        int height =3;
	        int noOfCharactersInARow = 1;
	        int space = height+1;
	        char alphabet = 'a';
	        
	        // loop for printing upper triangle
	        for (int upperTriangle = 0; upperTriangle < height; upperTriangle++) 
	        {
	            for (int printSpace = space; printSpace > 0; printSpace--)
	            //printing space
	            {
	                System.out.print(" ");
	            }
	            space--;

	            for (int printAlphabet = 0; printAlphabet < noOfCharactersInARow; printAlphabet++) 
	            {
	                System.out.print(alphabet); //printing alphabets
	                if (printAlphabet < noOfCharactersInARow / 2) 
	                {
	                    alphabet++;
	                } 
	                else 
	                {
	                    alphabet--;
	                }
	            }
	            noOfCharactersInARow = noOfCharactersInARow + 2;
	            alphabet = 'a';

	            System.out.println();
	        }

	        space = height;
	        alphabet = 'a';
	        //loop for printing lower triangle
	     for (int lowerTriangle = 0; lowerTriangle < height; lowerTriangle++) {
	            for (int printSpace = space; printSpace > 0; printSpace--)
	            {
	                System.out.print(" ");
	            }
	            space++;
	            for (int printAlphabet = 0; printAlphabet < (noOfCharactersInARow -space); printAlphabet++)
	            {
	                System.out.print(alphabet); //printing alphabets
	                if (printAlphabet < noOfCharactersInARow/4) 
	                {
	                    alphabet++;
	                } 
	                else 
	                {
	                    alphabet--;
	                }
	            }
	            noOfCharactersInARow = noOfCharactersInARow-1;
	            alphabet = 'a';
	            System.out.println();
	        }

	        }

	}

}
