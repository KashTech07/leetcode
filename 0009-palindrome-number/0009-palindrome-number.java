class Solution {
    public boolean isPalindrome(int x) {
        int r,rev=0,temp=x;
        if(x<0)
       {//system.out.print("false");
        return false;}
        while(x!=0)
        {r=x%10;
        rev=rev*10+r;
        x=x/10;}
        if (rev==temp)
       { System.out.print("true");
        return true;}
        else 
       {System.out.print("false");
        return false;}
    }
}