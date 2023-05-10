class threedimensionality {
    public static void main(String args[]) {
        float x[][][] = {
                {{1.1f, 1.2f, 1.3f, 1.4f}, {2.1f, 2.2f, 2.3f, 2.4f}, {2.1f, 2.2f, 2.3f, 2.4f}, {3.1f, 3.2f, 3.3f, 3.4f}},
                {{4.1f, 4.2f, 4.3f, 4.4f}, {5.1f, 5.2f, 5.3f, 5.4f}, {6.1f, 6.2f, 6.3f, 6.4f}, {7.1f, 7.2f, 7.3f, 7.4f}},
                {{8.1f, 8.2f, 8.3f, 8.4f}, {9.1f, 9.2f, 9.3f, 9.4f}, {10.1f, 10.2f, 10.3f, 10.4f}, {11.1f, 11.2f, 11.3f, 11.4f}}
        };
        System.out.println("in matrix form: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(x[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
