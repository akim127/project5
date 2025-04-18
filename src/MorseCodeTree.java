/*
 * Name: Alexander Jaemin Kim
 * Professor Eivazi
 * CMSC 204-32453
 * Due Date: 4/22/25
 * Class: MorseCodeTree
 */

public class MorseCodeTree {
	private TreeNode<String> root;
	
	/*
	 * initializes root to null
	 */
	public MorseCodeTree() {
		root = new TreeNode<>(null);
	}
	
	/*
	 * returns root of MorseCodeTree
	 */
	public TreeNode<String> getRoot() {
		return root;
	}
	
	/*
	 * sets root of given TreeNode
	 */
	public void setRoot(TreeNode<String> newNode) {
		root = newNode;
	}
	
	/*
	 * adds letter to tree from morse code
	 */
	public void addNode(TreeNode<String> root, String code, String letter) {

	}
	
}
