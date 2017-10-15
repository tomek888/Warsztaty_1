package pl.coderslab.tomek888.guess_number;

import java.util.Scanner;

public class Next_int {

	public static void main(String[] args) {
		

	}
public static int getInt(String message) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	while(true) {
    	System.out.println(message);
    	while(!scan.hasNextInt()) {
    		System.out.println("Miała być liczba");
    		scan.next();
    	}
    	return scan.nextInt();
    	}
}

}
