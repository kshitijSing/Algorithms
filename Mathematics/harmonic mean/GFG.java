// JAVA program to find harmonic 
// mean of numbers. 
import java.io.*; 

class GFG { 
	
	// Function that returns harmonic mean. 
	static float harmonicMean(float arr[], int n) 
	{ 
		// Declare sum variables and 
		// initialize with zero 
		float sum = 0; 
		for (int i = 0; i < n; i++) 
			sum = sum + (float)1 / arr[i]; 
	
		return (float)n/sum; 
	} 
	
	// Driver code 
	public static void main(String args[]) 
	{ 
		float arr[]= { 13.5f, 14.5f, 14.8f, 
					15.2f, 16.1f }; 
		int n = arr.length; 
		System.out.println(harmonicMean(arr, n)); 
	} 
} 

/*This code is contributed by Nikita Tiwari.*/
