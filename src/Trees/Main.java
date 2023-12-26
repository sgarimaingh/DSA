package Trees;


public class Main {
    public static void main(String[] args) {

        //Level Order Traversal
        LevelOrderTraversal l = new LevelOrderTraversal();
        l.levelOrderTraversal();

        //Zig Zag Level Order Traversal
        System.out.println();
        ZigZagLevelOrderTraversal.printZigZagOrder();

        // construct tree from pre and inorder traversal
        System.out.println("\nInorder traversal of constructed binary tree from pre and inorder traversal:");
        BinaryTreeConstructionFromOreAndInorder b = new BinaryTreeConstructionFromOreAndInorder();
        b.run();

        // print k level down nodes
        System.out.println("\nK-level nodes from target:");
        KLevelDown k = new KLevelDown();
        k.printKLevelDownNodes();

        // kth smallest element in bst
        System.out.println("\nKth smallest element is: ");
        kthSmallestElement kse = new kthSmallestElement();
        kse.bst();


    }
}
