package Chapter2;

/*
   This program attempts to declared a variable
   in an inner scope with the same name as one
   defined in an outer scope.

   *** This program will not compile. ***
*/
class NestVar {
    public static void main(String args[]) {
        int count;

        for(count = 0; count < 10; count = count+1) {
            System.out.println("This is count: " + count);

            //int count; // illegal!!!
            for(int count1 = 0; count1 < 2; count1++)
                System.out.println("This program is in error!");
        }
    }
}