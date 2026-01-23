
public class main {

	public static void main(String[] args) {
		System.out.println("running");
		//your test code here
		RedBlackTree RBTree = new RedBlackTree();
		RBTree.insert(100);
		RBTree.insert(200);
		RBTree.insert(300);
		RBTree.insert(400);
		RBTree.insert(500);

		RBTree.insert(50);
		RBTree.insert(25);
		RBTree.insert(10);
		RBTree.insert(5);

		RBTree.printTree();
		System.out.println("Is red black tree? " + RBTree.isRedBlack());

		System.out.println("Smallest path: " + RBTree.shortestTruePath());

	}
}
