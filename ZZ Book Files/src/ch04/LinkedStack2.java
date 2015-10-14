
package ch04;
//----------------------------------------------------------------------

// LinkedStack2.java         by Dale/Joyce/Weems               Chapter 4
//
// Extends LinkedStack with a printReversed method.
//----------------------------------------------------------------------

import ch03.stacks.LinkedStack;
import support.LLNode;

public class LinkedStack2<T> extends LinkedStack<T> {
    public void printReversed() {
	revPrint(top);
    }

    private void revPrint(LLNode<T> listRef) {
	if (listRef != null) {
	    revPrint(listRef.getLink());
	    System.out.println(" " + listRef.getInfo());
	}
    }
}
