package com.objlove.web.liao;

class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + " ----> join \t" + i);
        }
    }
}

public class Class1 {

    public static void main(String[] args) throws InterruptedException {
        new JoinThread("新线程").start();
        for (int i = 0; i < 1000; i++) {
            if (i == 5) {
                JoinThread h = new JoinThread("hhhhhhhhh");
                h.start();
                h.join();
            }
            System.out.println(Thread.currentThread().getName() + " 00000000000 \t " + i);

        }

    }

}


