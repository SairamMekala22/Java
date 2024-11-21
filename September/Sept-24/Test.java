/*Given two strings text1 and text2, return the length of their longest common subsequence. 
A subsequence of a string is a new string generated from the original string with some characters 
(can be none) deleted without changing the relative order of the remaining characters. 
(eg, "ace" is a subsequence of "abcde" while "aec" is not). 
A common subsequence of two strings is a subsequence that is common to both strings. 
If there is no common subsequence, return 0.

Sample 1:
input=
abcdef
agcdk                                              

output=
3                      

Explanation: "acd" is the longest common subsequence 
*/


import java.util.*;


class Test{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String b=sc.next();
    int m = a.length();
    int n = b.length();
    int[][] dp = new int[m + 1][n + 1];

    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++){
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                dp[i][j] = dp[i - 1][j - 1] + 1;
                } 
            else{
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
    System.out.println(dp[m][n]);
 
}

}