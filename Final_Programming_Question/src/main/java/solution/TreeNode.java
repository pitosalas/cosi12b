package solution;

/*  You should not change anything in this class
 * 
 */

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(int x, TreeNode l, TreeNode r) { 
		val = x;
		left = l;
		right = r;
	}
	
	public TreeNode(int x) { 
		this(x, null, null);
	}
}
