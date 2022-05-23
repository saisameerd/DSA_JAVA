public class LC199_RightView {
    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            Queue<TreeNode>qu = new LinkedList<>();
            List<Integer>ans = new ArrayList<>();
            qu.add(root);
            while(qu.size()>0){
                int size = qu.size();
                for(int i = 0; i<size ; i++){
                  TreeNode temp = qu.remove();
                  if(temp != null){
                       if(i == size - 1){
                        ans.add(temp.val);
                    }
                           
                    if(temp.left != null){
                        qu.add(temp.left);
                    }
                    if(temp.right != null){
                        qu.add(temp.right);
                    }
                  }
               }    
               
            }
                    return ans;
        }
    }
    
}
