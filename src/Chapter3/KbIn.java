package Chapter3;

// Read a character from the keyboard.
class KbIn {
    public static void main(String args[])
            throws java.io.IOException {

        char ch;
        int i;

        System.out.print("Press a key followed by ENTER: ");

        i = System.in.read(); // get a char
        //ch = (char) System.in.read(); // get a char

        System.out.println("Your key is: " + (char)i + "\t\tint\t" + i);
    }
}
