package pl.coderslab.tomek888.play_a_dice;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Dices {

	public static void main(String[] args) {
		char c;
		int a=0,y=0,z=0,loop=0;
		Random r=new Random();

		System.out.println("Podaj jaki rzut chesz wykonać w formacie xDy+z, gdzie :\n"
				+ " y – rodzaj kostek, których należy użyć (np. D6, D10)\n"
				+ " x – liczba rzutów kośćmi; jeśli rzucamy raz, ten parametr jest pomijalny\n"
				+ " z – liczba, którą należy dodać (lub odjąć) do wyniku rzutów (opcjonalnie)\n"
				+ "Typy kostek występujące w grach: D3, D4, D6, D8, D10, D12, D20, D100.");
		Scanner scan=new Scanner(System.in);
		String dices = scan.next();
		String dice;
		c=dices.charAt(0);
		if(c=='D') {            //Sprawdenie ilości rzutów
			loop=1;
			dice=dices;
		}
		else {
			loop=Character.getNumericValue(c);
			dice=dices.substring(1);
		}

		for(int i=0;i<loop;i++) {   ///Pętla wykonująca wybraną ilość rzutów
			int[] res=new int[loop];

			if( (dice.length()==2)) {   //Dla przypadku typu D2
				c=dice.charAt(1);
				y=Character.getNumericValue(c);
				a=r.nextInt(y)+1;
				res[i]=a;
			}
			else if( (dice.length()==3)) {  //Dla przypadku typu D20
				c=dice.charAt(1);
				y=Character.getNumericValue(c)*10;
				c=dice.charAt(2);
				y+=Character.getNumericValue(c);
				a=r.nextInt(y)+1;
				res[i]=a;
			}
			else if((dice.length()==4)&&(dice.charAt(3)=='0')) {  //Dla przypadku D100
				c=dice.charAt(1);
				y=Character.getNumericValue(c)*100;
				a=r.nextInt(y)+1;
				res[i]=a;
			}
			else if((dice.length()==4)&&(dice.charAt(2)=='+')) {  //Dla przypadku typu D6+8
				c=dice.charAt(1);
				y=Character.getNumericValue(c);
				c=dice.charAt(3);
				z=Character.getNumericValue(c);
				a=r.nextInt(y)+1;
				res[i]=a+z;
			}
			else if((dice.length()==4)&&(dice.charAt(2)=='-')) {  //Dla przypadku typu D6-8
				c=dice.charAt(1);
				y=Character.getNumericValue(c);
				c=dice.charAt(3);
				z=Character.getNumericValue(c);
				a=r.nextInt(y)+1;
				res[i]=a-z;
			}
			else if((dice.length()==5)&&(dice.charAt(3)=='+')){  //Dla przypadku typu D20+8
				c=dice.charAt(1);
				y=Character.getNumericValue(c)*10;
				c=dice.charAt(2);
				y+=Character.getNumericValue(c);
				c=dice.charAt(4);
				z=Character.getNumericValue(c);
				a=r.nextInt(y)+1;
				res[i]=a+z;
			}
			else if((dice.length()==5)&&(dice.charAt(3)=='-')){  //Dla przypadku typu D20-8
				c=dice.charAt(1);
				y=Character.getNumericValue(c)*10;
				c=dice.charAt(2);
				y+=Character.getNumericValue(c);
				c=dice.charAt(4);
				z=Character.getNumericValue(c);
				a=r.nextInt(y)+1;
				res[i]=a-z;
			}
			
			else if((dice.length()==6)&&(dice.charAt(4)=='+')){  //Dla przypadku typu D100+8
				c=dice.charAt(1);
				y=Character.getNumericValue(c)*100;
				a=r.nextInt(y)+1;
				c=dice.charAt(5);
				z=Character.getNumericValue(c);
				res[i]=a+z;
			}
			
			else if((dice.length()==6)&&(dice.charAt(4)=='-')){  //Dla przypadku typu D100-8
				c=dice.charAt(1);
				y=Character.getNumericValue(c)*100;
				a=r.nextInt(y)+1;
				c=dice.charAt(5);
				z=Character.getNumericValue(c);
				res[i]=a-z;
			}
			else {

			}


			System.out.println("Wynik rzutu to: "+res[i]);
		}
	}

}
