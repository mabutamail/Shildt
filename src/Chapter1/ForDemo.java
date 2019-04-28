package Chapter1;

/*listing 6
  Demonstrate the for loop. 
 
  Call this file Chapter1.ForDemo.java.
*/
class ForDemo {
    public static void main(String args[]) {
        int count;

        for(count = 0; count < 5; count = count+1)
            System.out.println("This is count: " + count);

        System.out.println("Done!");
    }
}