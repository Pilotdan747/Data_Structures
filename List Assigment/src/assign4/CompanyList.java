package assign4;

public class CompanyList {

	private DLLNode<Company> header;
	private DLLNode<Company> trailer;
	private int size;

	public CompanyList() { 										// Initializes Fields
		header = new DLLNode<Company>(null);
		trailer = new DLLNode<Company>(null);

		header.setLink(trailer);
		trailer.setBack(header);

		size = 0;
	}

	public int getSize() {
		return size;
	}

	public void addCompany(Company c) {
		DLLNode<Company> node = new DLLNode<Company>(c);

		if (size == 0) { 										// If no other nodes add
			header.setLink(node);
			trailer.setBack(node);

			node.setBack(header);
			node.setLink(trailer);
		} else { 												// If other nodes, add to end
			DLLNode<Company> temp = trailer.getBack();

			node.setLink(trailer);
			node.setBack(temp);

			temp.setLink(node);
			trailer.setBack(node);
		}

		size++;
	}

	public void addTransaction(Record r, String ticker) {
		DLLNode<Company> node = header;

		while (((DLLNode<Company>) node.getLink()) != trailer) { // Run through list until find company
			node = (DLLNode<Company>) node.getLink(); 			// Get next node

			if (node.getInfo().getTicker().equals(ticker)) { 	// If node is the right one, add the record
				node.getInfo().addTransaction(r);
			}
		}
	}

	public double calcGains(DLLNode<Company> node) {
		return node.getInfo().calculateGains();
	}

	public DLLNode<Company> getFirst() { 
		return (DLLNode<Company>) header.getLink();
	}

	public DLLNode<Company> getNext(DLLNode<Company> n) {
		if ((DLLNode<Company>) n.getLink() == trailer) {
			return null; 										// If there is not a next return null
		}

		return (DLLNode<Company>) n.getLink();
	}
}
