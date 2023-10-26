public class main {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread t1 = new Thread(counter, "T1");

        Thread t2 = new Thread(counter, "T2");

        Thread t3 = new Thread(counter, "T3");

        t1.start();

        t2.start();

        t3.start();
    }
}
