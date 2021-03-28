/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public String nul = "N";
    public String c = ",";
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
     StringBuilder sb = new StringBuilder();
        build(root, sb);
        System.out.println(sb.toString());
        return sb.toString();
    }
    
    public void build(TreeNode n, StringBuilder sb){
        if(n == null) {
            sb.append(nul);
            sb.append(c);
            return;
        }
        else{
            sb.append(n.val);
            sb.append(c);
            build(n.left, sb);
            build(n.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> val = new LinkedList<String>(Arrays.asList(data.split(",")));
        return check(val);
      
    }
    
    public TreeNode check(List<String> val){
        if(val.get(0).equals(nul)){
            val.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(val.get(0)));
        val.remove(0);
        root.left = check(val);
        root.right = check(val);
       
       return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));