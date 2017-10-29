package pl.coderslab.tomek888.lotto;

import static pl.coderslab.tomek888.guess_number.Next_int.getInt;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		int[]n=new int[6];
		int count=0;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<6;i++) {
			n[i]=getInt("Podaj "+(i+1) +" liczbę z zakresu 1-49");
			while(true) {

			
			while(n[i]<1) {
				System.out.println("Liczba jest za mała");
				n[i]=getInt("Podaj "+(i+1) +" liczbę z zakresu 1-49");
			}
			while(n[i]>49) {
				System.out.println("Liczba jest za duża");
				n[i]=getInt("Podaj "+(i+1) +" liczbę z zakresu 1-49");
			}
			for(int j=0;j<i;j++) {
				while(n[i]==n[j]) {
					System.out.println("Podałeś już tą liczbę");
					n[i]=getInt("Podaj "+(i+1) +" liczbę z zakresu 1-49");

				}
			}
			if((n[i]>1)&&(n[i]<50)) {
			break;
			}
		}
		}
		Arrays.sort(n);
		for(int k=0;k<6;k++) {
			System.out.print(n[k]+" ");
		}
		System.out.println();
	
		Integer[] arr = new Integer[49];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
//		System.out.println(Arrays.toString(arr));
		Collections.shuffle(Arrays.asList(arr));
//		System.out.println(Arrays.toString(arr));
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
			if(n[i]==arr[j]) {
				count++;
			}
			}
			
		}
		if(count==6) {
			System.out.println("Zostałeś Milionerem");
		}
		else{
			System.out.println("Trafiłeś: "+count);
		
		}




	}

}