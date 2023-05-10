class student{

    int id;
    String name;
    String address;
    int marks;

    void setName(String name){this.name=name;}
    void setId(int id){this.id=id;}
    void setAddress(String address){this.address=address;}
    void setMarks(int marks){this.marks=marks;}

    String getName(){return name;}
    String getAddress(){return address;}
    int getMarks(){return marks;}
    int getId(){return id;}

}

class demo {
    public static void main(String args[]) {
        student st = new student();
        st.setId(1010);
        st.setMarks(771);
        st.setAddress("Ahmed colony,Tolichowki");
        st.setName("Mohd Imaduddin");

        System.out.println("Name :- " + st.getName());
        System.out.println("id :- " + st.getId());
        System.out.println("Marks :- " + st.getMarks());
        System.out.println("Address :- " + st.getAddress());
    }
}