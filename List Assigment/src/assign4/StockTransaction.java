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
			String words[] = line.split(";");

			String ticker = words[0];

			Record r = new Record(words[1], Integer.parseInt(words[2]), Double.parseDouble(words[3].substring(1)));

			companies.addTransaction(r, ticker);
		}

		System.out.println("--sucessfully read " + stocks.getName() + " and " + transactions);

		input = new Scanner(System.in);

		while (true) {
			System.out.print("Please enter a input stock quote for realized gain(or loss) for the stock :");
			String ticker = input.next();
			if (ticker.equals("END")) {
				break;
			}

			DLLNode<Company> node = companies.getFirst();
			while (node.getInfo() != null) {
				if (node.getInfo().getTicker().equals(ticker)) {
					double gains;
					try {
						gains = node.getInfo().calculateGains();
					} catch (RuntimeException e) {
						System.out
								.println("Sorry, there is an error condition associated with" + node.getInfo().getName()
										+ "The number of sold shares exceeds the total buy quantity.");
						return;
					}
					if (gains > 0) {
						System.out.println("Congratulations, your realized gain for " + node.getInfo().getName()
								+ " is : $" + node.getInfo().calculateGains());
					} else if (gains == 0) {
						System.out.println("Sorry, no realized gain(or loss) reported for " + node.getInfo().getName());
					} else {
						System.out.println("Sorry, your realized loss for " + node.getInfo().getName() + " is : $"
								+ Math.abs(gains));
					}
				}
				node = companies.getNext(node);

				if (companies.getNext(node) == null && (node.getInfo().equals(ticker))) {
					System.out.println("Sorry, the stock quote does not exist in the system.");
				}

			}
		}
		System.out.println("Ending");
	}
}
