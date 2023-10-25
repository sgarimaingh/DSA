package Trees;

public class BinaryTreeConstructionFromOreAndInorder {

    private int[] pre = {1,7,2,6,5,11,9,10,4};
    private int[] in = {2,7,5,6,11,1,9,4,10};

    public void run(){
        Node root = constructTree(pre,0,pre.length-1, in, 0,in.length-1);
        printInorder(root);

    }

    private Node constructTree(int[] pre, int si1,int ei1, int[] in, int si2, int ei2){
        if(si1>ei1) return null;
        if(si1==ei1) return new Node(pre[si1]);
        Node root = new Node(pre[si1]);
        int idx = -1;
        for(int i=si2;i<=ei2;i++)
        {
            if(in[i]==pre[si1]){
                idx = i;
                break;
            }
        }

        root.left = constructTree(pre,si1+1, si1+(idx-si2), in, si2, idx-1);
        root.right = constructTree(pre, si1+(idx-si2)+1, ei1,in, idx+1, ei2);
        return root;
    }

    void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.data + " ");

        /* now recur on right child */
        printInorder(node.right);
    }
}
