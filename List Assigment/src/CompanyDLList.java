
public class CompanyDLList {

	private DLLNode header;
	private DLLNode trailer;
	private int size;
	
	public CompanyDLList() {
		header = new DLLNode<Company>(null);
		trailer = new DLLNode<Company>(null);
		
		header.setLink(trailer);
		trailer.setBack(header);
		size = 0;
	}
	
	public void add(Company stuff) {
		DLLNode<Company> node = new DLLNode<Company>(stuff);
		if (size == 0) {
			trailer.setBack(node);
			header.setLink(node);
			node.setLink(trailer);
			node.setBack(header);
		} else {
			node.setLink(trailer);
			node.setLink(trailer.getBack());
			trailer.setBack(node);
		}
		
		size++;
	}
}
