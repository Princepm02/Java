public class compareStrings {
    public static void main(String args[]) {
        String name1 = "Tony";
        String name2 = "Tony";

        /* equals(): Checks if two strings have the exact same characters (case-sensitive).
                     Returns true if they are the same, false otherwise. */

        if (name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        // DO NOT USE == to check for string equality
        // Gives correct answer here
        if (name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        // Gives incorrect answer here
        if (new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        /*
        compareTo(): Compares two strings lexicographically (dictionary order). Returns:
                    0: if the strings are equal.
                    Negative value: if the first string comes before the second.
                    Positive value: if the first string comes after the second.
        */

        String str1 = "Apple";
        String str2 = "Apple";
        String str3 = "Banana";
        String str4 = "Ant";
        String str5 = "apple";

        System.out.println(str1.compareTo(str2)); // Output: 0 (equal)
        System.out.println(str1.compareTo(str3)); // Output: -1 (Apple comes before Banana)
        System.out.println(str3.compareTo(str1)); // Output: 1 (Banana comes after Apple)
        System.out.println(str1.compareTo(str4)); // Output: 1 (Apple comes after Ant)
        System.out.println(str1.compareTo(str5)); // Output: -32 (case-sensitive, 'A' has a smaller Unicode value than 'a')

    }

}
