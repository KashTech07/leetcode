class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        subset(nums , list , 0 , inner);
        return list ;
    }
    static void subset(int[] arr ,List<List<Integer>> list ,int i , ArrayList<Integer> inner){
        if(i==arr.length){
            list.add(new ArrayList(inner));
            return  ; 
        }
        subset(arr , list , i+1 , inner);
        inner.add(arr[i]);
        subset(arr , list , i+1 , inner);
        inner.remove(inner.size()-1);
    }
}