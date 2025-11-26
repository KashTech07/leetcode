class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0||j>=0||carry>0){
            int bitA=((i>=0)?a.charAt(i)-'0': 0);
            int bitB=((j>=0)?b.charAt(j)-'0': 0);
            int num = bitA+bitB+carry;
            sb.append(num%2);
            carry = num/2;
            i--;
            j--;
        }
        sb.reverse();
        String ans = sb.toString();
        return ans;
    }
}