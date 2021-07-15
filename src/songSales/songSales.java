package songSales;

public class songSales {
	
	//link identifier
	static songSales_sub a = new songSales_sub();

	public static void main(String[] args) {
		
		System.out.print("Enter the Title of the Song: ");
		a.title = a.in.nextLine();
		
		System.out.print("Enter the Exact Purchase Price of the Song: ");
		a.price = a.in.nextDouble();

		System.out.print("Enter the Number of Song Copies Sold: ");
		a.quan = a.in.nextInt();
		
		a.Compute();
		a.Display();
	}
}