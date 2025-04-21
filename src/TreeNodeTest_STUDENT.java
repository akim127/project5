/*
 * Alexander Jaemin Kim
 * Professor Eivazi
 * CMSC 204-32453
 * Due Date: 4/22/25
 * Class: TreeNodeTest_STUDENT
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeNodeTest_STUDENT {

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test // Test case for TreeNode(T dataNode) constructor
    void testTreeNodePassingData() {
    	TreeNode<String> myNode = new TreeNode<>("z");
    	assertEquals("z", myNode.getData());
    }

    @Test // Test case for TreeNode(TreeNode<T> node) constructor
    void testCopyTreeNode() {
    	TreeNode<String> myNode = new TreeNode<>("z");
    	TreeNode<String> copy = new TreeNode<>(myNode);
    	assertEquals("z", copy.getData());
    }

    @Test
    void testGetData() {
		TreeNode<String> myNode = new TreeNode<>("z");
		assertEquals("z", myNode.getData());
    }

}
