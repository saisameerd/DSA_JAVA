public class kDistFarAway {
        /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        ArrayList<TreeNode> path = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        nodeToRootPath(root , target , path);
        TreeNode blocker = null;
        for(int i = 0 ; i< path.size() ; i++){
            TreeNode n = path.get(i);
            kLvlDown(n  , k - i ,blocker ,ans);
            blocker   = n ;
        }
        
        return ans;
      }
    
    boolean nodeToRootPath(TreeNode node , TreeNode val , ArrayList<TreeNode>path){
        if(node == null) {
            return false;
        }
        
        if(node == val){
        path.add(node);
        return true;
    }
        
    boolean remPath = nodeToRootPath(node.left, val ,path) || nodeToRootPath(node.right,val ,path);
        
    if(remPath){
        path.add(node);
    }
   
    return remPath;
  }
    
     void kLvlDown(TreeNode node , int k , TreeNode blocker , ArrayList<Integer>ans){
        if(node == null || k < 0 || blocker == node){
            return ;
        }
        
        if(k == 0){
        ans.add(node.val);
        return ;
        }
        
        kLvlDown(node.left , k - 1, blocker ,ans);
        kLvlDown(node.right, k - 1, blocker , ans);
    }
}

