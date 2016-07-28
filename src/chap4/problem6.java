package chap4;

import java.util.ArrayList;
import java.util.List;




public class problem6 {
	
	public static List<TreeNode> n = new ArrayList<TreeNode>();
	public static int depthofTree = 5;
	public static void main(String[] args) {
		TreeNode root=  new TreeNode(4);
		createTree(root,0);
		
		TreeNode node1 = n.get(2);
		TreeNode node2 = n.get(12);
		
		
	}
	
	public static void createTree(TreeNode root,int depth)
	{
		if(depth==depthofTree)
		{
			return;
		}
		
		root.left = new TreeNode(depth);
		root.right = new TreeNode(depth+100);
		n.add(root.left);
		n.add(root.right);
	}
}
