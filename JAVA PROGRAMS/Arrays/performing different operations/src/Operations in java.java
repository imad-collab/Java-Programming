import java.io.*;
import java.util.*;
class Operations{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter two numbers: ");
        String str= br.readLine();

        StringTokenizer st=new StringTokenizer(str);
        String s1=st.nextToken();
        String s2=st.nextToken();

        s1=s1.trim();
        s2=s2.trim();

        double n1=Double.parseDouble(s1);
        double n2=Double.parseDouble(s2);

        System.out.println("Addition of two numbers: "+ (n1+n2));
        System.out.println("Subtraction of two numbers: "+ (n1-n2));
        System.out.println("Division of two numbers: "+ (n1/n2));
        System.out.println("Multiplication of two numbers: "+ (n1*n2));

    }
}