class maxDepth {
    public int maxiDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null) return 1 ; 
        int lh = maxiDepth(root.left);
        int rh = maxiDepth(root.right);
        
        return Math.max(lh,rh) + 1;
    }
}