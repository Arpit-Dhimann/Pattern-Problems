// Problem: Print the pattern (Inverted Half Pyramid Rotated 180 degree).       *
//                                                                            * *
//                                                                          * * *
//                                                                        * * * *
// Solution: Used two inner loops - one for leading spaces to align the stars to the right, and one for the star printing logic.

public class Problem_5 {
  public static void main(String[]args) {
    // For rows
    int n = 4;

    //Outer loop: iterates through each row
    for(int i=1; i<=n; i++){
        // Inner loop 1: Print spaces to shift stars to the right
        for(int j=1; j<=n-i; j++) {
            System.out.print("   ");
        }

        // Inner loop 2: Print stars for the pyramid shape
        for(int j=1; j<=i; j++){
            System.out.print(" * ");
        }
        // Move to the next line after printing each row
        System.out.println();        
    }
    }
}