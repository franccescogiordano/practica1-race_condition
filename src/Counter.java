import java.util.concurrent.atomic.AtomicInteger;

class Counter implements Runnable {
    private AtomicInteger c = new AtomicInteger(0);

    public void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c.getAndIncrement();
    }

    public void decrement() {
        c.getAndDecrement();
    }

    public int getValue() {
        return c.get();
    }

    @Override
    public void run() {
        // incrementing
        this.increment();
        System.out.println("valor despues de incrementar " + Thread.currentThread().getName() + " " + this.getValue());
        // decrementing
        this.decrement();
        System.out.println(" ultimo valor al final" + Thread.currentThread().getName() + " " + this.getValue());
    }
}
