import java.lang.*;
import java.io.*;
import java.util.*;
class minJumps
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    //reading input using BufferedReader
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	    
	    //reading total testcases
        int t = Integer.parseInt(br.readLine()); 

        int numOfTestCases = t;

        for(int p = 0;p<numOfTestCases;p++){
            //reading size of array 
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            
            //adding elements to the Array
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            
            //creating an object of class DynamicProgramming
            DynamicProgramming obj = new DynamicProgramming();
            
            //calling method minimumJumps() of class
            //DynamicProgramming
            System.out.println(obj.minimumJumps(arr, size));
        }
	 }
	
}
// } Driver Code Ends


class DynamicProgramming{
    
    // function to find minimum number of jumps to reach end of the array
    public static int minimumJumps(int arr[], int n){
        
         int dp[] = new int[n];
        dp[0] = 0;
        for(int i = 1; i <n; i++)
            dp[i] = Integer.MAX_VALUE;
            
        for(int i = 1; i < n; i++){
            for(int j = 0; j <i; j++){
                if (i <= j + arr[j] && dp[j] != Integer.MAX_VALUE) { 
                    dp[i] = Math.min(dp[i], dp[j] + 1); 
                    break; 
                } 
            }
        }
        if( dp[n-1] != Integer.MAX_VALUE)
        return dp[n-1];
        return -1;
    }
    
}
