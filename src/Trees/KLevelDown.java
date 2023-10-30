package Trees;

class KLevelDown {
    static Node rootNode;

    private static int target =5;
    private static int k=2;

    public static void printKLevelDownNodes()
    {
        rootNode = new Node(1);
        rootNode.left = new Node(2);
        rootNode.right = new Node(3);
        rootNode.left.left = new Node(4);
        rootNode.left.right = new Node(5);
        rootNode.right.left = new Node(6);
        rootNode.right.right = new Node(7);
        rootNode.right.left.left = new Node(8);
        rootNode.right.left.right= new Node(9);
        rootNode.right.right.left = new Node(10);
        rootNode.right.right.right = new Node(12);

        search(rootNode);
    }

    private static void search(Node rootNode){
        if(rootNode==null) return;
        if(rootNode.data==target){
            KLevelDown(rootNode,k);
            return;
        }
        search(rootNode.left);
        search(rootNode.right);
    }

    private static void KLevelDown(Node root,int k){
        if(root==null) return;
        System.out.println(k);
        System.out.println(root.data);
        if(k==0) {
            System.out.print(root.data + " ");
        }
        KLevelDown(root.left,k-1);
        System.out.println("DSFg");
        KLevelDown(root.right,k-1);
    }
}
