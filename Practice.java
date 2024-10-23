class A{
    protected int a =10;
    private int b =200;
    void display(){
        System.out.println("From Class A :"+a);
        System.out.println("From Class A :"+b);
    }
    void setData(int a, int b){
        this.a = a;
        this.b = b;
    }
}
class B extends A{
    void print(){
        System.out.println("From Class B:"+a);
        A obj = new A();
        obj.display();
    }
}
class Practice{
    public static void main(String args[]){
        String day = "Monday";
        switch(day){
            case "Sunday", "Saturday" -> System.out.println("Wakeup SID");
            case "Monday", "Wednesday" -> System.out.println("Woken Up SID");
            default -> System.out.println("Are you even a SID?");
        }
        B objb = new B();
        A obja = new A();
        obja.display();
        objb.print();
    }
}