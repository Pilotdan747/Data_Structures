package ch04;

public class UseStack2 {
    public static void main(String[] args) {
	LinkedStack2<String> myStack2 = new LinkedStack2<String>();
	myStack2.push("first");
	myStack2.push("second");
	myStack2.push("third");
	myStack2.push("fourth");
	myStack2.printReversed();
    }
}