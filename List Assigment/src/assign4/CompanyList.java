package assign4;

public class CompanyList {

	DLLNode<Company> header;
	DLLNode<Company> trailer;
	int size;
	
	public CompanyList() {
		header = new DLLNode<Company>(null);
		trailer = new DLLNode<Company>(null);
		
		header.setLink(trailer);
		trailer.setBack(header);
		
		size = 0;
	}
	
	public void addCompany(Company c) {
		
	}
}
