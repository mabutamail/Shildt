package Chapter5;

// listing 19 Demonstrate String arrays.
class StringArrays {
    public static void main(String args[]) {
        String strs[] = {"This", "is", "a", "test2."};

        System.out.println("Original array: ");
        for (String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");

        // change a string
        strs[1] = "was";
        strs[3] = "test2, too!";

        System.out.println("Modified array: ");
        for (String s : strs)
            System.out.print(s + " ");
    }
}