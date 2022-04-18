public class preorderTraversal {
  // LEETCODE _ 144 EASY
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            preorder(root , ans);
            return ans;
        }
        public static void preorder(TreeNode root , List<Integer> ans){
            if(root == null){
                return;
            }
            ans.add(root.val);
            preorder(root.left , ans);
            preorder(root.right , ans);
        }

}
