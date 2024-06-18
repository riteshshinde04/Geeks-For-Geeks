class Solution {
    int rectanglesInCircle(int r) {
        // code here
        int count = 0;
        double area = Math.PI*r*r;
        
        for(int i=1; i<=2*r; i++){
            for(int j=1; j<=2*r; j++){
                double currArea = i*j;
                if(canFit(i, j, r)){
                    count++;
                }
            }
        }
        return count;
    }
    
// Determine if it current rectangle can fit inside circle 
    boolean canFit(int i, int j, int r){
        double diagonal = Math.sqrt(i*i + j*j);
        return diagonal <= 2*r;
    }
};