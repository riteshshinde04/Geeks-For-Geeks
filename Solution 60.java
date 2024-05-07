class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
         ArrayList<Integer> result = new ArrayList<>();
        
        if (node == null)
            return result;

        Queue<Node> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            stack.push(currentNode);

            if (currentNode.right != null)
                queue.offer(currentNode.right);
            if (currentNode.left != null)
                queue.offer(currentNode.left);
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop().data);
        }

        return result;
    }
}      