class CommandLineArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments passed");
        } else {
            System.out.println("Arguments passed: ");
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}
