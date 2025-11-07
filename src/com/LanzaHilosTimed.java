package com;


public class LanzaHilosTimed {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                // El hilo se bloquea en TIMED_WAITING durante 2 s.
                Thread.sleep(2000);
            } catch (InterruptedException ignored) { }
        }, "tiempo");

        t.start();                     // h comienza a ejecutarse
        Thread.sleep(50);              // le damos tiempo para entrar en sleep
        //Thread.sleep(10);  // Muy poco tiempo, muy probable que todavía esté en sleep
        System.out.println(t.getName() + " -> " + t.getState()); // TIMED_WAITING o RUNNABLE según el timing
    }
}

