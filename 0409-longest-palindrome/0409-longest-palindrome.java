class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int a = 0;
        int l = 0;
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c , 0)+1);
        }
         for(Character key : map.keySet()){
            if(map.get(key)%2==0) l=l+map.get(key);
            else{
                l=l+map.get(key)-1 ;
                a++;
            }
         }
         if(a==0)
         return l ;
         else
         return l+1 ;
    }
}