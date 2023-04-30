import java.util.Scanner;
class Main {
    public static void main(String[] args){
        System.out.println("enter the id name salary: ");
        Scanner sc=new Scanner(System.in);

        int id =sc.nextInt();
        String name=sc.next();
        float sal=sc.nextFloat();

        System.out.println("id= "+ id);
        System.out.println("name= "+ name);
        System.out.println("sal= "+ sal);

        }
    }
