import java.util.*;
import java.io.*;
import java.lang.*;
class DriverClass
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 
    	for(int i=0;i<t;i++)
    	{
    	   String str=br.readLine();
    		String[] starr=str.split(" ");
    	    int n=Integer.parseInt(starr[0]);
    		int d= Integer.parseInt(starr[1]);
    		int[] arr=new int[n];
    		String str1=br.readLine();
    		String[] starr1=str1.split(" ");
    		for(int j=0;j<n;j++)
    		{
    		  arr[j]= Integer.parseInt(starr1[j]);
    		}
    		new RotateArray().rotateArr(arr, d, n);
    		StringBuffer sb=new StringBuffer();
            for(int t1=0;t1<n;t1++)
             sb.append(arr[t1]+" ");
             System.out.println(sb);
         }
    }
}

}

{
    void rotateArr(int arr[], int d, int n){
    
   // Your code here
   reverseArray(arr,0,d-1);
   reverseArray(arr,d,n-1);
   reverseArray(arr,0,n-1);
    
}

void reverseArray(int[] arr, int start, int end){
    if(start >= end)
       return;
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    reverseArray(arr,start+1, end-1);
}
}
