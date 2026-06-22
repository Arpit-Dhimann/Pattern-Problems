// Problem: Print the pattern (Half Pyramid). 1 2 3 4 5
//                                            1 2 3 4
//                                            1 2 3
//                                            1 2
//                                            1
// Solution: Used nested 'for' loops. The outer loop starts from 'n' and 
// decrements to 1 (i--), and the inner loop prints numbers from 1 up to 'i'.

public class Problem_8 {
  public static void main(String[]args) {
    // For rows
    int n = 5;

    //Outer loop: iterates through each row
    for(int i=n; i>=1; i--) {

        // Inner loop: column count increases with each row (j <= i)
        for(int j=1; j<=i; j++) {
            System.out.print( j + " " );
        }
        // Move to the next line after printing each row
        System.out.println();        
    }
    }
}