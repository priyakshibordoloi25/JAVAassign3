public class TwoDArray {
    public static void main(String[] args) {
        // Create a 2D array with int values
        int[][] twoDArray = {
                {30},
                {300, 500},
                {3000, 5000, 5000}
        };

        // Access and print the elements of the 2D array
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
