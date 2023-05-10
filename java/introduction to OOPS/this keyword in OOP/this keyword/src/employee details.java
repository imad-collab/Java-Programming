class Employee {
    private String name;
    private String rollNumber;
    private String section;
    private int age;
    private int joinDate;
    private int salary;

    Employee(String name, String rollNumber, String section, int age, int joinDate, int salary) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.section = section;
        this.age = age;
        this.joinDate = joinDate;
        this.salary = salary;
    }

    void employeeInfo() {
        System.out.println("Name of the employee: " + this.name);
        System.out.println("Roll number of the employee: " + this.rollNumber);
        System.out.println("Salary of the employee: " + this.salary);
    }
}

class Main {
    public static void main(String args[]) {
        Employee emp=new Employee("imaduddin","18m21a0570","Data Analyst",18,01/01/2000,25000);
        emp.employeeInfo();
    }
}
