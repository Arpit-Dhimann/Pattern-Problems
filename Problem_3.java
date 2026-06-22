// Problem: Print the pattern (Half Pyramid). *
//                                            * *
//                                            * * *
//                                            * * * *
// Solution: Used a nested 'for' loop where the inner loop's condition is dependent on the current row number (j <= i).

public class Problem_3 {
  public static void main(String[]args) {
    // For rows
    int n = 4;

    //Outer loop: iterates through each row
    for(int i=1; i<=n; i++){

        // Inner loop: column count increases with each row (j <= i)
        for(int j=1; j<=i; j++){
            System.out.print(" * ");
        }
        // Move to the next line after printing each row
        System.out.println(  );        
    }
    }
}