class Solution {
    private Map<String, Integer> map;
    private List<Node> result;
    
    public List<Node> printAllDups(Node root) {
        // code here
         map = new HashMap<>();
        result = new ArrayList<>();
        serialize(root);
        return result;
    }
    
    private String serialize(Node node) {
        if (node == null) {
            return "#";
        }
        
        String serial = node.data + "," + serialize(node.left) + "," + serialize(node.right);
        
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        
        if (map.get(serial) == 2) {
            result.add(node);
        }
        
        return serial;
    }
}