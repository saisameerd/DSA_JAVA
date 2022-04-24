public class singleChild {
    public void printSC(Node node , Node parent ) {
        if(node == null) return ;

        if(node.left.data == null && node.right.data != null)return node.right.data;
        if(node.left.data != null && node.right.data == null)return node.left.data;

        printSC(node.left, parent);
        printSC(node.right, parent);
        
    }
}
