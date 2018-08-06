package Section01;

import java.util.Scanner;

public class Code04 {

	public static void main(String[] args) {
		String name = null;
		int age;
		String gender;
		
		Scanner keyboard = new Scanner(System.in);
		
		name = keyboard.next();
		age = keyboard.nextInt();
		gender = keyboard.next();
		
		keyboard.close();
		
		if(gender.equals("male"))
			System.out.println(name+", you're"+age+" years old man.");
		else if(gender.equals("female"))
			System.out.println(name+",you're"+age+"years old woman.");
		else
			System.out.println("wow... you're ?????"); //wow

	}

}
