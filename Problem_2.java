// Problem: Print the pattern (Hollow Rectange). * * * * *
//                                               *       *
//                                               *       *
//                                               * * * * *
// Solution: Used nested 'for' loops with a conditional check.
// Logic: Print '*' only if the current cell is on the boundary (i==1, i==n, j==1, or j==m).

public class Problem_2 {
  public static void main(String[]args) {
    // For rows
    int n = 4;
    // For columns
    int m = 5;

    //Outer loop: Outer loop: iterates through each row
    for(int i=1; i<=n; i++){

        //Inner loop: iterates through each column in the current row
        for(int j=1; j<=m; j++){
            // Check if current position is on the boundary
            if(i == 1 || j == 1 || i == n || j == m) {
                System.out.print(" * ");
            }
            else{
                // Print space for hollow part
                System.out.print("   ");
            }
        }
        // Move to the next line after printing each row
        System.out.println(  );        
    }
    }
}