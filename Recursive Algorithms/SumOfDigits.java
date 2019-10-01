import java.util.*;
import java.io.*;
import java.lang.*;
class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();  // taking number "n" as input
            System.out.println(new Digitsum().sumOfDigits(n)); // computing sum of digits of n
        }
    }
}

class Digitsum
{
 
    public static int sumOfDigits(int n)
    {
    if (n < 10)
      return n;
    return sumOfDigits(n/10) + n%10;
    }
}
