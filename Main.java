package sample;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        String pi = String.valueOf(3.14159265358979323846);
        
        for (int i = 3; i <= 14; i++) {
            System.out.println(pi.substring(0, i + 1));
        }
    }	
    
	


}

