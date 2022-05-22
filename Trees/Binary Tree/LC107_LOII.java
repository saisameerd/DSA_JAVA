public class LC107_LOII {
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            Queue<TreeNode>qu = new LinkedList<>();
            List<List<Integer>>list = new ArrayList<>();
            List<Integer>ans = new ArrayList<>();
            List<Integer>ans1 = new ArrayList<>();
            Stack<List<Integer>>st = new Stack<>();
            
            if(root == null)return list;
            
            qu.add(root);
            qu.add(null);
            
            while(!qu.isEmpty()){
                TreeNode temp = qu.remove();
                if(temp != null){
                    ans.add(temp.val);
                    if(temp.left != null)qu.add(temp.left);
                    if(temp.right != null)qu.add(temp.right);
                }else{
                    st.push(ans);
                    ans = new ArrayList<>();
                    
                    if(qu.size() > 0)qu.add(null);
                }
            }
        
            while(st.size() > 0){
                ans1 = st.pop();
                list.add(ans1);
            }
            
            return list;
        }
    }
}
