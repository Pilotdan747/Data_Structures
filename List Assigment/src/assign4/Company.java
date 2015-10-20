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
				int sellShares = node.getInfo().getShares();

				DLLNode<Record> sellNode = sells.getFirst();

				while (sellShares > 0) {
					int tempShares = sellNode.getInfo().getShares();

					if (sellShares > tempShares) {
						gains += (sellShares * node.getInfo().getPricePerShare() - sellShares * sellNode.getInfo().getPricePerShare());
						sellShares -= tempShares;
						sells.remove();
					} else {
						gains += (sellShares * node.getInfo().getPricePerShare() - sellShares * sellNode.getInfo().getPricePerShare());
						tempShares -= sellShares;
						sellShares = 0;
						sellNode.getInfo().setShares(tempShares);
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
