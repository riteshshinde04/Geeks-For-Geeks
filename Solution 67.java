class Solution {
    public static int MinimumEffort(int rows, int columns, int[][] heights) {
        // code here
        int dist[][] = new int[rows][columns];
        
        for (int arr[] : dist) Arrays.fill (arr , (int)(1e9));
        
        // As , we can reach to the source node with a distance of 0.
        dist[0][0] = 0;
        
        PriorityQueue<Tuple> pq = new PriorityQueue<>(new Comparator<Tuple>() {
            
            @Override
            public int compare (Tuple t1 , Tuple t2) {
                
                return t1.diff - t2.diff;
            }
            
        });
        
        // {diff , {row , col}}
        pq.add (new Tuple (0 , 0 , 0));
        
        while (!pq.isEmpty ()) {
            
            // 1. Remove
            Tuple tp = pq.poll ();
            
            int diff = tp.diff;
            int r = tp.r;
            int c = tp.c;
            
            // 2. Checkout whether we had reached to destination cell or not.
            
            // We had reached to the destination and PriorityQueue yielded the destination 
            // which means out of all cell's , destination cell has the minimum difference.
            // So, in the future destination's cell will get the diff equal to the current diff or greater diff
            // i.e. return the diff.
            if (r == rows-1 && c == columns-1) return diff;
            
            
            // 3. Getting all the neighbours from 4 directions.
            int rowDirect[] = {-1 , 0 , 1 , 0};
            int colDirect[] = {0 , 1 , 0 , -1};
            for (int i = 0 ; i < 4 ; i++) {
                
                int nrow = r + rowDirect[i];
                int ncol = c + colDirect[i];
                
                if ((nrow >= 0 && nrow < rows) && (ncol >= 0 && ncol < columns)) {
                    
                    int nDiff = Math.abs (heights[nrow][ncol] - heights[r][c]);
                    
                    // Effort : Max of all the diff in a path.
                    int effort = Math.max (nDiff , diff);
                    
                    if (effort < dist[nrow][ncol]) {
                        
                        pq.add (new Tuple (effort , nrow , ncol)); // Only the max effort can be use.
                        dist[nrow][ncol] = effort;
                    }
                
                }
                
                
            }
        }
        
        return 0;
        
    }
    
}

class Tuple {
        
    int diff;
    int r;
    int c;
    
    public Tuple (int diff , int r , int c) {
        
        this.diff = diff;
        this.r = r;
        this.c = c;
    }
}
