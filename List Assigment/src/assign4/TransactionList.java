package assign4;

public class TransactionList {

	DLLNode<Record> header;
	DLLNode<Record> trailer;
	int size;
	
	public TransactionList() { 									// Initializes Fields
		header = new DLLNode<Record>(null);
		trailer = new DLLNode<Record>(null);
		
		header.setLink(trailer);
		trailer.setBack(header);
		
		size = 0;
	}
	
	public void add(Record r) {
		
		DLLNode<Record> node = new DLLNode<Record>(r);
		
		if (size == 0) {										 // Empty List
			header.setLink(node);
			trailer.setBack(node);
			
			node.setBack(header);
			node.setLink(trailer);
		} else { 												// Non empty list - add to back
			DLLNode<Record> back = trailer.getBack();
			
			node.setBack(back);
			node.setLink(trailer);
			
			trailer.setBack(node);
			back.setLink(node);
		}
		size++;
	}
	
	public void remove() {
		if (size == 0) { 										// Cannot remove on empty list
			throw new QueueUnderflowException();
		} else if (size == 1){
			header.setLink(trailer);
		} else { 												// Remove first element
			header.setLink(header.getLink().getLink());
			((DLLNode<Record>) header.getLink()).setBack(header);
		}
		size --;
	}
	
	public String toString() { 									// Long string of all records in list
		String s = " ";
		DLLNode<Record> node = header;
		
		while (node.getLink() != trailer) {
			node = (DLLNode<Record>)node.getLink();
			
			s = s + node.getInfo().toString();
		}
		
		return s;
	}
	
	public DLLNode<Record> getFirst() {
		return (DLLNode<Record>) header.getLink();
	}
	
	public DLLNode<Record> getNext(DLLNode<Record> n) {
		if ((DLLNode<Record>)n.getLink() == trailer) { 			// If there is not a next return null
			return null;
		}
		
		return (DLLNode<Record>) n.getLink();
	}

}
