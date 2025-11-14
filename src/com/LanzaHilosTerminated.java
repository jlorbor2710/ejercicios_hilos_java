package com;

public class LanzaHilosTerminated {
	public static void main(String [] args) throws InterruptedException {
		Thread t = new Thread(new Hilo("finalizado"));
		t.start();
		t.join();
		System.out.println(t.getName() + " ---> " + t.getState());
	}

}