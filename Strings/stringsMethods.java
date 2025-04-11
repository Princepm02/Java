public class stringsMethods {
    public static void main(String[] args) {
        // Substring
        String name = "TonyStark";
        System.out.println(name.substring(0, 4));  // Output => Tony

        // ParseInt Method of Integer class
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);  // Output => 123

        // ToString Method of String class
        int num2 = 123;
        String str2 = Integer.toString(num2);
        System.out.println(str2.length());  // Output => 3
    }
}
