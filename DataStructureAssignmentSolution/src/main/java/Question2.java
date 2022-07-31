public class Question2 {
    public static Node node;
    static Node prevNode = null;
    static Node headNode = null;
    public static void BSTtoSkewed(Node root, int order) {

            // Base Case
            if(root == null)
            {
                return;
            }
            BSTtoSkewed(root.left, order);
            Node rightNode = root.right;
            Node leftNode = root.left;

            // Condition to check if the root Node
            // of the skewed tree is not defined
            if (headNode == null)
            {
                headNode = root;
            }
            else
            {
                prevNode.right = root;
            }
        root.left = null;
        prevNode = root;
        BSTtoSkewed(rightNode, order);
        }


}
class Node{
    Node left;
    Node right;
    int data;

}
