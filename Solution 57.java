class GfG
{
    //Function to return a tree created from postorder and inoreder traversals.
    Node buildTree(int in[], int post[], int n) {
        // Your code here
        return helper(in, post, 0, n-1, 0, n-1);
    }
    private Node helper(int in[], int post[], int instart, int inend, int poststart, int postend){
        if(instart > inend){
            return null;
        }
        int rootval = post[postend];
        Node root = new Node(rootval);
        int rootindex = instart;
        for(; rootindex <= inend; rootindex++){
            if(in[rootindex]== rootval){
                break;
            }
        }
        int leftTreesize = rootindex - instart;
        int rightTreesize =inend- rootindex ;
        root.left = helper(in, post, instart, rootindex-1, poststart, poststart +leftTreesize-1 );
        root.right = helper(in, post, rootindex +1,inend, postend-rightTreesize, postend-1 );
        return root;
    }
}