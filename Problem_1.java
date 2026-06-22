// Problem: Print the pattern (Solid Rectange). * * * * * * *
//                                              * * * * * * *
//                                              * * * * * * *
// Solution: Used a nested 'for' loop. The outer loop controls rows (n), and the inner loop controls columns (m).

public class Problem_1 {
  public static void main(String[]args) {
    // For rows
    int n = 3;
    // For columns
    int m = 7;

    //Outer loop: Outer loop: iterates through each row
    for(int i=1; i<=n; i++){

        //Inner loop: iterates through each column in the current row
        for(int j=1; j<=m; j++){
            System.out.print(" * ");
        }
        // Move to the next line after printing each row
        System.out.println();        
    }
    }
}