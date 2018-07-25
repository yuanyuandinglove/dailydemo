package thisone;

public class Solution {
	 public static void main(String[] args){
		
		 String s[] = new String[10];
		 int a[] = new int[9];
		 System.out.println(a[0]+a.length+"/____"+s[0]+s.length);
	 }
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val) {
				result = Checknext(root1, root2);
			}
			if (!result) {
				result = HasSubtree(root1.left, root2);
			}
			if (!result) {
				result = HasSubtree(root1.right, root2);
			}
		}
		return result;
	}

	public boolean Checknext(TreeNode root1, TreeNode root2) {
		if (root2 == null)
			return true;
		if (root1 == null)
			return false;
		if (root1.val != root2.val)
			return false;
		return Checknext(root1.left, root2.left)
				&& Checknext(root1.right, root2.right);
	}

	public boolean HasSubtree1(TreeNode root1, TreeNode root2) {
		boolean re = false;
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val) {
				re = Check1(root1, root2);

			}
			if (re == false) {
				re = HasSubtree1(root1.left, root2);
			}
			if (re == false) {
				re = HasSubtree1(root1.right, root2);

			}

		}

		return re;
	}

	public boolean Check1(TreeNode root1, TreeNode root2) {
		if (root1 == null) {
			return false;
		}
		if (root2 == null) {
			return true;
		}
		if (root1.val != root2.val) {
			return false;
		}
		return Check1(root1.left, root2.left)
				&& Check1(root1.right, root2.right);

	}

}