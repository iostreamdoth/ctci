package misc;

import misc.TreeNode;

public class amazonsolvebstmaxdepth {

	public static void main(String[] args) {
		TreeNode d = new TreeNode(1);
		assignTree(d, 5);
		System.out.println((minDepth(d,0))[1]);

		// TODO Auto-generated method stub

	}

	public static int[] minDepth(TreeNode node, int depth) {
		int[] retval = new int[2];
		if (node == null) {
			retval[0] = depth;
			retval[1] = 0;
			return retval;
		} else {
			int[] leftpath = minDepth(node.left, depth + 1);
			int[] rightpath = minDepth(node.left, depth + 1);
			if (leftpath[0] > rightpath[0]) {
				retval[0] = depth;
				retval[1] = (int)node.data + leftpath[1];
				return retval;
			}
			if (rightpath[0] > leftpath[0]) {
				retval[0] = depth;
				retval[1] = (int)node.data +  rightpath[1];
				return retval;
			}
			if (rightpath[0] == leftpath[0]) {
				if (leftpath[1] > rightpath[1]) {
					retval[0] = depth;
					retval[1] = (int)node.data +  rightpath[1];
					return retval;
				} else {
					retval[0] = depth;
					retval[1] = (int)node.data +  rightpath[1];
					return retval;
				}
			}
		}

		return retval;
	}

	public static void assignTree(TreeNode node, int depth) {
		if (depth <= 0) {
			return;
		}
		//System.out.println("Assign Left at depth " + depth);
		node.left = new TreeNode(3*depth);
		assignTree(node.left, depth - 1);
		//System.out.println("Assign Right at depth " + depth);
		node.right = new TreeNode(2*depth);
		assignTree(node.right, depth - 1);
	}
}
