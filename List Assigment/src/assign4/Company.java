package assign4;

public class Company {

	private String ticker;
	private String name;
	private TransactionList transactions;

	public Company(String ticker, String name) {
		this.ticker = ticker;
		this.name = name;

		transactions = new TransactionList();
	}

	public void addTransaction(Record r) {
		transactions.add(r);
	}

	public double calculateGains() {
		double gains = 0;

		TransactionList sells = new TransactionList();
		DLLNode<Record> node = transactions.getFirst();

		while (node != null) {
			if (node.getInfo().getBuyOrSell().equals("buy")) {
				sells.add(node.getInfo());
			} else {
				int sharesToSell = node.getInfo().getShares();

				DLLNode<Record> buyNode = sells.getFirst();
				if (buyNode.getInfo() == null) {
					throw new RuntimeException();
				}

				while (sharesToSell > 0) {
					int tempShares = buyNode.getInfo().getShares();

					if (sharesToSell > tempShares) {
						gains += (tempShares * node.getInfo().getPricePerShare() - tempShares * buyNode.getInfo().getPricePerShare());
						sharesToSell -= tempShares;
						buyNode = sells.getNext(buyNode);
						sells.remove();
					} else {
						gains += (sharesToSell * node.getInfo().getPricePerShare() - sharesToSell * buyNode.getInfo().getPricePerShare());
						tempShares -= sharesToSell;
						sharesToSell = 0;
						buyNode.getInfo().setShares(tempShares);
					}
				}
			}
			
			node = transactions.getNext(node);
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
		return transactions.toString();
	}
}
