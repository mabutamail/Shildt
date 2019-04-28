package Chapter2;

// Demonstrate dynamic initialization.
class DynInit {
    public static void main(String[] args) {
        double radius = 4, height = 5;

        // dynamically initializ volume
        double volume = 3.1415926 * radius * radius * height;

        System.out.println("Volume is " + volume);
    }
}
