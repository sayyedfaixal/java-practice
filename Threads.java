class A extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Inside A");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Inside B");
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        A aobj = new A();
        B bobj = new B();
        aobj.start();
        bobj.start();
    }
}
