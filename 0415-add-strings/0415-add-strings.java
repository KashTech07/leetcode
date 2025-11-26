class Solution {
public String addStrings(String num1, String num2) {
StringBuilder sb = new StringBuilder();
int i = num1.length()-1;
int j = num2.length()-1;
int carry = 0;
while(j>=0 || i >=0 || carry > 0){
int x = ((i>=0)? num1.charAt(i)-'0': 0);
int y = ((j>=0)? num2.charAt(j)-'0': 0);
int num = x+y+carry ;
sb.append(num%10);
carry = num/10 ;
i--;
j--;
    }
    return sb.reverse().toString();
}}