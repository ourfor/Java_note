public class son implements father,Mother {
    public void speak(){
        System.out.println("I am the son, who implements the interface father");
    }
    public void run(){
        System.out.println("I can run");
    }
    public void hair(){
        System.out.println("I have beautiful hair");
        System.out.println("My age is "+Mother.age);
    }

    public static void main(String args[]){
        son me=new son();
        me.speak();
        me.run();
        me.hair();
    }
}