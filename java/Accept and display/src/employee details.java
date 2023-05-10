import java.io.*;
class employee{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Employee id:-");
        int id=Integer.parseInt(br.readLine());
        System.out.println("Employee Name:-");
        String str= br.readLine();
        System.out.println("Employee Salary:-");
        Float flt= Float.parseFloat(br.readLine());

    }
}