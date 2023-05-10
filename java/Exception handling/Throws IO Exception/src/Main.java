import java.io.*;

class demo {
    private String name;
    private String age;
    public int salary;

    void accept() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter the name: ");
        name = br.readLine();
        System.out.println("enter the age: ");
        age=br.readLine();
        System.out.println("enter the Salary: ");
        salary=Integer.parseInt(br.readLine());
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

class ex1 {
    public static void main(String args[]) throws IOException {
        demo d1 = new demo();
        d1.accept();
        d1.display();
    }
}