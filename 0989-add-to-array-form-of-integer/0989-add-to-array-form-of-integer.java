class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
      int i = num.length-1;
      int carry = 0;
      ArrayList<Integer> list = new ArrayList<>();
      while(i>=0 || k>0 || carry>0)  {
        int a = i>=0? num[i] : 0 ;
        int b = k>0 ? k%10 : 0;
        int sum = a+b+carry ;
        list.add(sum%10);
        carry = sum/10 ;
        i--;
        k=k/10;
      }
      Collections.reverse(list);
      return list;
    }
}