import java.util.ArrayList;

public class BinarySearchTreeProblem {
    public static boolean isPairPresentInBST(Node node, int target) {
//        convert the Binary Tree to Array (using Inorder traversal)
        ArrayList<Integer> initialList = new ArrayList<>();
        ArrayList<Integer> a2 = treeToList(node, initialList);

        int start = 0;
        int end = a2.size() - 1;

//        Implement the double pointer solution
        while (start < end) {
            if (a2.get(start) + a2.get(end) == target) {
                System.out.println("Pair Found : " + a2.get(start) + " :: " + a2.get(end));
                return true;
            }
            if (a2.get(start) + a2.get(end) > target) {
                end--;
            }
            if (a2.get(start) + a2.get(end) < target) {
                start++;
            }

        }
        System.out.println("No Pair found");
        return false;

    }

    static ArrayList<Integer> treeToList(Node node, ArrayList<Integer> list) {
        if (node == null)
            return list;

        treeToList(node.left, list);
        list.add(node.data);
        treeToList(node.right, list);

        return list;
    }

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }

    }

}



