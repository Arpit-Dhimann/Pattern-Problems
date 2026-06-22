// Problem: Print the pattern (Half Pyramid). 1
//                                            1 2
//                                            1 2 3
//                                            1 2 3 4
//                                            1 2 3 4 5
// Solution: Used nested 'for' loops. The outer loop handles rows, 
// and the inner loop prints the current column index 'j' to create 
// the sequential number pattern.

public class Problem_7 {
  public static void main(String[]args) {
    // For rows
    int n = 5;

    //Outer loop: iterates through each row
    for(int i=1; i<=n; i++) {

        // Inner loop: column count increases with each row (j <= i)
        for(int j=1; j<=i; j++) {
            System.out.print( j + " " );
        }
        // Move to the next line after printing each row
        System.out.println();        
    }
    }
}