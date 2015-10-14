package ch04;

public class UseStack3 {
    public static void main(String[] args) {
	LinkedStack3<String> myStack3 = new LinkedStack3<String>();
	myStack3.push("first");
	myStack3.push("second");
	myStack3.push("third");
	myStack3.push("fourth");
	myStack3.printReversed();
    }
}