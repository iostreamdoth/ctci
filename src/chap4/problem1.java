package chap4;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode d;
		d = new TreeNode(1);
		assignTree(d, 5);
		System.out.println(isBalanced(d));
		System.out.println("Maximum Depth " + maxdepth(d)); 
		System.out.println("Minimum Depth " + mindepth(d)); 
	}

	public static boolean isBalanced(TreeNode node) {
		
		return (maxdepth(node) - mindepth(node) <= 1);
	}

	public static int maxdepth(TreeNode node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + Math.max(maxdepth(node.left), maxdepth(node.right));
		}
	}

	public static int mindepth(TreeNode node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + Math.min(mindepth(node.left), mindepth(node.right));
		}
	}

	public static void assignTree(TreeNode node, int depth) {
		if (depth <= 0) {
			return;
		}
		System.out.println("Assign Left at depth " + depth);
		node.left = new TreeNode(depth);
		assignTree(node.left, depth - 1);
		System.out.println("Assign Right at depth " + depth);
		node.right = new TreeNode(depth);
		assignTree(node.right, depth - 1);
	}

}
