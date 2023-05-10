import java.io.*;
class accept{
    public static void main(String args[]) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value: ");

        int num = Integer.parseInt(br.readLine());
        System.out.println("The value remained the same: "+ num);

        float n = Float.parseFloat(br.readLine());
        System.out.println("The value remained the same: "+ n);

        double d = Double.parseDouble(br.readLine());
        System.out.println("The value remained the same: "+ d);

        byte b = Byte.parseByte(br.readLine());
        System.out.println("The value remained the same: "+ b);

        short S = Short.parseShort(br.readLine());
        System.out.println("The value remained the same: "+ S);

        long L = Long.parseLong(br.readLine());
        System.out.println("The value remained the same: "+ L);

    }
}