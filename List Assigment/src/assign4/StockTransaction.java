package assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StockTransaction {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Java StockTransaction");

		CompanyList companies = new CompanyList(); 				// List to hold all "stock" names
		File stocks = new File("stocks.txt");
		File transactions = new File("transactions.txt");

		Scanner input = new Scanner(stocks); 					// Scanner reading from stocks doc

		while (input.hasNext()) { 								// Read from stocks.txt - create and add company ADT to company list
			String line = input.nextLine();
			String[] words = line.split(";");					// Array of every "word" in the line

			Company c = new Company(words[0], words[1]);
			companies.addCompany(c);
		}

		input = new Scanner(transactions); 						// Switch scanner to transactions doc

		while (input.hasNext()) { 								// Read from transactions.txt - create record and add to respective company
			String line = input.nextLine();
			String words[] = line.split(";");					// Array of every "word" in the line

			String ticker = words[0];

			Record r = new Record(words[1], Integer.parseInt(words[2]), 
					Double.parseDouble(words[3].substring(1))); 

			companies.addTransaction(r, ticker);
		}

		System.out.println("--sucessfully read " + stocks.getName() + " and " + transactions);

		input = new Scanner(System.in);							// Switch scanner to console window

		while (true) { 											// Run until Escape word is entered
			System.out.print("Please enter a input stock quote for realized gain(or loss) for the stock :");
			String ticker = input.next(); 						// User entered stock
			if (ticker.equals("END")) { 						// End is escape word to end the program
				break;
			}

			int count = 0;
			DLLNode<Company> node = companies.getFirst();
			
			while (node.getInfo() != null) { 					// Run through all companies until hit trailer - info will equal null
				if (node.getInfo().getTicker().equals(ticker)) { // Ticker in company ADT equals inputed ticker
					double gains;
					try {
						gains = node.getInfo().calculateGains();
					} catch (RuntimeException e) { 				// calc gains method will throw an exception if you try and sell more shares than you have
						System.out.println("Sorry, there is an error condition associated with "
					+ node.getInfo().getName()+ " The number of sold shares exceeds the total buy quantity.");
						break; 									// Exit loop
					}
					if (gains > 0) {							 // Gains are positive
						System.out.println("Congratulations, your realized gain for " + node.getInfo().getName()
								+ " is : $" + node.getInfo().calculateGains());
						break; 									// Exit loop
					} else if (gains == 0) { 					// No gains
						System.out.println("Sorry, no realized gain(or loss) reported for " + node.getInfo().getName());
						break;
					} else { 									// Gains are negative
						System.out.println("Sorry, your realized loss for " + node.getInfo().getName() + " is : $"
								+ Math.abs(gains));  			// Abs() to get rid of the negative sign
						break; 									// Exit loop
					}
				}
				node = companies.getNext(node); 				// Get next company

				count++;

				if (count == companies.getSize()) { 			// If incremented to last company and no matches
					System.out.println("Sorry, the stock quote does not exist in the system.");
					break;										// Exit loop
				}
			}
		}
		System.out.println("Ending");
	}
}
