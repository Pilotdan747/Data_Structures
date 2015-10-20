package assign4;

public class TransactionList {

	DLLNode<Record> header;
	DLLNode<Record> trailer;
	int size;
	
	public TransactionList() {
		header = new DLLNode<Record>(null);
		trailer = new DLLNode<Record>(null);
		
		header.setLink(trailer);
		trailer.setBack(header);
		
		size = 0;
	}
	
	public void add(Record r) {
		
		DLLNode<Record> node = new DLLNode<Record>(r);
		
		if (size == 0) {
			header.setLink(node);
			trailer.setBack(node);
			
			node.setBack(header);
			node.setLink(trailer);
		} else {
			DLLNode<Record> back = trailer.getBack();
			
			node.setBack(back);
			node.setLink(trailer);
			
			trailer.setBack(node);
			back.setLink(node);
		}
		size++;
	}
	
	public void remove() {
		if (size == 0) {
			throw new QueueUnderflowException();
		} else if (size == 1){
			header.setLink(trailer);
		} else {
			header.setLink(header.getLink().getLink());
			((DLLNode<Record>) header.getLink()).setBack(header);
		}
		size --;
	}
	
	public String toString() {
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
		if ((DLLNode<Record>)n.getLink() == trailer) {
			return null;
		}
		
		return (DLLNode<Record>) n.getLink();
	}

}
