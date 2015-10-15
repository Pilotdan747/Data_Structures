import java.util.Scanner;

public class StockTransaction {

	public static void main(String[] args) {
		Scanner stocks = new Scanner("stocks.txt");
		Scanner transaction = new Scanner("transactions.txt");

		DLList<Company> companies = new DLList<Company>();
		
		while (stocks.hasNext()) {
			String line = stocks.nextLine();
			String[] words = line.split(";");
			
			Company c = new Company(words[1], words[0]);
			companies
		}
	}
}
