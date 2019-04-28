package Chapter3;

// Guess the letter game, 3rd version.
class Guess3 {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char) System.in.read(); // get a char

        if(ch == answer) System.out.println("** Right **" + " " + (int)ch);
        else {
            System.out.print("...Sorry, you're ");

            // a nested if
            if(ch < answer) System.out.println("too low" + " " + (int)ch);
            else System.out.println("too high" + " " + (int)ch);
        }
    }
}