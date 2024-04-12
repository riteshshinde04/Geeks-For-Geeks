class Solution{
    static int minJumps(int[] arr){
        // your code here
        int totalJump =0;
        int destination = arr.length-1;
        int coverage =0;
        int lastJumpIdx =0;
        
        if(arr.length ==1) 
        return 0; 
        // if(arr[0]==0){
        //     return -1;
        // }
        
        for(int i=0;i<arr.length;i++) {
            coverage = Math.max(coverage,i+arr[i]);
            
            if(i==lastJumpIdx) {
                lastJumpIdx = coverage;
                totalJump++;
                
                if(coverage>=destination) {
                    return totalJump;
                }
            }
        }
        return -1;
    }
}