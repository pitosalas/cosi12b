package solution.test;

import static org.junit.Assert.*;

import org.junit.Test;
import solution.FinalExam;
import solution.ListNode;
import solution.TreeNode;

public class FinalExamTest {	

	private FinalExam solution = new FinalExam();

	@Test
	public void testSymmetric() {		
		TreeNode root = new TreeNode(2);
		TreeNode n11 = new TreeNode(2);
		TreeNode n12 = new TreeNode(2);
		
		root.left = n11;
		root.right = n12;
		
		assertTrue(solution.isSymmetric(root));
	}
	
	@Test
	public void testNotSymmetric() {
		
		TreeNode root = new TreeNode(2);
		TreeNode n11 = new TreeNode(2);
		TreeNode n12 = new TreeNode(3);
		
		root.left = n11;
		root.right = n12;
		
		assertTrue(!solution.isSymmetric(root));
	}
	
	@Test
	public void testRotation() {
		
		ListNode head = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		
		head.next = l2;
		l2.next = l3;
		l3.next = null;
	
		ListNode newHead = solution.rotateRight(head, 1);
		assertEquals(newHead.val, 3);
		assertEquals(newHead.next.val, 1);
		assertEquals(newHead.next.next.val, 2);
		assertEquals(newHead.next.next.next, null);
				
	}
}
