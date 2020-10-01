import java.util.*;
import java.lang.*;
import java.io.*;

class longestCommonSubSeq {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    LCS obj = new LCS();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}// } Driver Code Ends


class LCS{
    
    // function to find LCS
    static int lcs(int m, int n, String s1, String s2){
        // your code here
        int dp[][] = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            dp[i][0] = 0;
        }
        for(int i = 0; i <= n; i++){
            dp[0][i] = 0;
        }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
    
}
