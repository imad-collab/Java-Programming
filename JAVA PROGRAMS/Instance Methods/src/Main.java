class person{
    private String name;
    private int age;
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
class methds{
    public static void main(String args[]){
        person p1=new person();
        p1.setName("imad");
        p1.setAge(23);
        System.out.println("The name of the person is : "+p1.getName());
        System.out.println("the age of the person is: "+ p1.getAge());
    }
}