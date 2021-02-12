package Hw4;

import java.util.Random;

public class Driver {

	public static void main(String[] args)
	{
		Random r = new Random();
		int y;
		
		int x=6;
		y = r.nextInt(x)+1;
		System.out.println("The six sided die rolle a " + y);
		
		int x2 = 8;
		y = r.nextInt(x2)+1;
		System.out.println("The eight sided die rolled a " + y);
		
}
