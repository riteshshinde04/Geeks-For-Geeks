class Solution {
    public void populateNext(Node root) {
        // code here
        if (root == null) return;

        Node[] node = new Node[1];
        node[0] = new Node(-1);

        inorder(root, node);
    }

    private void inorder(Node root, Node[] node) {
        if (root.left != null) {
            inorder(root.left, node);
        }

        node[0].next = root;
        node[0] = root;

        if (root.right != null) {
            inorder(root.right, node);
        }
    }
}