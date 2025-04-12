public class StringVsBuilderBuffer {
    public static void main(String[] args) {

        /*
         - String is immutable. Once a String object is created, its value cannot be changed.
         - Any operation that appears to modify a String actually creates a new String object.
         - This makes String objects inherently thread-safe.
        */
        String str = "Hello";
        System.out.println("Original String: " + str);
        str = str + " World"; // A new String object is created
        System.out.println("Modified String: " + str);

        /*
         StringBuilder is mutable. You can modify the content of a StringBuilder object
         without creating a new object. It is not thread-safe, making it faster for
         single-threaded operations.
        */
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + sb);
        sb.append(" World"); // The existing StringBuilder object is modified
        System.out.println("Modified StringBuilder: " + sb);

        /*
         StringBuffer is mutable, similar to StringBuilder. However, StringBuffer is
         synchronized, making it thread-safe. This synchronization comes with a performance
         overhead, so StringBuilder is generally preferred in single-threaded scenarios.
        */
        StringBuffer sbuf = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + sbuf);
        sbuf.append(" World"); // The existing StringBuffer object is modified
        System.out.println("Modified StringBuffer: " + sbuf);
    }
}
