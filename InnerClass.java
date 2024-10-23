class A{
    int age;
    public void show(){
        System.out.println("Inside A");
    }
    static class B{
        public void config(){
            System.out.println("Inside B");
        }
    }
}
public class InnerClass {
    public static void main(String[] a){
        A obj = new A();
        obj.show();
        A.B obj1 = new A.B();
    }   
}
