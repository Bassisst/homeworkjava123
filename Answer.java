package sample;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Answer {

public static void main(String[] args) {
		
	
	    Scanner sc = new Scanner(System.in);
	    String text;
	    System.out.println("Input text: ");
	    text = sc.nextLine();
	    int count = 0;
	    char[] symbols = text.toCharArray();

	    for (int i = 0; i < symbols.length; i++) {
	      char s = symbols[i];
	      if (s == 'b') {	
	        count += 1;
	      }
	    }
	    System.out.println(count);

	  }
	

}

