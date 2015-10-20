package inClassAssigments;

public class DLinkedTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		DNode BOS = new DNode("BOS");
		DNode ATL = new DNode("ATL");
		DNode AMD = new DNode("AMD");
		DList dLinkedList = new DList();
		dLinkedList.addFirst(BOS);
		dLinkedList.addFirst(ATL);
		dLinkedList.addFirst(AMD);
		System.out.print(dLinkedList);
		*/
		
		DList list = new DList();
		list.push("737");
		list.push("747");
		list.push("767");
		
		System.out.println(list.toString());
		
		list.pop();
		
		System.out.println(list.toString());
		
		list.push("757");
		list.push("747");
		list.push("747");
		
		System.out.println(list.toString());
		
		list.removeDuplicates();
		
		System.out.println(list.toString());
		
		for (int i = 0; i < list.size; i++) {
			list.pop();
		}
		
		for (int i = 0; i < 10; i ++) {
			list.push("737");
		}
		
		for (int i = 0; i < 7; i ++) {
			list.push("747");
		}
		
		list.push("757");
		
		System.out.println(list);
		
		list.removeDuplicatesForSortedList();
		
		System.out.println(list);
	}

}