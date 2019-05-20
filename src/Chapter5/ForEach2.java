package Chapter5;

// Use for-each style for on a two-dimensional array.
class ForEach2 {
    public static void main(String args[]) {
        int sum = 0;
        int nums[][] = new int[3][5];

        // give nums some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i[] : nums) {
            //System.out.print(i + "-----------\n");
            for (int y : i) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }


        // Use for-each for loop to display and sum the values.
        for (int x[] : nums) {
            for (int y : x) {
                System.out.print(y + " ");
                sum += y;
            }
        }
        System.out.println("\nSummation: " + sum);
    }
}