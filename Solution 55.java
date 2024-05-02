class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> level = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            while(n-- > 0)
            {
                Node p = q.remove();
                if(p == null)
                {
                    level.add(-1);
                    continue;
                }
                level.add(p.data);
                q.add(p.left);
                q.add(p.right);
            }
        }
        return level;
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> a) {
        // code here
        Node root = new Node(a.get(0));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i < a.size()) 
        {
            Node p = q.remove();
            if(a.get(i) == -1)
                p.left = null;
            else 
            {
                p.left = new Node(a.get(i));
                q.add(p.left);
            }
            i++;
            if(a.get(i) == -1)
                p.right = null;
            else 
            {
                p.right = new Node(a.get(i));
                q.add(p.right);
            }
            i++;
        }
        return root;
    }
};