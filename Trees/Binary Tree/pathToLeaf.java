public class pathToLeaf {
  public void printPathtoLeaf(Node node , String path , int sum , int lo , int hi) {
      if( node == null) return ;

      if(node.left == null && node.right == null){
          sum += node.data;

          if(sum >= lo && sum <= hi ){
              path += node.data;
              System.out.println(path);
          }
          return;
      }

      printPathtoLeaf(node.left, path + node.data + "", sum + node.data, lo, hi);
      printPathtoLeaf(node.right, path + node.data + "", sum + node.data, lo, hi);

  }

}
