class exception {
    public static void main(String args[]) {
        try {
            args = new String[] { "arg1", "arg2", "arg3" };

            System.out.println("Open Files");

            int n = args.length;
            System.out.println("n= " + n);
            int a = 45 / n;
            System.out.println("a= " + a);
        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae);

            System.out.println("Please pass data while running this program ");
        }
        finally {
            System.out.println("closed Files");
        }
    }
}
