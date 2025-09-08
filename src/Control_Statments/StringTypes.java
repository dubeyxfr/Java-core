package Control_Statments;

public class StringTypes {
    public static void main(String[] args) {
        // String (Immutable)
        String str = "Java";
        str.concat(" Rocks");
        System.out.println("String: " + str); // Java

        // StringBuilder (Mutable)
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Rocks");
        System.out.println("StringBuilder: " + sb); // Java Rocks

        // StringBuffer (Mutable + Thread-Safe)
        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Rocks");
        System.out.println("StringBuffer: " + sbf); // Java Rocks
    }
}
