package latihan;

public class MsLunch {
    private long c1 = 0;
    private long c2 = 0;
    private Object lock1 = new Object();

    public void inc1() {
        synchronized(lock1) {
            c1++;

        }
    }

    public void inc2() {
        synchronized(lock1) {
            c2++;
        }
    }

}