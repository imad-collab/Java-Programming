class teacher{
    String name;
    String address;
    int    id;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setAddress(String address){
        this.address=address;
    }
    String getAddress(){
        return address;
    }
    void setId(int id){
        this.id=id;
    }
    int getId(){
        return id;
    }
}

class student extends teacher{
    public static void main(String args[]){
         student st=new student();
         st.setId(1290);
         st.setName("imaduddin");
         st.setAddress("Ahmed Colony,tolichowki,Hyderabad");

         System.out.println("Name of the student is:- "+st.getName());
        System.out.println("I'd of the student is:- "+st.getId());
        System.out.println("Address of the student is:- "+st.getAddress());
    }
}
