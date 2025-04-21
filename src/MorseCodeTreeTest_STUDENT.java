/*
 * Alexander Jaemin Kim
 * Professor Eivazi
 * CMSC 204-32453
 * Due Date: 4/22/25
 * Class: MorseCodeTreeTest_STUDENT
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MorseCodeTreeTest_STUDENT {

	private MorseCodeTree myTree;
	
    @BeforeEach
    void setUp() throws Exception {
    	myTree = new MorseCodeTree();
    	myTree.buildTree();
    }

    @AfterEach
    void tearDown() throws Exception {
    	myTree = null;
    }

    @Test
    void testGetRoot() {
        TreeNode<String> root = myTree.getRoot();
        assertEquals("", root.getData());
    }

    @Test
    void testSetRoot() {
    	TreeNode<String> newRoot = new TreeNode<>("a");
    	myTree.setRoot(newRoot);
    	assertEquals(newRoot, myTree.getRoot());
    }

    @Test // Test case for method addNode(TreeNode<String> root, String code, String
	  // letter)
    void testAddNodePassingRoot() {
	fail("Not yet implemented");
    }

    @Test
    void testBuildTree() {
    	//with 1
		assertEquals("e", myTree.fetchLetter(myTree.getRoot(), "."));
		
		//with 2
		assertEquals("i", myTree.fetchLetter(myTree.getRoot(), ".."));
		
		//with 3
		assertEquals("r", myTree.fetchLetter(myTree.getRoot(), ".-."));

		//with 4
		assertEquals("z", myTree.fetchLetter(myTree.getRoot(), "--.."));
    }

    @Test
    void testFetchLetter() {
	fail("Not yet implemented");
    }

    @Test
    void testToArrayList() {
	fail("Not yet implemented");
    }

    @Test
    void testPrintTree() {
	fail("Not yet implemented");
    }

}
