package assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StockTransaction {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Java StockTransaction");
		
		CompanyList companies = new CompanyList();
		File stocks = new File("stocks.txt");
		File transactions = new File("transactions.txt");
		
		Scanner input = new Scanner(stocks);
		
		while (input.hasNext()) {
			String line = input.nextLine();
			String[] words = line.split(";");
			
			Company c = new Company(words[0], words[1]);
			companies.addCompany(c);
		}
		
		input = new Scanner(transactions);
		
		while (input.hasNext()) {
			String line = input.nextLine();
			String words[]  = line.split(";");
			
			String ticker = words[0];
			
			Record r = new Record(words[1], Integer.parseInt(words[2]), Double.parseDouble(words[3].substring(1)));
			
			companies.addTransaction(r, ticker);
		}
		
		System.out.println("--sucessfully read " + stocks.getName() + " and " + transactions);
		
		input = new Scanner(System.in);
		
		System.out.print("Please enter a input stock quote for realized gain(or loss) for the stock :");
		String ticker = input.next();
		
		DLLNode<Company> node = companies.getFirst();
		while (companies.getNext(node) != null) {
			if (node.getInfo().getTicker().equals(ticker)) {
				if (node.getInfo().calculateGains() > 0) {
					System.out.println("Congratulations, your realized gain for " + node.getInfo().getName() + " is : $" + node.getInfo().calculateGains());
				} else if (node.getInfo().calculateGains() == 0) {
					System.out.println("Sorry, no realized gain(or loss) reported for " + node.getInfo().getName());
				} else {
					System.out.println("Sorry, your realized loss for " +  node.getInfo().getName() + " is : $" + node.getInfo().calculateGains());
				}
			}
			node = companies.getNext(node);
		}
		
		System.out.println("Ending");
	}
}
