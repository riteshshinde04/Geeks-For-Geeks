class Solution {
    static int minSteps(int d) {
        // code here
        int steps = 0 , count = 0;
        
        while(count<d){
            steps++;
            count+=steps;
        }
        
        while((count-d)%2!=0){
            steps++;
            count+=steps;
        }
        
        return steps;
    }
}