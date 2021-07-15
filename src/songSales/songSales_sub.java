package songSales;

import java.util.Scanner;

public class songSales_sub {

	//variables
	public String title;
	double price;
	int quan;
	double rev,manCom,siteCom;
	
	//identifier
	public Scanner in = new Scanner (System.in);
	
	//methods
	public void Compute() {
		rev = price*quan;
		manCom = rev*0.12;
		siteCom = rev*0.03;
	}
	
	public void Display() {
		System.out.println("\nTotal Revenue: " + rev);
		System.out.println("Manager's Commission: " + manCom);
		System.out.println("Internet Site's Commission: " + siteCom);
	}
}