class Mobile{
    int price;
    String brand;
    static String name;
    public static void show(Mobile obj){
        System.out.println("Inside the Static Method");
        System.out.println("Brand : "+ obj.brand + " Price : "+obj.price + " Name : "+Mobile.name);
    }

}
public class StaticMethods {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.price = 100000;
        m1.brand = "Apple";

        Mobile m2 = new Mobile();
        m2.price = 120000;
        m2.brand = "Samsung";

        Mobile.name="Smart Phone";

        Mobile.show(m1);
        Mobile.show(m2);
    }

}
