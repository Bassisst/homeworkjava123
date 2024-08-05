package sample;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Classroom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input some text 3> words with space: ");
        String word = sc.nextLine();
        
        String[] words = word.split(" ");
        String longword = "";
        
        for (String word1 : words) {
            if (word1.length() > longword.length()) {
            	longword = word1;
            }
        }
        
        System.out.println("The most long  word is: " + longword);
        
     
		
		
		
	    
	    
	    
        
		
		 }
		 
       
	}


