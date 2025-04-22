/*
 * Alexander Jaemin Kim
 * Professor Eivazi
 * CMSC 204-32453
 * Due Date: 4/22/25
 * Class: MorseCodeTreeTest_STUDENT
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

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
    	 MorseCodeTree tree = new MorseCodeTree();
         TreeNode<String> myRoot = new TreeNode<>("");
         
         tree.addNode(myRoot, "--.", "g");

         assertEquals("g", myRoot.right.right.left.getData());
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
    	//using 1
    	assertEquals("e", myTree.fetchLetter(myTree.getRoot(), "."));
    	
    	//testing with 2
        assertEquals("m", myTree.fetchLetter(myTree.getRoot(), "--"));

        //with 3
        assertEquals("k", myTree.fetchLetter(myTree.getRoot(), "-.-"));

        //with 4
        assertEquals("z", myTree.fetchLetter(myTree.getRoot(), "--.."));
    }

    @Test
    void testToArrayList() {
    	ArrayList<String> myList = myTree.toArrayList();
        assertTrue(myList.contains("a"));
        assertTrue(myList.contains("m"));
        assertTrue(myList.contains("z"));
        assertEquals(26, myList.size());
    }

    @Test
    void testPrintTree() {
        String inorder = "h s v i f u e l r a p w j b d x n c k y t z g q m o";
        assertEquals(inorder, myTree.printTree());
    }

}
