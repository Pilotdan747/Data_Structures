package trees;

public class TreeRunner {

	public static void main(String[] args) {
		// Test 1
		System.out.println("Test 1 \n");
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		
		tree.add(50);
		tree.add(10);
		tree.add(75);
		tree.add(16);
		tree.add(35);
		tree.add(45);
		tree.add(5);
		
		System.out.println("Depth");
		System.out.println("10: " + tree.depth(new BSTNode<Integer>(10)));
		System.out.println("75: " + tree.depth(new BSTNode<Integer>(75)));
		System.out.println("45: " + tree.depth(new BSTNode<Integer>(45)));
		System.out.println("50: " + tree.depth(new BSTNode<Integer>(50)));
		System.out.println("5: " + tree.depth(new BSTNode<Integer>(5)));
		System.out.println("0: " + tree.depth(new BSTNode<Integer>(0)));
		
		System.out.println("Print Leaf paths");
		tree.printPaths();
		
		BinarySearchTree<Integer> rTree = tree.reverse();
		rTree.reset(BinarySearchTree.PREORDER);
		
		System.out.println("Reversed Tree - Pre Order");
		for (int i = 0; i < rTree.size(); i++) {
			System.out.println(rTree.getNext(BinarySearchTree.PREORDER) + " ");
		}
		
		
		// Test 2
		System.out.println("\nTest 2 \n");
		BinarySearchTree<Integer> tree2 = new BinarySearchTree<Integer>();

		tree2.add(100);
		tree2.add(-20);
		tree2.add(1294786);
		tree2.add(Integer.MAX_VALUE);
		tree2.add(Integer.MIN_VALUE);
		
		System.out.println("Depth");
		System.out.println("-20: " + tree2.depth(new BSTNode<Integer>(-20)));
		//System.out.println("Integer.MAX_VALUE: " + tree2.depth(new BSTNode<Integer>(Integer.MAX_VALUE)));
		System.out.println("1294768: " + tree2.depth(new BSTNode<Integer>(1294786)));
		
		System.out.println("Print leaf Paths");
		tree2.printPaths();
		
		BinarySearchTree<Integer> rTree2 = tree2.reverse();
		rTree2.reset(BinarySearchTree.PREORDER);
		
		System.out.println("Reversed Tree - Pre Order");
		for (int i = 0; i < rTree2.size(); i++) {
			System.out.println(rTree2.getNext(BinarySearchTree.PREORDER) + " ");
		}

	}
}
