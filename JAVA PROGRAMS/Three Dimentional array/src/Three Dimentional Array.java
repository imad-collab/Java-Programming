class ThreeDimensionalArrayExample {
    public static void main(String[] args) {
        int[][][] arr = new int[3][4][5];

        // assigning values to the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    arr[i][j][k] = i+j+j;

                }
            }
        }

        // printing the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
