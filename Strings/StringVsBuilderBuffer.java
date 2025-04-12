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

        // Declaration of StringBuilder
        StringBuilder sb1 = new StringBuilder("Prince Mishra");
        System.out.println("StringBuilder declaration: " + sb1);

        // Get a character from a specific index
        StringBuilder sb2 = new StringBuilder("Tony");
        System.out.println("Character at index 0: " + sb2.charAt(0)); // Gets the character at index 0 -> T

        // Set a character at a specific index
        StringBuilder sb3 = new StringBuilder("Tony");
        sb3.setCharAt(0, 'P'); // Sets the character at index 0 to 'P'
        System.out.println("StringBuilder after setting character: " + sb3); // Pony

        // Insert a character at a specific index
        StringBuilder sb4 = new StringBuilder("tony");
        sb4.insert(0, 'S'); // Inserts the character 'S' at index 0 -> STony
        System.out.println("StringBuilder after insertion: " + sb4);

        // Delete characters within a specified range
        StringBuilder sb5 = new StringBuilder("tony");
        sb5.insert(0, 'S');
        System.out.println("StringBuilder before deletion: " + sb5);
        sb5.delete(0, 1); // Deletes the character from index 0 (inclusive) to 1 (exclusive)
        System.out.println("StringBuilder after deletion: " + sb5);  // Tony

        // Append characters or strings to the end
        StringBuilder sb6 = new StringBuilder("Tony");
        sb6.append(" Stark"); // Appends " Stark" to the end of the StringBuilder
        System.out.println("StringBuilder after appending: " + sb6);

        // Print the length of the StringBuilder
        StringBuilder sb7 = new StringBuilder("Tony");
        sb7.append(" Stark");
        System.out.println("StringBuilder content: " + sb7);
        System.out.println("Length of StringBuilder: " + sb7.length()); // Gets and prints the length of the StringBuilder -> 10
 

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
