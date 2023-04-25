class demo{
    public static void main(String args[]){
        int x=1;
        System.out.println("before return");{
        if(x==1)
            return;
        System.out.println("after return");
    }
}
}