public class orders {
    public static void inOrder(Node root){
        if(root == null ){
            return ;
        }

        // left , root , right

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void postOrder( Node root){
        if(root == null){
            return ;
        }

        // left , right , root

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
}
