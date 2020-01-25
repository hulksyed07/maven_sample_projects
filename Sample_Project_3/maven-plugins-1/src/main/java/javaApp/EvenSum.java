package javaApp;
import java.util.Arrays;

public class EvenSum {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int even[] = new int[num];
        int sum = 0,j = 0;
        String evennums = "";
        //Insert your code here
        for(int i=1; i <= num; i++) {
            // if the number is divisible by 2 then it is even
            if( i % 2 == 0){
              even[j] = i;
              j++;
            }
        }

        for( int n : even) {
          sum = sum+n;
      	}

      	int targetIndex = 0;
		for( int sourceIndex = 0;  sourceIndex < even.length;  sourceIndex++ )
		{
		    if( even[sourceIndex] != 0 ) 
		        even[targetIndex++] = even[sourceIndex];
		}
		int newEven[] = new int[targetIndex];
		System.arraycopy( even, 0, newEven, 0, targetIndex );

      	// int evenFiltered[] = Arrays.stream(array).filter(num -> num != 0).toArray();

        // evennums = Arrays.toString(newEven);
        evennums = Arrays.toString(newEven).replaceAll("\\[|\\]", "").replaceAll(" ", "");
        // evennums = Arrays.stream(intArray).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println(evennums);
        System.out.println(sum);
    }
}