package assign4;

public class Company {

	private String ticker; 										// Abbreviated name of company i.e. Apple's is AAPL
	private String name;
	private TransactionList transactions; 						// Holds records for this company

	public Company(String ticker, String name) { 				// Initializes fields
		this.ticker = ticker;
		this.name = name;

		transactions = new TransactionList();
	}

	public void addTransaction(Record r) {
		transactions.add(r);
	}

	public double calculateGains() {
		double gains = 0;

		TransactionList buys = new TransactionList(); 			// Holds all buy nodes
		DLLNode<Record> node = transactions.getFirst();

		while (node != null) { 									// Runs through all records
			if (node.getInfo().getBuyOrSell().equals("buy")) {	// If buy add to buys list
				Record r = new Record(node.getInfo().getBuyOrSell(), 
						node.getInfo().getShares(), node.getInfo().getPricePerShare());
				buys.add(r);
			} else { 											// Sell off shares
				int sharesToSell = node.getInfo().getShares(); 	// How many you want to sell

				DLLNode<Record> buyNode = buys.getFirst(); 		// Holds current record
				if (buyNode.getInfo() == null) { 				// Runs through buys list
					throw new RuntimeException(); 				// If node gets to trailer, sell with no buys
				}

				while (sharesToSell > 0) { 						// while there are shares to sell
					int tempShares = buyNode.getInfo().getShares(); // Shares in current record

					if (sharesToSell > tempShares) { 			// if there are more shares to sell than in current node
						gains += (tempShares * node.getInfo().getPricePerShare()
								- tempShares * buyNode.getInfo().getPricePerShare()); // Gains = difference of shares when bought and shares when sold
						sharesToSell -= tempShares; 			// Subtract shares sold
						buyNode = buys.getNext(buyNode); 		// Get next node
						buys.remove();							// Removes node of shares just sold
					} else { 									// If there are more shares in the buy than you want to sell
						gains += (sharesToSell * node.getInfo().getPricePerShare()
								- sharesToSell * buyNode.getInfo().getPricePerShare()); // Gains is same as above
						tempShares -= sharesToSell; 			// Subtract shares from shares originally in buy sold
						sharesToSell = 0;
						buyNode.getInfo().setShares(tempShares); // Set shares in node to new value
					}
				}
			}

			node = transactions.getNext(node); 					// get next buy
		}

		return gains;
	}

	public String getName() {
		return name;
	}

	public String getTicker() {
		return ticker;
	}

	public String toTransactionString() {
		return transactions.toString(); 						// Returns a list of all transactions in company - debugging
	}
}
