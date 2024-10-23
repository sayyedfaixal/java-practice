public class Strings {
    public static void main(String[] args) {
        // this is how we create strings in jaba
        String s1 = new String("Faisal");
        // Another way to create strings
        String s2 = "Sayed";
    
        System.out.println(s1);
        System.out.println(s2);

        StringBuffer sb = new StringBuffer("Faisal Sayed");
        System.out.println("String Buffer(sb) ->"+sb);
        System.out.println("Size of String Buffer(sb) ->"+sb.capacity());
        System.out.println("String Buffer(sb) Address ->"+System.identityHashCode(sb));
        
        
        StringBuilder sbd = new StringBuilder("Faisal Sayed");
        System.out.println("String Builder(sbd) Address ->"+System.identityHashCode(sbd));
    }
}
