public class findTilt {
        dfs(node);
        return sum;
    }
    
    
    private int dfs(TreeNode node){
        if(node == null) return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        int val = node.val;
        node.val = Math.abs(left-right);
        sum += node.val;
        return val + left + right;
    }
}
