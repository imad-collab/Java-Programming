class twodimensionality {
    public static void main(String args[]) {
        int x[][] = {{1, 1, 1, 1}, {2, 2, 2, 2}};
        System.out.println("in matrix form: ");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


