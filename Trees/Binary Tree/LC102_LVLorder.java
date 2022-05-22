public class LC102_LVLorder {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode>qu = new LinkedList<>();
            List<List<Integer>>ans = new ArrayList<>();
            
            if(root == null)return ans;
            
            qu.add(root);
            
            while(!qu.isEmpty()){
              int size = qu.size();
              List<Integer>lvl = new ArrayList<>();
                
             for(int i=0;i<size;i++){
                 TreeNode rem = qu.remove();   
                if(rem != null){            
                    lvl.add(rem.val);
                    if(rem.left != null){
                        qu.add(rem.left);
                    }
                     if(rem.right != null){
                        qu.add(rem.right);
                    }
                }
             }
                ans.add(new ArrayList<>(lvl));
             
            }
            
            return ans;
        }
    }
}
