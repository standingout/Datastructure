package Section01;

import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		String str = "Hello, world";
		String input = null;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please type a string : ");
		
		input = keyboard.next();
		
		if(str.equals(input)) {
			System.out.println("Strings match:-)");	
		}
		else {
			System.out.println("Strings do not match!:-(");
		}
		

	}

}
