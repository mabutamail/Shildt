package Chapter11.test5isAlive;

//listing 4
// Create multiple threads.

class MyThread implements Runnable {
    Thread thrd;

    // Construct a new thread.
    MyThread(String name) {
        thrd = new Thread(this, name);
    }

    // A factory method that creates and starts a thread.
    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);

        myThrd.thrd.start(); // start the thread
        return myThrd;
    }

    // Entry point of thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(10);
                System.out.println("In " + thrd.getName() +
                        ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

