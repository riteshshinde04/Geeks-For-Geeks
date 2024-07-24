class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here.
        Node current = root;
        Node prev = null;
        
        while (current != null) {
            if (current.left == null) {
                if (prev != null && current.data <= prev.data) {
                    return false;
                }
                prev = current;
                current = current.right;
            } else {
                Node predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }
                
                if (predecessor.right == null) {
                    predecessor.right = current;
                    current = current.left;
                } else {
                    predecessor.right = null;
                    if (prev != null && current.data <= prev.data) {
                        return false;
                    }
                    prev = current;
                    current = current.right;
                }
            }
        }
        
        return true;
    }
}