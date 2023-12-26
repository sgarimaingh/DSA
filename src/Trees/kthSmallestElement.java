package Trees;

public class kthSmallestElement {
     static Node rootNode = new Node(20);

     int k =4;

     static int count=0;



    void bst(){

        rootNode.left = new Node(8);
        rootNode.right = new Node(22);
        rootNode.left.left = new Node(4);
        rootNode.left.right = new Node(12);
        rootNode.left.right.left = new Node(10);
        rootNode.left.right.right = new Node(14);

        Node res = kthSmallestElement(rootNode,k);
        if(res!=null) System.out.println(res.data);



    }

    private Node kthSmallestElement(Node root, int k){
        if(root == null) return null;

        Node left = kthSmallestElement(root.left, k);

        if(left!=null) return left;

        count++;
        if(count==k) return root;

        return kthSmallestElement(root.right, k);

    }


}
