package Chapter3;

// Demonstrate the while loop.
class WhileDemo {
    public static void main(String args[]) {
        char ch;

        // print the alphabet using a while loop
        ch = 'A';
        while (ch <= 'z') {
            System.out.print(ch);
            ch++;
        }
    }
}