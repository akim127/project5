/*
 * Name: Alexander Jaemin Kim
 * Professor Eivazi
 * CMSC 204-32453
 * Due Date: 4/22/25
 * Class: TreeNode
 */

public class TreeNode <T> {
	private T data;
	private TreeNode<T> left;
	private TreeNode<T> right;
	
	/*
	 * creates treeNode using dataNode
	 */
	TreeNode(T dataNode) {
		data = dataNode;
		left = null;
		right = null;
	}
	
	/*
	 * copy constructor
	 */
	TreeNode(TreeNode<T> node) {
		data = node.data;
		left = node.left;
		right = node.right;
	}

	/*
	 * returns data of TreeNode
	 */
	public T getData() {
		return data;
	}
}
