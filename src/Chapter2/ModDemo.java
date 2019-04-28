package Chapter2;

// Demonstrate the % operator.
class ModDemo {
    public static void main(String args[]) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("Result and remainder of 10\t/3: \t" +
                iresult + " \t\t\t\t\t" + irem);
        System.out.println("Result and remainder of 10.0/3.0: \t" +
                dresult + " \t" + drem);

    }
}