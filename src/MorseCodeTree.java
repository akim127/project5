/*
 * Name: Alexander Jaemin Kim
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
				addNode(root, code.substring(1), letter);
			}
			if (code.charAt(0) == '-') {
				if (root.right == null) {
					root.right = new TreeNode<>(letter);
				}
				addNode(root, code.substring(1), letter);
			}
		}
	}
	
	public void addNode(String code, String letter) {
		addNode(root, code, letter);
	}
	
	/*
	 * builds full morse code tree
	 */
	public void buildTree() {
		
	}
	
	/*
	 * gets letter from code
	 */
	public String fetchLetter(TreeNode<String> root, String code) {
		return null;
	}
	
	/*
	 * adds tree contents to list (inorder)
	 */
	public void traverseInOrder(TreeNode<String> root, ArrayList<String> list) {
		
	}
	
	/*
	 * returns list of inorder traversal
	 */
	public ArrayList<String> toArrayList() {
		return null;
	}
	
	/*
	 * returns string of inorder traversal
	 */
	public String printTree() {
		return null;
	}
}
