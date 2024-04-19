class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : b){
            set.add(i);
        }
        for(int j : a){
            if(!(set.contains(j))){
                res.add(j);
            }
        }
        // Collections.sort(res);
        return res;
    }
}
