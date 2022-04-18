public class nodeToRoot {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
    
    public ArrayList<TreeNode> nodeToRoot(TreeNode root , int data){
        if(root == null){
            return new ArrayList<>();
        }
        
        if(root.val == data){
            ArrayList<TreeNode> base = new ArrayList<>();
            base.add(root);
            return base;
        }
        
        ArrayList<TreeNode> leftAns = nodeToRoot( root.left , data);
        if(leftAns.size() > 0){
            leftAns.add(root);
            return leftAns;
        }
        
        ArrayList<TreeNode> rightAns = nodeToRoot(root.right , data);
        if(rightAns.size() > 0){
            rightAns.add(root);
            return rightAns;
        }
        
        return new ArrayList<>();
    }
    
    
    // LEETCODE 236 MEDIUM
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        ArrayList<TreeNode> pathP = nodeToRoot(root , p.val);
        ArrayList<TreeNode> pathQ = nodeToRoot(root, q.val);
        
        int i = pathP.size() - 1;
        int j = pathQ.size() - 1;
        TreeNode Lca = null;
        while(i>=0 && j>=0){
            if(pathP.get(i) != pathQ.get(j))
                break;
            Lca = pathP.get(i);
            i--;
            j--;
        }
        
        return Lca;
    }

    /*  faster and easy code 
      if(root == null )
            return null;
        
        if(root == p || root == q)
            return root;
        
        TreeNode left = lowestCommonAncestor(root.left , p , q);
        TreeNode right = lowestCommonAncestor(root.right , p ,q);
        
       
        if(left == null){
            return right;
        }
        if(right == null)
            return left;
        
         return root; */
}
