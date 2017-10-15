
package pl.coderslab.tomek888.guess_number;
import static pl.coderslab.tomek888.guess_number.Next_int.getInt;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Guess_a_number {

	public static void main(String[] args) {
		Random r = new Random(); 
    	int b = r.nextInt(50);
	while(true) {
		Scanner scan = new Scanner(System.in);
    	int a=getInt("Zgadnij liczbę");
    	
    	if(a<b) {
    		System.out.println("Liczba jest za mała. Podaj nową liczbę");
    	}
    	else if(a>b) {
    		System.out.println("Liczba jest za duża. Podaj nową liczbę");
    	}
    	else if(a==b) {
    		System.out.println("Wygrałeś!!");
    		break;
    	}
    	
    	
	}

	}

}
