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





    }
}
