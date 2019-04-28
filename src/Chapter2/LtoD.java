package Chapter2;

// Demonstate automatic conversion from long to double.
// *** This program will not compile. ***
class LtoD {
    public static void main(String args[]) {
        long L;
        double D;

        D = 100123285.0;
        L = (long)D; // Illegal!!!

        System.out.println("L and D: " + L + " " + D);

    }
}