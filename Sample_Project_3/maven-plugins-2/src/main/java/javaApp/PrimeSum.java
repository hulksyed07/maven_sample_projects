package javaApp;

public class PrimeSum {

    public static void main(String[] args) {
        System.out.println(primesum(20));
    }

    static long primesum(int maxNum) {
        int sum = 0, num;
        //insert your code here
        if(maxNum <= 0) {

        }
        else {
        	for(int i=1; i <= maxNum; i++) {
            if (isPrime(i)) {
              sum = sum + i;
            }
        	}
        }

        return sum;
    }

    static boolean isPrime(int n) 
		{ 
			// Corner case 
			if (n <= 1) 
			    return false; 
			  
			// Check from 2 to n-1 
			for (int i = 2; i < n; i++) 
			    if (n % i == 0) 
			        return false; 
			  
			return true; 
		}
}