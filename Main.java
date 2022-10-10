/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
		System.out.println("Calculator Price");
		double Sum = 0;
		int i=1;
		
		while(i<=10){
		    System.out.println("Please insert the price for item "+ Integer.toString(i) + ": " );
            Scanner myObj = new Scanner(System.in);
		    String ItemPrice = myObj.nextLine();
		    if (ItemPrice.isEmpty()) {
		        ItemPrice = "0";
		    }
		    Double ItemPrices = Double.parseDouble(ItemPrice);
		    Sum = Sum + ItemPrices;
		    i++;
		}
		System.out.println("The total price of " + Integer.toString(i) +" item is " + Double.toString(Sum) + ".");
	}
}
