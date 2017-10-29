package pl.coderslab.tomek888.guess_number_2;
import static pl.coderslab.tomek888.guess_number.Next_int.getInt;

import static pl.coderslab.tomek888.guess_number.Next_int.getInt;

import java.util.Scanner;

public class Guess_a_number_2 {

	public static void main(String[] args) {
		System.out.println("Pomyśl liczbę od 0 do 1000 a ja ją odgadne w maksymalnie 10 próbach");
		int min=0, max=1000;
		
		for(int i=0;i<10;i++) {
		int guess=(max-min)/2+min;
		System.out.println("Zgaduję: "+guess);
		Scanner scan = new Scanner(System.in);
    	int a=getInt("Wpiysz jedną z komend: 1-większa liczba, 2-mniejsza liczba, 3-zgadłęś");
    	if(a==1) {
    		min=guess;
    	}
    	else if(a==2) {
    		max=guess;
    	
		}
    	else if(a==3){
    		System.out.println("Wygrałem");
    		break;
    	}else {
    		System.out.println("Oszukujesz");
    	}

	}

}
}