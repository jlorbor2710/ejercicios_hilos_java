package com;

public class LanzaHilosBlocked {
    private static final Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (LOCK) {
                try { Thread.sleep(2000); } catch (InterruptedException ignored) {}
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            synchronized (LOCK) {
                System.out.println("Bloqueado: " + Thread.currentThread().getName());
            }
        }, "t2");

        t1.start();
        Thread.sleep(100);
        t2.start();
        Thread.sleep(50);
        System.out.println(t2.getName() + " -> " + t2.getState());
    }
}
