package Chapter3;

// Demonstrate the do-while loop.
class DWDemo {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, ignore;
//        ch = (char) System.in.read();
//        System.out.println(ch);

        do {
            System.out.print("Press a key following by ENTER: ");
            ch = (char) System.in.read(); // get a char
//            do {
//                ignore = (char) System.in.read();
//                System.out.println(ignore);
//            } while (ignore != '\n');
            System.out.println(ch);
        } while(ch != 'q');
    }
}
