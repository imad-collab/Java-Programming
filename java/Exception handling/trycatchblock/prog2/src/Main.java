class exception {
    public static void main(String args[]) {
        try {
            int b[]={10,20,30};
            b[50]=100;
        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae);

            System.out.println("Please pass data while running this program ");
        }
        catch (IndexOutOfBoundsException aie){
            aie.printStackTrace();
            System.out.println("please see that the array index is within the range ");
        }
        finally {
            System.out.println("closed Files");
        }
    }
}