class Calculator
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public void test()
    {

    }
}
class Classes
{
    public static void main(String a[])
    {
        int n1= 10, n2=100;
        Calculator calc = new Calculator();
        int result = calc.add(n1, n2);
        System.out.println("Sum is "+ result);
    }
}