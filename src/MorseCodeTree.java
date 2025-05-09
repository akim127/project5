/*
 * Alexander Jaemin Kim
 * Professor Eivazi
 * CMSC 204-32453
 * Due Date: 4/22/25
 * Class: MorseCodeTree
 */

import java.util.ArrayList; 

public class MorseCodeTree {
	private TreeNode<String> root;
	
	/*
	 * initializes root to null
	 */
	public MorseCodeTree() {
		root = new TreeNode<>("");
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
		//base
		if (code.length() == 1) {
			if (code.equals(".")) {
				root.left = new TreeNode<>(letter);
			}
			else if (code.equals("-")) {
				root.right = new TreeNode<>(letter);
			}
		}
		
		//recursive
		if (code.length() > 1) {
			if (code.charAt(0) == '.') {
				if (root.left == null) {
					root.left = new TreeNode<>(letter);
				}
				addNode(root.left, code.substring(1), letter);
			}
			if (code.charAt(0) == '-') {
				if (root.right == null) {
					root.right = new TreeNode<>(letter);
				}
				addNode(root.right, code.substring(1), letter);
			}
		}
	}
	
	/*
	 * for buildTree
	 */
	public void addNode(String code, String letter) {
		addNode(root, code, letter);
	}
	
	/*
	 * builds full morse code tree
	 */
	public void buildTree() {
		//1 blink
		addNode(".", "e");
		addNode("-", "t");
		
		//2 blinks
		addNode("..", "i");
		addNode(".-", "a");
		addNode("-.", "n");
		addNode("--", "m");
		
		//3 blinks
		addNode("...", "s");
		addNode("..-", "u");
		addNode(".-.", "r");
		addNode(".--", "w");
		addNode("-..", "d");
		addNode("-.-", "k");
		addNode("--.", "g");
		addNode("---", "o");
		
		//4 blinks
		addNode("....", "h");
		addNode("...-", "v");
		addNode("..-.", "f");
		addNode(".-..", "l");
		addNode(".--.", "p");
		addNode(".---", "j");
		addNode("-...", "b");
		addNode("-..-", "x");
		addNode("-.-.", "c");
		addNode("-.--", "y");
		addNode("--..", "z");
		addNode("--.-", "q");		
	}
	
	/*
	 * gets letter from code
	 */
	public String fetchLetter(TreeNode<String> root, String code) {
		//base
		if (code.length() == 0) {
			return root.getData();
		}
		
		//recursive
		if (code.charAt(0) == '.') {
			return fetchLetter(root.left, code.substring(1));
		}
		else {
			return fetchLetter(root.right, code.substring(1));
		}
	}
	
	/*
	 * adds tree contents to list (inorder)
	 */
	public void traverseInOrder(TreeNode<String> root, ArrayList<String> list) {
		if (root.left != null) {
			traverseInOrder(root.left, list);
		}
		
		if (!root.getData().equals("")) {
			list.add(root.getData());
		}
		
		if (root.right != null) {
			traverseInOrder(root.right, list);
		}
	}
	
	/*
	 * returns list of inorder traversal
	 */
	public ArrayList<String> toArrayList() {
		ArrayList<String> myList = new ArrayList<>();
		
		traverseInOrder(root, myList);
		return myList;
	}
	
	/*
	 * returns string of inorder traversal
	 */
	public String printTree() {
		ArrayList<String> myList = toArrayList();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < myList.size(); i++) {
			sb.append(myList.get(i));
	        if (i < myList.size() - 1) {
	        	sb.append(" ");
	        }
		}
		
		return sb.toString();
	}
}
