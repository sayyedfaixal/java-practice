class Calculate
{
    public int add(int a, int b){ 
        return a+b; 
    }
    public int add(int a, int b, int c){ 
        return a+b+c;
    }
    public float add(float a, float b, float c, float d){
        float result = a+b+c+d;
        return result;
    }
}
class methodOverloading
{
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        System.out.println(obj.add(3.2f, 4.2f, 5.43f, 6.78f));
        System.out.println(obj.add(1,2, 3));
        System.out.println(obj.add(1, 212));

    }
}
