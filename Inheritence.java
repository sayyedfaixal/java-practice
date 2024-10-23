class A{
    public A()
    {
        System.out.println("Non Parameterised Constructor of A()");
    }
    public A(int a)
    {
        System.out.println("Inside Parameterised Constructor of A()"+a);
    }
}
class B extends A{
    public B()
    {
        // super();
        System.out.println("Non Parameterised Constructor of B()");
    }
    public B(int a)
    {
        super(a);
        System.out.println("Inside Parameterised Constructor of B()"+a);
    }
}
public class Inheritence {
    public static void main(String[] args) {
        B obj = new B(10);
    }
}
