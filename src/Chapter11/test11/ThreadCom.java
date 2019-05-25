package Chapter11.test11;
//listing 11
// No calls to wait() or notify().
class TickTock {

    String state; // contains the state of the clock

    synchronized void tick(boolean running) {
        if (!running) { // stop the clock
            state = "ticked";
            return;
        }
        System.out.print("Tick ");
        state = "ticked"; // set the current state to ticked
    }

    synchronized void tock(boolean running) {
        if (!running) { // stop the clock
            state = "tocked";
            return;
        }
        System.out.print("Tock ");
        state = "tocked"; // set the current state to tocked
    }
}


class MyThread implements Runnable {
    Thread thrd;
    TickTock ttOb;

    // Construct a new thread.
    MyThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
    }

    // A factory method that creates and starts a thread.
    public static MyThread createAndStart(String name, TickTock tt) {
        MyThread myThrd = new MyThread(name, tt);

        myThrd.thrd.start(); // start the thread
        return myThrd;
    }

    // Entry point of thread.
    public void run() {

        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) ttOb.tick(true);
            ttOb.tick(false);
        } else {
            for (int i = 0; i < 5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

class ThreadCom {
    public static void main(String args[]) {
        TickTock tt = new TickTock();
        MyThread mt1 = MyThread.createAndStart("Tick", tt);
        MyThread mt2 = MyThread.createAndStart("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}