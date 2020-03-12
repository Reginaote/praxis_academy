package latihann;

// java program to show Phaser Class

import java.util.concurrent.Phaser;

// A thread of execution that uses a phaser.
class MyThread implements Runnable {
    Phaser phaser;
    String title;

    public MyThread(Phaser phaser, String titleString)
    {
        this.phaser = phaser;
        this.title = title;

        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run()
    {
        System.out.println("Thread: " + title + "\nPhase One Stared");
        phaser.arriveAndAwaitAdvance();

        // Stop execution to prevent jumbled output
        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Thread: " + title + "\nPhase Two Started");
        phaser.arriveAndAwaitAdvance();

        // Stop executing to prevent jumbled output
        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }

        
    }
}