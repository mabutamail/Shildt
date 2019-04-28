package Chapter3;

// Demonstrate the switch without break statements.
class NoBreak {
    public static void main(String args[]) {
        int i;

        for (i = 0; i <= 1; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is less than one");
                    //break;
                case 1:
                    System.out.println("i is less than two");
                    //break;
                case 2:
                    System.out.println("i is less than three");
                    //break;
                case 3:
                    System.out.println("i is less than four");
                    //break;
                case 4:
                    System.out.println("i is less than five");
                    //break;
            }
            System.out.println();
        }
    }
}